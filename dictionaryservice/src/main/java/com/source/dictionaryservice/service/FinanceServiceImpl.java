package com.source.dictionaryservice.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.source.dictionaryservice.model.TransactionDO;
import com.source.dictionaryservice.utils.TransactionUtils;

@Service
public class FinanceServiceImpl implements FinancialService {

	Logger logger = LoggerFactory.getLogger(FinanceServiceImpl.class);

	@Value("${load.txn.path}")
	private String txnFilePath;

	@Override
	public List<TransactionDO> loadTxns() throws FileNotFoundException, IOException {
		List<TransactionDO> txns = null;
		List<String> txnDataAsString = TransactionUtils.loadTxnFromFile(txnFilePath);
		txns = TransactionUtils.convertToTxnDO(txnDataAsString);
		return txns;
	}

	@Override
	public List<TransactionDO> searchTxnBetweenDates(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionDO> searchTxn(String searchKey) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		List<TransactionDO> listOfTransaction = null;
		logger.info("Search Text is ", searchKey);
		if (searchKey.equals("ALL"))
			return loadTxns();

		listOfTransaction = loadTxns().stream()
				.filter(txnData -> txnData.getTxnDesc().toLowerCase().contains(searchKey.toLowerCase()))
				.collect(Collectors.toList());
		logger.info("Search Result Size is ", listOfTransaction.size());
		return listOfTransaction;
	}

}

package com.practice.algorithm.finance;

import java.util.Date;
import java.util.List;

public class TransactionImpl implements TransactionInterface{

	@Override
	public List<TransactionDO> loadTxns(String filePath) {
		List<TransactionDO> txns = null;
		List <String> txnDataAsString = TransactionUtils.loadTxnFromFile(filePath);
		txns = TransactionUtils.convertToTxnDO(txnDataAsString);
		return txns;
	}
	@Override
	public List<TransactionDO> searchTxnBetweenDates(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<TransactionDO> searchTxn(String searchKey) {
		// TODO Auto-generated method stub
		return null;
	}

}

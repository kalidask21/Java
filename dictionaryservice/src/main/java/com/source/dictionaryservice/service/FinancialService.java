package com.source.dictionaryservice.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.source.dictionaryservice.model.TransactionDO;


public interface FinancialService {

	List<TransactionDO> loadTxns() throws FileNotFoundException, IOException;

	List<TransactionDO> searchTxnBetweenDates(Date fromDate, Date toDate);

	List<TransactionDO> searchTxn(String searchKey) throws FileNotFoundException, IOException;

}

package com.practice.algorithm.finance;

import java.util.Date;
import java.util.List;

public interface TransactionInterface {

    List<TransactionDO> loadTxns(String filePath);
	
	List<TransactionDO> searchTxnBetweenDates(Date fromDate , Date toDate);
	
	List<TransactionDO> searchTxn(String searchKey);
	
}

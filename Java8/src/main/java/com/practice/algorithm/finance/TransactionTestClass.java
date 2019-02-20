package com.practice.algorithm.finance;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class TransactionTestClass {

	TransactionInterface txnInfServ = null;
	String fileLoc = "C:\\PerDev\\git\\Java\\AMEX.txt";
	
	@Before
	public void setup(){
		txnInfServ = new TransactionImpl();
	}
	
	@Test
	public void LoadTxnFromFile() {
		List<String> response = TransactionUtils.loadTxnFromFile(fileLoc);
		assertNotNull(response);
		assertTrue(!response.isEmpty());
	}
	
	@Test
	public void LoadTxns() {
		List<TransactionDO> Txns = txnInfServ.loadTxns(fileLoc);
		assertNotNull(Txns);
		assertTrue(!Txns.isEmpty());
		printTxn(Txns);
	}
	
	private void printTxn(List<TransactionDO> Txns){
		TransactionUtils.printTxn(Txns);
	}
	
	
	@AfterAll
	public void after(){
		txnInfServ = null;
	}
}

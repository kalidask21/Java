package com.practice.algorithm.finance;

import static org.junit.Assert.assertNotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class TransactionUtils {

	private TransactionUtils() {

	}
	
	final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");

	public static List<String> loadTxnFromFile(String filePath) {
		File file = new File(filePath);
		List<String> txnData = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String stream = null;
			while((stream = br.readLine()) != null) {
				txnData.add(stream);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return txnData;	
	}

	public static List<TransactionDO> convertToTxnDO(List<String> txnData) {
		List<TransactionDO> listTxns = new ArrayList<>();
		if(null != txnData && !txnData.isEmpty()) {
			listTxns = txnData.stream().map(txnrecord -> 
			new TransactionDO(
					txnrecord.split("-#-")[0],
					txnrecord.split("-#-")[1],
					txnrecord.split("-#-")[2],
					Double.valueOf(txnrecord.split("-#-")[3]))).collect(Collectors.toList());
		}
		return listTxns;
	}
	
	public static void printTxn(List<TransactionDO> txnData) {
		txnData.forEach(txnObj ->{
			System.out.println(txnObj.toString());
		});
	}
}


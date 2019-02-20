package com.source.dictionaryservice.controller;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.source.dictionaryservice.exception.CustomResponseEntityExceptionHandler;
import com.source.dictionaryservice.model.TransactionDO;
import com.source.dictionaryservice.service.FinanceServiceImpl;
import com.source.dictionaryservice.service.FinancialService;
import com.source.dictionaryservice.utils.TransactionResponse;
import com.source.dictionaryservice.utils.TransactionUtils;

@RestController
public class MyFinanceController {

	Logger logger = LoggerFactory.getLogger(MyFinanceController.class);

	@Value("${load.txn.path}")
	private String txnFilePath;

	@Autowired
	private FinancialService financeServiceImpl;

	@GetMapping("/finance/txn/bank/{bankName}/search")
	public ResponseEntity<TransactionResponse> loadTransactions(@PathVariable("bankName") String bankName,
			@RequestParam(name = "text", defaultValue = "ALL", required = true) String searchText,
			@RequestParam(name = "fromDate", required = false) String fromDate,
			@RequestParam(name = "toDate", required = false) String toDate) throws Throwable {

		
		TransactionResponse transactionResponse = null;
		Integer noofTransctions = 0;
		Double amountSpend = 0.0;
		List<TransactionDO> transactionResult;
		transactionResult = financeServiceImpl.searchTxn(searchText);
		if (!transactionResult.isEmpty()) {
			noofTransctions = transactionResult.size();
			amountSpend = TransactionUtils.CalculateSpent(transactionResult);
		}

		transactionResponse = new TransactionResponse(transactionResult, noofTransctions, bankName,
				Calendar.getInstance().getTime(), "Net Spend is - " + amountSpend);

		
		return new ResponseEntity<TransactionResponse>(transactionResponse, HttpStatus.ACCEPTED);

	}

}

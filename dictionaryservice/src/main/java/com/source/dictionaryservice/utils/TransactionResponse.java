package com.source.dictionaryservice.utils;

import java.util.Date;
import java.util.List;

import com.source.dictionaryservice.model.TransactionDO;

public class TransactionResponse {
   
	private List<TransactionDO> transactionList;
	private Integer noofTransctions;
	private String bankName;
	private Date asofDate;
	private String message;
	
	
	
	public TransactionResponse(List<TransactionDO> transactionList, Integer noofTransctions, String bankName,
			Date asofDate, String message) {
		super();
		this.transactionList = transactionList;
		this.noofTransctions = noofTransctions;
		this.bankName = bankName;
		this.asofDate = asofDate;
		this.message = message;
	}
	
	
	public List<TransactionDO> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<TransactionDO> transactionList) {
		this.transactionList = transactionList;
	}
	public Integer getNoofTransctions() {
		return noofTransctions;
	}
	public void setNoofTransctions(Integer noofTransctions) {
		this.noofTransctions = noofTransctions;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Date getAsofDate() {
		return asofDate;
	}
	public void setAsofDate(Date asofDate) {
		this.asofDate = asofDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}

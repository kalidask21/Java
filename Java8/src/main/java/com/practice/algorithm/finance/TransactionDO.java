package com.practice.algorithm.finance;

public class TransactionDO {

	private String txnDate;
	private String txnDay;
	private String txnDesc;
	private Number txnAmount;
	
	public TransactionDO(String txnDate, String txnDay, String txnDesc, Number txnAmount) {
		super();
		this.txnDate = txnDate;
		this.txnDay = txnDay;
		this.txnDesc = txnDesc;
		this.txnAmount = txnAmount;
	}
	
	
	@Override
	public String toString() {
		return "TransactionDO [txnDate=" + txnDate + ", txnDay=" + txnDay + ", txnDesc=" + txnDesc + ", txnAmount="
				+ txnAmount + "]";
	}


	public String getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}
	public String getTxnDay() {
		return txnDay;
	}
	public void setTxnDay(String txnDay) {
		this.txnDay = txnDay;
	}
	public String getTxnDesc() {
		return txnDesc;
	}
	public void setTxnDesc(String txnDesc) {
		this.txnDesc = txnDesc;
	}
	public Number getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(Number txnAmount) {
		this.txnAmount = txnAmount;
	}
	
	
}

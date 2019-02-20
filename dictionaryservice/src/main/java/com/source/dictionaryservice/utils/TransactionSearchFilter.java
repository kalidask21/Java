package com.source.dictionaryservice.utils;

import java.util.Date;

public class TransactionSearchFilter {

	private String byCardNo;
	private String ByBankName;
	private String byAmount;
	private Date byDate;
	
	public TransactionSearchFilter(String byCardNo, String byBankName, String byAmount, Date byDate) {
		super();
		this.byCardNo = byCardNo;
		ByBankName = byBankName;
		this.byAmount = byAmount;
		this.byDate = byDate;
	}
	
	public String getByCardNo() {
		return byCardNo;
	}
	public void setByCardNo(String byCardNo) {
		this.byCardNo = byCardNo;
	}
	public String getByBankName() {
		return ByBankName;
	}
	public void setByBankName(String byBankName) {
		ByBankName = byBankName;
	}
	public String getByAmount() {
		return byAmount;
	}
	public void setByAmount(String byAmount) {
		this.byAmount = byAmount;
	}
	public Date getByDate() {
		return byDate;
	}
	public void setByDate(Date byDate) {
		this.byDate = byDate;
	}
	
	@Override
	public String toString() {
		return "TransactionSearchFilter [byCardNo=" + byCardNo + ", ByBankName=" + ByBankName + ", byAmount=" + byAmount
				+ ", byDate=" + byDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ByBankName == null) ? 0 : ByBankName.hashCode());
		result = prime * result + ((byAmount == null) ? 0 : byAmount.hashCode());
		result = prime * result + ((byCardNo == null) ? 0 : byCardNo.hashCode());
		result = prime * result + ((byDate == null) ? 0 : byDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionSearchFilter other = (TransactionSearchFilter) obj;
		if (ByBankName == null) {
			if (other.ByBankName != null)
				return false;
		} else if (!ByBankName.equals(other.ByBankName))
			return false;
		if (byAmount == null) {
			if (other.byAmount != null)
				return false;
		} else if (!byAmount.equals(other.byAmount))
			return false;
		if (byCardNo == null) {
			if (other.byCardNo != null)
				return false;
		} else if (!byCardNo.equals(other.byCardNo))
			return false;
		if (byDate == null) {
			if (other.byDate != null)
				return false;
		} else if (!byDate.equals(other.byDate))
			return false;
		return true;
	}
	
	
	
}

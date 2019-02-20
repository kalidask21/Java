package com.practice.algorithm.practice.effectivejava;

import java.util.Comparator;

public class PhoneNo implements Comparable<PhoneNo>,PhoneFormat {

	private final Comparator<PhoneNo> COMPARATOR = getComparator();
	
	private String areaCode;
	private String prefix;
	private String LineNo;
	
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getLineNo() {
		return LineNo;
	}
	public void setLineNo(String lineNo) {
		LineNo = lineNo;
	}

	private  static Comparator<PhoneNo> getComparator() {
		 Comparator<PhoneNo> result = Comparator.comparing(PhoneNo::getAreaCode).thenComparing(PhoneNo::getPrefix).thenComparing(PhoneNo::getLineNo);
	    return result;
	}
	public int compareTo(PhoneNo o) {
		// TODO Auto-generated method stub
		return COMPARATOR.compare(this, o);
	}
	public PhoneNo(String areaCode, String prefix, String lineNo) {
		super();
		this.areaCode = areaCode;
		this.prefix = prefix;
		LineNo = lineNo;
	}
	@Override
	public String toString() {
		return "PhoneNo [areaCode=" + areaCode + ", prefix=" + prefix + ", LineNo=" + LineNo + "]";
	}
	@Override
	public String getFullNumber() throws NumberFormatException {
		// TODO Auto-generated method stub
		return this.areaCode + this.prefix + this.LineNo;
	}
	@Override
	public String getFullNumberUSFormat() throws NumberFormatException {
		// TODO Auto-generated method stub
		return this.areaCode +"-"+ this.prefix +"-"+ this.LineNo;
	}
	
	
	
	
}
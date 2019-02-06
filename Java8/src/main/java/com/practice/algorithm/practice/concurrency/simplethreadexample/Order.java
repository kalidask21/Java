package com.practice.algorithm.practice.concurrency.simplethreadexample;

public class Order {

	public String OrderName;
	public int tableId;
	
	public Order(String orderName, int tableId) {
		super();
		OrderName = orderName;
		this.tableId = tableId;
	}
	
	
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	
	


}

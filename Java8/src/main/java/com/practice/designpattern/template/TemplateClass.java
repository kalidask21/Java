package com.practice.designpattern.template;

public abstract class TemplateClass {

	public final void QueryFromDB() {
		System.out.println("Queries");
		createConnection();
		CreateSQLQueries();
		retrievFromDB();
		flush();
	}
	private void createConnection() {
		System.out.println("createConnection");
	}
	public abstract void CreateSQLQueries();
	
	public abstract void retrievFromDB();
	
	private void flush() {
		System.out.println("flush");
	}
	
}

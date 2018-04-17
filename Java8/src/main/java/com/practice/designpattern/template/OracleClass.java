package com.practice.designpattern.template;

public class OracleClass extends TemplateClass{

	@Override
	public void CreateSQLQueries() {
		// TODO Auto-generated method stub
		System.out.println("Created Oracle Queries");
	}

	@Override
	public void retrievFromDB() {
		// TODO Auto-generated method stub
		System.out.println("retrievFromDB from  Oracle Queries");
	}

}

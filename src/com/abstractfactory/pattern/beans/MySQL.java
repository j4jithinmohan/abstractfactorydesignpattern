package com.abstractfactory.pattern.beans;

public class MySQL implements Database {

	@Override
	public void getConnection() {
		System.out.println("MySQL db connected");
	}

}

package com.abstractfactory.pattern.beans;

public class Oracle implements Database {

	@Override
	public void getConnection() {
		System.out.println("Oracle db connected");
	}

}

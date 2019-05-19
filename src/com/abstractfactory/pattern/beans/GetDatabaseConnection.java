package com.abstractfactory.pattern.beans;

import com.abstractfactory.pattern.factory.DatabaseFactory;
import com.abstractfactory.pattern.factory.MySQLFactory;

public class GetDatabaseConnection {

	public static void main(String args[]) {
		Database database = DatabaseFactory.getConnection(new MySQLFactory());
		database.getConnection();
	}
}

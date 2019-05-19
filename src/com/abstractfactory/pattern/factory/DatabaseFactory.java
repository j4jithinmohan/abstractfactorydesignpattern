package com.abstractfactory.pattern.factory;

import com.abstractfactory.pattern.beans.Database;

public class DatabaseFactory {

	public static Database getConnection(DatabaseAbstractFactory daf) {
		return daf.createConnection();
	}
}

package com.abstractfactory.pattern.factory;

import com.abstractfactory.pattern.beans.Database;
import com.abstractfactory.pattern.beans.MySQL;

public class MySQLFactory implements DatabaseAbstractFactory {

	@Override
	public Database createConnection() {
		return new MySQL();
	}

}

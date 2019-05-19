package com.abstractfactory.pattern.factory;

import com.abstractfactory.pattern.beans.Database;
import com.abstractfactory.pattern.beans.Oracle;

public class OracleFactory implements DatabaseAbstractFactory {

	@Override
	public Database createConnection() {
		return new Oracle();
	}

}

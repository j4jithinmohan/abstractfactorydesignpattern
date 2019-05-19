package com.abstractfactory.pattern.factory;

import com.abstractfactory.pattern.beans.Database;

public interface DatabaseAbstractFactory {

	public Database createConnection();
}

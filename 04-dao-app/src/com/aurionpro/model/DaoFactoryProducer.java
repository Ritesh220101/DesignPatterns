package com.aurionpro.model;

public class DaoFactoryProducer {
	static DaoFactoryProducer instance;
	
	private DaoFactoryProducer() {
	}

	public static DaoFactoryProducer getInstance() {
		if (instance == null) {
			instance = new DaoFactoryProducer();
		}
		return instance;
	}
	
	public IDaoAbstractFactory produce(String factoryType) {
		if(factoryType.equalsIgnoreCase("xml"))
			return new XMLDaoFactory();
		if(factoryType.equalsIgnoreCase("db"))
			return new DBDaoFactory();
		return null;
	}
}

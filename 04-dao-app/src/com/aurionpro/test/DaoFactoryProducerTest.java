package com.aurionpro.test;

import com.aurionpro.model.DaoFactoryProducer;
import com.aurionpro.model.IDao;
import com.aurionpro.model.IDaoAbstractFactory;

public class DaoFactoryProducerTest {
	public static void main(String[] args) {
		IDaoAbstractFactory daf = DaoFactoryProducer.getInstance().produce("xml");
		IDao dao = daf.create("emp");
		dao.save();
		
		IDaoAbstractFactory daf1 = DaoFactoryProducer.getInstance().produce("db");
		IDao dao1 = daf1.create("dept");
		dao1.save();
	}
	
}

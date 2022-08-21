package com.aurionpro.model;

import java.io.Serializable;

public class Singleton implements Serializable{
	static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
//	private Object readResolve() {
//	    return instance;
//	}
}

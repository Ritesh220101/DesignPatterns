package com.aurionpro.model;

public class SubtractOperation implements IOperation {

	@Override
	public int doOperation(int a, int b) {
		return a-b;
	}

}

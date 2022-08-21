package com.aurionpro.model;

public class StrategyOperation implements IOperation {
	IOperation operation;
	
	
	public StrategyOperation(IOperation operation) {
		super();
		this.operation = operation;
	}

	@Override
	public int doOperation(int a, int b) {
		return operation.doOperation(a, b);
	}
	
	public void setOperation(IOperation operation) {
		this.operation = operation;
	}
}

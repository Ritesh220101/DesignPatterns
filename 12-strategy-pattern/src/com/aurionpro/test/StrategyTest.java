package com.aurionpro.test;

import com.aurionpro.model.AddOperation;
import com.aurionpro.model.MultiplyOperation;
import com.aurionpro.model.StrategyOperation;
import com.aurionpro.model.SubtractOperation;

public class StrategyTest {

	public static void main(String[] args) {
		StrategyOperation operation = new StrategyOperation(new AddOperation());
		System.out.println(operation.doOperation(10, 30));
		operation.setOperation(new MultiplyOperation());
		System.out.println(operation.doOperation(10, 30));
		operation.setOperation(new SubtractOperation());
		System.out.println(operation.doOperation(10, 30));

	}

}

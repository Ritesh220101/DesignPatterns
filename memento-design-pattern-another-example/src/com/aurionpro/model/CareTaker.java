package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<>();
	
	public void add(Memento employee) {
		mementoList.add(employee);
	}
	
	public Memento get(int index) {
		return mementoList.get(index);
	}
}

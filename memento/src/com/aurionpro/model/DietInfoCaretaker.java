package com.aurionpro.model;

public class DietInfoCaretaker {
	Memento memento;
	
	public void saveState(DietInfo dietInfo) {
		memento = dietInfo.save();
	}
	
	public void restoreState(DietInfo dietInfo) {
		dietInfo.restore(memento);
	}
}

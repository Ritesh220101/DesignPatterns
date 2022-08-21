package com.aurionpro.model;

public class DietInfo {
	private String name;
	private int dayNumber;
	private int weight;

	public DietInfo(String name, int dayNumber, int weight) {
		super();
		this.name = name;
		this.dayNumber = dayNumber;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public int getWeight() {
		return weight;
	}

	public void setDayNumberAndWeight(int dayNumber, int weight) {
		this.dayNumber = dayNumber;
		this.weight = weight;
	}

	public Memento save() {
		return new Memento(name, dayNumber, weight);
	}

	public void restore(Memento memento) {
		name = memento.name;
		dayNumber = memento.dayNumber;
		weight = memento.weight;
	}

	@Override
	public String toString() {
		return "DietInfo [name=" + name + ", dayNumber=" + dayNumber + ", weight=" + weight + "]";
	}
	
	
	
}

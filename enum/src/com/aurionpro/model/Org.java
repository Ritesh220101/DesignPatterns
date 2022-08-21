package com.aurionpro.model;

public enum Org {
	PRX(4), LIQUID(10), OG(3), NAVI(2), FAZE(1), FPX(5);

	public int value;

	Org(int value) {
		this.value = value;
	}

	public static void print() {
		for (Org o : Org.values()) {
			System.out.println(o + " " + o.value);
		}
	}
}

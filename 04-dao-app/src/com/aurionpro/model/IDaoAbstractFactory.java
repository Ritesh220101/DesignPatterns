package com.aurionpro.model;

public interface IDaoAbstractFactory {
	IDao create(String type);
}

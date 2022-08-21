package com.aurionpro.test;

import java.lang.reflect.Method;

import com.aurionpro.model.Custom;
import com.aurionpro.model.Important;

public class CustomTest {

	public static void main(String[] args) {
		Custom ann = new Custom();
		Method[] methods = ann.getClass().getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(Important.class)) {
				System.out.println(method.getName());
			}
		}
	}

}

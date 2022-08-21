package com.aurionpro.model;
//This pattern involves an interface which acts as a bridge which makes
//the functionality of concrete classes independent from interface implementer classes.
//bridge pattern is used to decouple an abstraction from its implementation so that the two can vary independently.
public interface IDraw {
	String fill();
}

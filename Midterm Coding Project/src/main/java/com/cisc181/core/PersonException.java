package com.cisc181.core;

public class PersonException extends Exception{
	private Person PersonState;
	
	public PersonException() {
	}
	public PersonException(String message, Person a) {
		super(message);
		this.PersonState = a;
	}
	public Person getPersonState() {
		return PersonState;
	}
}
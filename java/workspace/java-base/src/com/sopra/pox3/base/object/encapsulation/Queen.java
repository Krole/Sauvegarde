package com.sopra.pox3.base.object.encapsulation;

public class Queen {

	String name; //public pour que name soit accessible par les autres package

	public Queen(String name) {
		super();
		this.name = name;
	}

	public String getName() { //alt shift s : puis generate getter and setter
		return name;
	}


}

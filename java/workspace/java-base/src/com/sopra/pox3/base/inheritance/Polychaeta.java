package com.sopra.pox3.base.inheritance;

public class Polychaeta extends MultipleCellular {

	String head = "[(= ! =)]";
	
	public Polychaeta(int count) {
		super(count); //possibilité de dire que tous lespolych ont 500cell (dans super(500) et enlever le int count
	}
	
	public String gethead(){
		return head;
	}
	
	
}

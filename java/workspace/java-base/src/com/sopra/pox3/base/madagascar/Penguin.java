package com.sopra.pox3.base.madagascar;

public class Penguin extends Bird implements CanSlide, Comparable<Penguin> {

	String name;  //classe comme les autres
	Integer velocity =24 ;  //primitive int; integer = wrap
	//Abilities pAbility;
	
	

	public Penguin(String pName, int pVelocity) {
		this (pName); //appelle le constructeur plutôt que le paramètres
		this.velocity = pVelocity;

	}
	
	public Penguin (String name){
		if (name.isEmpty()){
			throw new IllegalArgumentException("Empty name Penguin");//validation
		}
		this.name = name;
	}
	
	public void slide (){
		System.out.println("Yahou!!! at " + velocity + "km/h");
	}
	
	
	
	@Override
	public String toString() {
		return  name + ": velocity=" + velocity;
	}

	@Override
	public int compareTo(Penguin other) {
		return this.name.compareTo(other.name);
	}



	
	

}

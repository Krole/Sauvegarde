package com.sopra.pox3.base.collection;

import java.util.Iterator;
import java.util.List;

import com.sopra.pox3.base.madagascar.Penguin;

public class PenguinTeam {

	//int count = 0;

	List<Penguin> penguins = new CircularList<>();
	Iterator<Penguin> iterator ; 

	public PenguinTeam(Penguin[] allPenguins) {

		/*
		 * for (int i = 0; i < allPenguins.length ; i++){
		 * penguins.add(allPenguins[i]); } ==> même chose que le for du dessous
		 */

		for (Penguin p : allPenguins) {
			this.penguins.add(p);
		}
		
		iterator = this.penguins.iterator();

	}
	 int count;
	 Penguin next(){
		 return this.iterator.next();
	 }

	public List<Penguin> getPenguins() {
		return penguins;
	}


	
	
	

}

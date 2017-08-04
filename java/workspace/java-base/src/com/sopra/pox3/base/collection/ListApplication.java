package com.sopra.pox3.base.collection;

import java.util.List;

import com.sopra.pox3.base.madagascar.Penguin;

public class ListApplication {

	public static void main(String[] args) {
		
		new ListApplication().init();

	}
	
	void init(){
		
		Penguin skipper = new Penguin("Skipper");
		Penguin kowalski = new Penguin("Kowalski");
		Penguin rico = new Penguin("Rico");
		Penguin soldat = new Penguin("Soldat");
		
		Penguin[] allPenguins = {skipper, kowalski, rico, soldat} ;
		
		PenguinTeam team = new PenguinTeam(allPenguins);

		//System.out.println(team.penguins);
		
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		System.out.println(team.next());
		
		List<Penguin> penguins = team.getPenguins();
		//System.out.println(penguins);

	}

}

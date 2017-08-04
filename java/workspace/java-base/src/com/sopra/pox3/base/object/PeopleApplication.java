package com.sopra.pox3.base.object;

import java.util.Arrays;

import com.sopra.pox3.base.object.encapsulation.Queen;

public class PeopleApplication {

	public static void main(String[] args) {
		People john = new People("John", 12);
		People jack = new People( "Jack", 14);
		System.out.println(john.maxAge);
		System.out.println(jack.maxAge);
		
		System.out.println(People.maxAge);
		//People.maxAge++; (ne fonctionne plus car on a mis final dans la classe people
		System.out.println(People.maxAge);
		
		final People ada = new People("ada", 30);
		ada.name = "Lovelace";
		System.out.println(ada.name);
		//ada = jack;
		
		Queen liza = new Queen("Elizabeth");
		System.out.println(liza.getName());
		
		Emperor napoleon = new Emperor("Napoleon");
		napoleon.commandAll(Arrays.asList(john, jack));
		
	}

}

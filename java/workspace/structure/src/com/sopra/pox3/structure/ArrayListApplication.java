package com.sopra.pox3.structure;

import java.util.ArrayList;

public class ArrayListApplication {

	public static void main(String[] args) {
		
		ArrayList<String> nameList = new ArrayList<>();
		//pour dire qu'on va mettre des string dans la variable nameList = add. Arraylist est un tableau
		//pour créer un pointeur dans java il suffit de faire new pour préparer un espace mémoire
		//Le arraylist est un wrappeur (tableau virtuel) qui enrobe notre tableau de base
		
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		nameList.add("Jo");
		nameList.add("Jack");
		nameList.add("John");
		nameList.add("Jim");
		
		System.out.println(nameList);
	}

}

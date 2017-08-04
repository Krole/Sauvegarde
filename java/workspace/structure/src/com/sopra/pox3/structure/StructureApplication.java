package com.sopra.pox3.structure;

import java.util.Arrays; //apaprait apres le ctrl+space sur array to string

public class StructureApplication {

	public static void main (String [] args){ 
		//obligatoire pour commencer dans la fonction principale
		/*void parce que ne renvoie rien. Statique car si dynamique il faut creer un objet...Cf plus tard
		 * string args = les arguments qu'on va executer*/
		
		//System.out.println("Hello World" +args [0]);
		
		String [] names = {"Jo", "Jack", "John", "Jim"};
		
		System.out.println(Arrays.toString(names)); 
		//affiche le tableau sans le parcourir. Le to string sert pour les chaines de caract
		//names[4] = "Jane"; ne fonctionne pas ici, il faut préparer l'espace mémoire
		
		
	} 
	
}

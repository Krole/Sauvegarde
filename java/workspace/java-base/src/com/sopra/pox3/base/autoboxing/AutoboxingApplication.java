package com.sopra.pox3.base.autoboxing;

import java.util.Arrays;
import java.util.List;

public class AutoboxingApplication {

	public static void main(String[] args) {
		
		new AutoboxingApplication().init();
		
		new AutoboxingApplication().compare();
		
		new AutoboxingApplication().itsATrap();
		List<Boolean> list = new AutoboxingApplication().getTruths();
		System.out.println(list);
		System.out.println(list.get(0).compareTo(false));//si on ne fait pas ça, pas possible de faire des compareTO avec des primitifs

	}

	public void init(){
		
		int x = 2; //primitif
		Integer y =2; //wrappeur
		Integer z = new Integer(2);
		
		
		System.out.println( x == y);
		System.out.println( x == z);
		
		z = new Integer(x); //No autoboxing, rigoureux
		z = x; //Autoboxing, the compiler works for us mais attention, equals pour comparer des objets, pas double =
		
		
	}
	void compare(){
		Integer a = new Integer(12);
		Integer b = new Integer(12);
		
		System.out.println(a == b);//false car 2 new integer
		System.out.println("Equals : " + a.equals(b));// true
	
	}
	
	void itsATrap(){
		Integer a = 13;
		Integer b = 13;
		
		System.out.println(a == b);
		System.out.println(a.compareTo(b));// 0 quand c'est égal
		
		Integer x = 1000;
		Integer y = 1000;
		
		System.out.println(x == y); //autoboxing valable de -127 à 128! x et y sont des objets donc EQUALS!!!!
		System.out.println(x.equals(y));
	}
	
	//Wrapper can specify a List. On ne peut pas faire une liste de boolean directement
	
	List<Boolean> getTruths(){
		
		return Arrays.asList(true, false, false, true, false, true); //... = creation de tableau 
		
	}
	
}

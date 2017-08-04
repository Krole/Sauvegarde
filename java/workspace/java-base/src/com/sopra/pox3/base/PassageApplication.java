package com.sopra.pox3.base;

public class PassageApplication {

	public static void main(String[] args) {
		int x = 3;
		System.out.println(x); //renvoie 3
		passage (x);
		System.out.println(x); //renvoie 3
		
		Data data = new Data ("abcd"); //on creer un objet. la fonction passage object est static mais peu importe
		System.out.println(data.value);
		passageObject (data);
		System.out.println(data.value); //pas meme comportement qu'avec des primitives!!

	}

	static void passage (int x){ //copie donc vaut 3
		x++;
		System.out.println("inside passage:" + x); //renvoie 4
	
	}
		
	static void passageObject (Data data){
		data.value += "efgh";
		System.out.println("inside passage: " + data.value); 
	}



}

class Data{
	
	String value = "value";

	public Data(String value) { //ces lignes apparaissent en faisant clic D, source, generate constructor
		super();
		this.value = value;
	}
	
	
}
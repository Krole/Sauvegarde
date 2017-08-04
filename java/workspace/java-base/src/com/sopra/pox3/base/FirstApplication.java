package com.sopra.pox3.base;

public class FirstApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		int a = 2;
		int [] array;
		Integer wrapper;
		String string = "some text";
		String otherString = new String("some text");
		String compareString = new String("some text");
		System.out.println(otherString == compareString);//pas le meme pointeur (adresse différente) donc pas égale
		System.out.println(otherString.equals(compareString)); //le equals permet de comparer le contenu
		
		String veryLastString = "some text";
		System.out.println(string.equals(veryLastString)); 
		System.out.println(string == veryLastString); //True!! donc attention au == . Equals est indispensable pour comparer les objets
		
		String x = string + 2;
		//quand on fait +, il sait qu'il va concaténer en réalité.
		
		x = x.concat("Other");
		x = string.concat(String.valueOf(2)); //revient au même que string +2
		
		int b = a + 2;
		int c = a / 0; //le int c n'aura jamais lieu car lecture de D à G. Donc on sort du programme car erreur!
		
		
		
		/*int i = 0;
		
		while (i < 10){
			String text = "line "+i;
			System.out.println(text);
			i++;
		}*/

	}

}

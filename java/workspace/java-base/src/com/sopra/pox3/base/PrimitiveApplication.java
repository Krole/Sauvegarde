package com.sopra.pox3.base;

import java.math.BigDecimal;

public class PrimitiveApplication {

	public static void main(String[] args) {
		byte x = 10 ;
		int y = 234637;
		long z = 100_456_378_000L; //L pour lui dire que c'est un long (lecture de D à G)
		
		long a = 100;
		int b =(int)a; //caste
		
		float f = 12;
		//f = 2.34; // probleme entre flottant et nb a virgule
		
		double d= 12.9635132134456151238; //attention aux chiffres à virgule, tendance à faire nawak
		System.out.println(d);
		
		BigDecimal bigDecimal = new BigDecimal(12.9635132134456151238); //evite les arrondis
		System.out.println(bigDecimal);
		
		char c = 'x'; //pas de double quote sinon c'est une string!!
		
		boolean test = ! (3 > 2 && (c !='x') || (2>3)); //tjrs double & 
		System.out.println(test);
		
		y = 8;
		int move = y >> 1; //décale d'un cran en binaire, donc pase de 8 à 4, de 8 à 16 selon dans quel sens on pousse.
		System.out.println(move);
		move = y << 1;
		System.out.println(move); //renvoie 16. Si on met << 2, renvoie 32
		

	}

}

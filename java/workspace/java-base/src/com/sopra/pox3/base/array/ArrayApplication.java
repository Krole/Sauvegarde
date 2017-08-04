package com.sopra.pox3.base.array;

import java.util.Arrays;

public class ArrayApplication {

	public static void main(String[] args) {
		
		int [] ints = new int [3];
		ints [0] = 21;
		System.out.println( Arrays.toString(ints)); //arrays pour tableau et tostring pour que le retour soit les chiffres et non l'adresse du tableau
		
		int [] faster = {3, 45, 10};
		System.out.println(Arrays.toString(faster));
		
		int [][] strangeMatrix = {
				{2, 3, 4},
				{34, 2, 45},
				{3, 4, 5, 6, 7, 18}
		};
		System.out.println(Arrays.toString(strangeMatrix));//fonction pas adapté pour tableau de tableau
		
		for (int i = 0; i< faster.length; i++){
			System.out.println(faster[i]);			
		}
		
		for (int content : faster){
			System.out.println(content); //utilisation d'un iterateur, mais on perd l'index.  équilvalent à un foreach
		}
	
		for (int [] column : strangeMatrix){
			for (int cell : column){
				System.out.print(cell + " -");
			}
			System.out.println();
		}
	
	}

}

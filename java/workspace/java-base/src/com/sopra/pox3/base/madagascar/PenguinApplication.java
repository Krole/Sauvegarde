package com.sopra.pox3.base.madagascar;

public class PenguinApplication {

	public static void main(String[] args) {

		Penguin[] tabOfPenguins = { new Penguin("Skipper", 5),
				new Penguin("Kowalski", 10), 
				new Penguin("Rico", 5),
				new Penguin("Soldat", 6) };

		// new Penguin("",20);
		System.out.println("My penguin has empty name");

		// Penguin p5 = new Penguin("");
		// System.out.println(p5);

		Emperor napoleon = new Emperor("napoleon");
		System.out.println(napoleon);
		

		Emperor charlemagne = new Emperor("charlemagne");
		System.out.println(napoleon);

		
		napoleon.slide();
		napoleon.slide(tabOfPenguins[1]);// parce que j'avais fait un tableau
		charlemagne.slide(napoleon);

		System.out.println("=== Complex stuff ===");
		Penguin p = napoleon;
		p = tabOfPenguins[1];
		p = napoleon;
		System.out.println(p.getClass().getSimpleName());
		p.slide();
		
		p = charlemagne;
		napoleon.slide(p);
		
		
		
		
		/*List<Penguin> penguins = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			penguins.add(tabOfPenguins[i]);
		}

		System.out.println(penguins);

		Collections.sort(penguins);
		System.out.println(penguins);

		Collections.sort(penguins, new Comparator<Penguin>() {// classe anonyme
																// ne vit que le
																// temps de la
																// fonction

			@Override
			public int compare(Penguin p1, Penguin p2) {
				return p1.velocity.compareTo(p2.velocity);
			}
		});
		System.out.println(penguins);*/

	}
	
	
	
	
}

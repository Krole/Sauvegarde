package com.sopra.pox3.base.madagascar;

public class Emperor extends Penguin {

	public Emperor(String name) {
		super(name, 28); // quand j'h�rite, il faut appeler avec super

	}

	@Override
	public void slide() {
		// super.slide();
		System.out.println("Yeaaaaaah ");
	}

	// ici m�me fonction qui n'a pas les m�mes param�tres = surcharge
	public void slide(Penguin p) {
		System.out.println("Yeaaaaaah " + p.name);// si on met que p, on a tous
													// les para qui s'affiche
	}

	public void slide(Emperor p) { //ces 3 fonctions slide sont diff�rentes pour le compilateur
		System.out.println("Pas cool " + p);
	}
	
}

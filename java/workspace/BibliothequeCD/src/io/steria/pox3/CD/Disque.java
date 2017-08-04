package io.steria.pox3.CD;

import java.util.ArrayList;
import java.util.List;

public class Disque {
	private String name;
	private String codeBarre;
	private List<Chanson> chansons;

	public Disque(String name, String codeBarre) {
		this.name = name;
		this.codeBarre = codeBarre;
		chansons = new ArrayList<>();

	}
	
	public void afficherEntete()
	{
		System.out.println("Disque :" + name);
		System.out.println("code barre : " + codeBarre);
	}

	public void afficherDetails() {
		afficherEntete();
		for (Chanson chanson : chansons)
			chanson.afficher();
	}

	public void afficher()
	{
		afficherEntete();
	}
	
	public void ajouterChanson(Chanson chanson) {
		chansons.add(chanson);
	}
	


	public String getName() {
		return name;
	}

	public String getCodeBarre() {
		return codeBarre;
	}

	public List<Chanson> getChansons() {
		return chansons;
	}

	
	int dureetotale = 0;

	public int getDuree() {

		for (int i = 0; i < chansons.size(); i++) {
			dureetotale += chansons.get(i).getLength() + dureetotale;
		}
		return dureetotale;

		/*
		 * for (Chanson chanson : chansons) dureetotale = dureetotale +
		 * chanson.get
		 */

	}

	@Override
	public String toString() {
		return "[name=" + name + ", codeBarre=" + codeBarre + "]";
	}

}

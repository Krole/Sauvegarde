package io.steria.pox3.correction;

import java.util.ArrayList;
import java.util.List;

public class Disque
{
	private String nom;
	private String codeBarre;
	private List<Chanson> chansons;

	public Disque( String nom, String codeBarre )
	{
		this.nom = nom;
		this.codeBarre = codeBarre;
		chansons = new ArrayList<>();
	}

	public void ajouterChanson( Chanson chanson )
	{
		chansons.add( chanson );
	}

	public void afficher()
	{
		System.out.println( "Disque : " + nom );
		System.out.println( "code barre : " + codeBarre );
	}

	public void afficherDetails()
	{
		afficher();

		for( Chanson chanson : chansons )
			chanson.afficher();
	}

	public String getNom()
	{
		return nom;
	}

	public String getCodeBarre()
	{
		return codeBarre;
	}

	public List<Chanson> getChansons()
	{
		return chansons;
	}

	public int getDuree()
	{
		int compteurDuree = 0;

		for( Chanson chanson : chansons )
			compteurDuree += chanson.getDuree();

		return compteurDuree;
	}
}

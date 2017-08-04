package io.steria.pox3.correction;

public class Chanson
{
	private String nom;
	private int duree;

	public Chanson( String nom, int duree )
	{
		this.nom = nom;
		this.duree = duree;
	}

	public void afficher()
	{
		System.out.println( nom + " (" + duree + " s.)" );
	}

	public String getNom()
	{
		return nom;
	}

	public int getDuree()
	{
		return duree;
	}
}

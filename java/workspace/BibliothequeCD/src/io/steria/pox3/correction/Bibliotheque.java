package io.steria.pox3.correction;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque
{
	private List<Disque> disques;

	public Bibliotheque()
	{
		disques = new ArrayList<>();
	}

	public void ajouterDisque( Disque disque )
	{
		disques.add( disque );
	}
	
	public boolean ajoutDisque1 (Disque newDisque1){
		
		System.out.println("Creation disque");
		int chanson = Saisie.saisieInt("Combien de chanson voulez vous ajouter?");
		for (int i = 0; i < chanson; i++){
			String nom = Saisie.saisie("Nom chanson");
			int duree = Saisie.saisieInt("duree chanson");
			Chanson chanson2 = new Chanson(nom, duree);
			newDisque1.ajouterChanson(chanson2);
		}
		return true;
	}
	
	public int getNbDisque(){
		int nbDisque = this.disques.size();
		return nbDisque;
	}
	
	boolean retirerDisque1(String codeBarre){
		for (Disque disque : disques){
			if (disque.getCodeBarre().equals(codeBarre)){
				disques.remove(disque);
				System.out.println("Nb disques restants : " + getNbDisque());
				return true;
			}
		}
		System.out.println("Album inconnu");
		return false;
	}

	public Disque getDisque( String codeBarre )
	{
		for( Disque disque : disques )
		{
			String codeBarreDisque = disque.getCodeBarre();
			if( codeBarreDisque.equals( codeBarre ) )
				return disque;
		}

		return null;
	}

	public void afficherDisques()
	{
		System.out.println( "Liste des disques de la bibliothèque" );
		System.out.println( "Il y a " + disques.size() + " disque(s)" );

		for( Disque disque : disques )
			disque.afficher();
	}

	public List<Disque> getDisques()
	{
		return disques;
	}
}

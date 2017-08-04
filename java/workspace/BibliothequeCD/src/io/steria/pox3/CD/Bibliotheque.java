package io.steria.pox3.CD;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	public List<Disque> disques;

	public Bibliotheque() {
		disques = new ArrayList<>();
	}

	void ajouterDisque(Disque disque)  {
		//List<Chanson> test = rechercheChanson(disque.getCodeBarre());
		/*if (test != null && !test.isEmpty()) {

			throw new DisqueExisteDejaException(disque);
		}*/

		disques.add(disque);
	}

	/*
	 * public List<Disque> getDisc() { return disques; }
	 */

	public Bibliotheque(List<Disque> disc) {
		this.disques = disc;
	}

	public Disque getDisque(String codeBarre) {
		for (Disque disque : disques) {
			String codeBarreDisque = disque.getCodeBarre();
			if (codeBarreDisque.equals(codeBarre)) {
				return disque;
			}
		}
		return null;
	}

	/*
	 * List<Chanson> rechercheChanson (String recherche) { List<Chanson> test =
	 * new ArrayList<>();
	 * 
	 * for (int i = 0; i < disques.size(); i++ ){ Disque disqueCh=
	 * disques.get(i); test = disqueCh.getChansons(); if
	 * (recherche.equals(test)){ return test; }
	 * 
	 * } return null; }
	 */
	public List<Chanson> rechercheChanson(String recherche) {

		recherche = recherche.toLowerCase();

		List<Chanson> result = new ArrayList<>();

		for (Disque disque : disques) {

			List<Chanson> ListeChansons = disque.getChansons();

			for (Chanson chanson : ListeChansons) {

				/*
				 * if (chanson.getName().equalsIgnoreCase(recherche)) {
				 * result.add(chanson); }
				 */
				if (chanson.getName().toLowerCase().contains(recherche))
					result.add(chanson);
			}
		}
		return result;
	}

	public List<Disque> getDisques() {
		return disques;
	}

	public void setDisques(List<Disque> disques) {
		this.disques = disques;
	}

	public void afficherDisques() {
		System.out.println("Liste des disques de la bibliotheque");
		System.out.println("Il y a " + disques.size() + " disque(s)");

		for (Disque disque : disques) {
			disque.afficher();
		}

	}

	public boolean ajoutDisque(Disque newDisque) {

		System.out.println("Création du disque");
		int chansons = Saisie.saisieInt("Combien de chansons voulez vous ajouter ?");
		for (int i = 0; i < chansons; i++) {
			String nom = Saisie.saisie("Nom chanson :");
			int duree = Saisie.saisieInt("durée chanson : ");
			Chanson chanson = new Chanson(nom, duree);
			newDisque.ajouterChanson(chanson);
		}
		return true;
	}

	boolean retirerDisque(String codeBarre) {
		for (Disque disque : disques) {

			if (disque.getCodeBarre().equals(codeBarre)) {
				disques.remove(disque);
				System.out.println("Nb de disques restants : " + getNbDisque());
				return true;
			}

		}
		System.out.println("Album inconnu");
		return false;
	}

	// 6
	/*
	 * public void quit(){ System.exit(int status); }
	 */
	public int getNbDisque() {
		// int nbDisque = this.disc.get().getSize();

		int nbDisque = this.disques.size();
		return nbDisque;
	}


	/*public void sauvegarder(String path, String fileName, String codeBarre, List<Chanson> chanson){
		
		boolean utilisePrintWriter = false;
		File monFichier = new File(path);
		
		try{
			FileOutputStream fos = new FileOutputStream(monFichier);
			
			if (utilisePrintWriter)
			{
				PrintWriter pw = new PrintWriter(fos);
				
				pw.println(fileName);
				pw.println(codeBarre);
				pw.flush();
				pw.close();
			}
			else{
				OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF8");
				
				Writer out = new BufferedWriter(osw);
				out.append(fileName).append("\r\n");
				out.append(codeBarre).append("\r\n");
				
				out.flush();
				out.close();
				osw.close();
				
			}
			
			fos.close();
		}

		catch( FileNotFoundException e)
		{
			e.printStackTrace();
		}

		catch(UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}*/

}

package io.steria.pox3.CD;

import java.util.List;

public class BibliothequeApplication {

	public static void main(String[] args)  {

		Bibliotheque bibliotheque = new Bibliotheque();

		Disque disque = new Disque("Metallica", "ABCD");
		disque.ajouterChanson(new Chanson("Intro", 90));
		disque.ajouterChanson(new Chanson("IntroA", 90));
		disque.ajouterChanson(new Chanson("IntroB", 90));
		disque.ajouterChanson(new Chanson("IntroC", 90));
		bibliotheque.ajouterDisque(disque);

		Disque disque2 = new Disque("titi", "3333");
		disque.ajouterChanson(new Chanson("Intro", 90));
		disque.ajouterChanson(new Chanson("IntroD", 90));
		disque.ajouterChanson(new Chanson("IntroE", 90));
		disque.ajouterChanson(new Chanson("IntroF", 90));
		bibliotheque.ajouterDisque(disque2);

		while (true) {
			// presenter le menu
			System.out.println("1. Liste des disques");
			System.out.println("2. Détail d'un disque");
			System.out.println("3. Recherche chansons");
			System.out.println("4. Ajouter disque");
			System.out.println("5. Retirer disque");
			System.out.println("6. Ajouter disque2");
			System.out.println("8. Charger CD");
			System.out.println("Q. Quitter");

			// demander la saisie
			String saisie = Saisie.saisie("Quel est ton choix");

			// entreprendre l'action adéquate
			switch (saisie) {
			case "1":
				// lister les disques
				bibliotheque.afficherDisques();
				break;

			case "2":
				String codeBarre = Saisie.saisie("code barre stp");
				Disque disqueTrouve = bibliotheque.getDisque(codeBarre);
				if (disqueTrouve == null)
					System.out.println("il ny a pas de disque avec ce CB");
				disque.afficherDetails();
				break;

			case "3":
				String rechercheChanson = Saisie.saisie("Titre de la chanson");
				List<Chanson> chansons = bibliotheque.rechercheChanson(rechercheChanson);
				if (chansons == null || chansons.isEmpty()) {
					System.out.println("Cette chanson n'existe pas");

				} else {
					for (Chanson chanson : chansons) {
						chanson.afficher();
					}
				}

				break;

			case "4":
				String disqueAjout = Saisie.saisie("Quel disque voulez vous ajouter ? ");
				String codeBarreAjout = Saisie.saisie("son codeBarre :");
				Disque newDisque = new Disque(disqueAjout, codeBarreAjout);
				bibliotheque.ajoutDisque(newDisque);
				bibliotheque.ajouterDisque(newDisque);
				break;

			case "5":
				String disqueCherche = Saisie.saisie("nom de l'album à effacer");
				boolean disqueEfface = bibliotheque.retirerDisque(disqueCherche);
				if (disqueEfface) {
					System.out.println("Le disque a bien été retiré");
				} else {
					System.out.println("Ce disque n'existe pas");
				}

				break;

			case "6":
				String disqueAjout2 = Saisie.saisie("Quel disque voulez vous ajouter ? ");
				String codeBarreAjout2 = Saisie.saisie("son codeBarre :");
				Disque newDisque2 = new Disque(disqueAjout2, codeBarreAjout2);
				/*while (true) {
					Chanson chanson = saisirChanson();
					if (chanson != null)
						disque.ajouterChanson(chanson);
					else
						break;*/
		
				
				bibliotheque.ajoutDisque(newDisque2);
				bibliotheque.ajouterDisque(newDisque2);
				
				//new Bibliotheque().sauvegarder("titi", disqueAjout2, codeBarreAjout2, newDisque2.getChansons());
				System.out.println("Le disque a bien été ajouté");
				//}
		
				break;
								
			case "Q":
			case "q":
				// arreter l'appli
				System.exit(0);
				break;

			default:
				System.out.println("Ce choix n'existe pas");

			}
		}
	}

	private static Chanson saisirChanson() {
		String nom = Saisie.saisie("Nom de la chanson?");
		if (nom == null || nom.isEmpty())
			return null;
		int duree = Saisie.saisieInt("Quelle est la durée?");
		return new Chanson(nom, duree);

	}
	
	

}

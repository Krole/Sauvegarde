package io.steria.pox3.correction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class ApplicationBibliotheque
{
	private static final String FILE_PATH = "bibliotheque.txt";

	public static void main( String[] args )
	{
		Bibliotheque bibliotheque = new Bibliotheque();
		

		while( true )
		{
			System.out.println( "1. Liste des disques" );
			System.out.println( "2. Détail d'un disque" );
			System.out.println( "3. Sauvegarder les données" );
			System.out.println( "4. Charger les données" );
			System.out.println( "5. Ajout d'un disque" );
			System.out.println( "6. Suppression d'un disque" );
			System.out.println( "Q. Quitter" );

			String saisie = Saisie.saisie( "Quel est ton choix ?" );

			switch( saisie )
			{
				case "1":
					bibliotheque.afficherDisques();
					break;

				case "2":
					String codeBarre = Saisie.saisie( "code barre stp" );
					Disque disqueTrouve = bibliotheque.getDisque( codeBarre );
					if( disqueTrouve == null )
						System.out.println( "PAS DE DISQUE AVEC CE CB" );
					else
						disqueTrouve.afficherDetails();
					break;

				case "3":
					sauvegarderDonnees( bibliotheque );
					System.out.println( "Données sauvegardées" );
					break;

				case "4":
					chargerDonnees( bibliotheque );
					System.out.println( "Données chargées" );
					break;
					
				case"5":
					String disqueAjout1 = Saisie.saisie("Quel disque voulez vous ajouter?");
					String codeBarreAjout1= Saisie.saisie("son codeBarre:" );
					Disque newDisque1 = new Disque(disqueAjout1, codeBarreAjout1);
					bibliotheque.ajoutDisque1(newDisque1);
					bibliotheque.ajouterDisque(newDisque1);
					System.out.println("le disque a bien été ajouté");
					break;
					
				case"6":
					String disqueCherche1= Saisie.saisie("nom de l'album à effacer");
					boolean disqueEfface1 = bibliotheque.retirerDisque1(disqueCherche1);
					if (disqueEfface1){
						System.out.println("Le disque a bien été retiré");
					}else{
						System.out.println("Ce disque n'existe pas");
					}
					break;

				case "Q":
				case "q":
					System.exit( 0 );
					break;

				default:
					System.out.println( "Ce choix n'existe pas !" );
			}
		}
	}

	private static void chargerDonnees( Bibliotheque bibliotheque )
	{
		File file = new File( FILE_PATH );

		FileInputStream fis;
		try
		{
			fis = new FileInputStream( file );

			InputStreamReader isr = new InputStreamReader( fis, "UTF8" );

			BufferedReader reader = new BufferedReader( isr );

			while( true )
			{
				String nom = reader.readLine();
				if( nom == null )
					break;

				String codeBarre = reader.readLine();

				Disque disque = new Disque( nom, codeBarre );

				int nbChansons = Integer.parseInt( reader.readLine() );
				for( int i = 0; i < nbChansons; i++ )
				{
					String nomChanson = reader.readLine();
					int dureeChanson = Integer.parseInt( reader.readLine() );

					Chanson chanson = new Chanson( nomChanson, dureeChanson );
					disque.ajouterChanson( chanson );
				}

				bibliotheque.ajouterDisque( disque );
			}

			reader.close();

			isr.close();

			fis.close();
		}
		catch( FileNotFoundException e )
		{
			e.printStackTrace();
		}
		catch( UnsupportedEncodingException e )
		{
			e.printStackTrace();
		}
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}

	private static void sauvegarderDonnees( Bibliotheque bibliotheque )
	{
		try
		{
			File file = new File( FILE_PATH );

			PrintWriter writer = new PrintWriter( file, "UTF8" );

			for( Disque disque : bibliotheque.getDisques() )
			{
				writer.println( disque.getNom() );
				writer.println( disque.getCodeBarre() );
				writer.println( disque.getChansons().size() );

				for( Chanson chanson : disque.getChansons() )
				{
					writer.println( chanson.getNom() );
					writer.println( chanson.getDuree() );
				}
			}

			writer.close();
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}

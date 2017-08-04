package io.steria.pox3.clients;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.InputStream;



public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("Tentative de connexion");
		Socket socket = new Socket("localhost", 9090);
		System.out.println(socket+ " Connexion effectuée");
		
		int nombre1 = 10;
		int nombre2 = 12;

		OutputStream os = socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeInt(nombre1);
		oos.writeInt(nombre2);
		oos.flush();
		
		InputStream isRecu = socket.getInputStream();
		ObjectInputStream oisRecu = new ObjectInputStream(isRecu);
		int resRecu = oisRecu.readInt();
		System.out.println("Le résultat est " +resRecu);
		
		
		socket.close();
		System.out.println("Fin du programme");

	}

}

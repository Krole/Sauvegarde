package io.steria.pox3.serveurs;

	
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) throws Exception{
		
			System.out.println("Tentative d'ouverture du port");
			ServerSocket socketserver = new ServerSocket(9090);
			System.out.println(socketserver +" Ouverture de la socket effectuée");
			
			Socket communicationAvecClient = socketserver.accept();
			System.out.println(communicationAvecClient);
			
			InputStream is = communicationAvecClient.getInputStream();
			while (true)
			{ int data = is.read();
			if (data == -1)
				break;
			System.out.print((char) (data & 0xff));//masque de bit; ff = 8 bits;
			}
			
			ObjectInputStream isRecu = new ObjectInputStream(is);
			int recu1 = isRecu.readInt();
			int recu2 = isRecu.readInt();
			
			int res = recu1+recu2;
			OutputStream osEnvoie = communicationAvecClient.getOutputStream();
			ObjectOutputStream oosEnvoie = new ObjectOutputStream(osEnvoie);
			oosEnvoie.writeInt(res);
			oosEnvoie.flush();
			
/* 
 *
		Object s = ois.readObject();
        System.out.println(s);
        
        oos.writeObject("De rien Hugues !!!! :) ");
 * 
 * 
 */
 
			
			communicationAvecClient.close();
			socketserver.close();

	}

}

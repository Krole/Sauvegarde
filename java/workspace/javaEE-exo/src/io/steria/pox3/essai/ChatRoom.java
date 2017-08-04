package io.steria.pox3.essai;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	private String name;
	private String createur;

	public ChatRoom(String name, String createur2) {
		this.name = name;
		this.createur = createur2;
	}

	public String getName() {
		return name;
	}


	public String getCreateur() {
		return createur;
	}

	public static List<Message> getMessages() {
		return messages;
	}

	public static List<Message> messages = new ArrayList<>();

}

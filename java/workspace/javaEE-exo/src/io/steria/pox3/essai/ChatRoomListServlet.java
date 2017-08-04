package io.steria.pox3.essai;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chatRoomList.html")

public class ChatRoomListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("chatRoom", Donnees.chatRooms);
		Outils.vueChatRoomList(Donnees.chatRooms, req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String createur = req.getParameter(Constante.NOM_PARAMETRE_CREATEUR);
		String essai = req.getParameter(Constante.NOM_PARAMETRE_LIST);

		User user = Outils.getConnectedUser(req);
		if (user == null) {
			user = new User("Ano", "nymous");
		}
		ChatRoom chatRoom = new ChatRoom(essai, createur);

		Donnees.chatRooms.add(chatRoom);

		Outils.vueChatRoomList(Donnees.chatRooms, req, resp);
	}

}

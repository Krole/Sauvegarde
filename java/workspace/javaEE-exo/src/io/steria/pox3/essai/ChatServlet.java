package io.steria.pox3.essai;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chat.html")

public class ChatServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("message", ChatRoom.messages);
		Outils.vueChatRoom(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date date = new Date();
		String text = req.getParameter(Constante.NOM_PARAMETRE_MESSAGE);
		User user = Outils.getConnectedUser(req);
		if (user == null) {
			user = new User("Ano", "nymous");
		}
		Message message = new Message(date, user, text);
		ChatRoom.messages.add(message);

		Outils.vueChatRoom(req, resp);
	}

}

package io.steria.pox3.essai;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Outils {

	public static User getConnectedUser(HttpServletRequest req) {

		User user = (User) req.getSession().getAttribute(Constante.CLE_SESSION_USER);
		return user;
	}

	public static void setConnectedUser(User user, HttpServletRequest req){
		req.getSession().setAttribute(Constante.CLE_SESSION_USER, user);
	}
	
	public static void vueWelcomeConnected (User user, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.setAttribute("user", user);
		vue("welcomeConnected",req,resp);
	}
	
	public static void vueWelcomeNotConnected (User user, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		vue("welcomeNotConnected",req,resp);
	}
	
	public static void vuenewFormulaire(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		vue("newFormulaire",req,resp);	
	}
	
	public static void vueConnexion(User user, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		vue("Connexion",req,resp);	
	}
	
	public static void vueChatRoomMessage(List<Message> messages, HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException{
		req.setAttribute("messages", messages);
		vue("chatRoomMessage",req,resp);
		
	}
	
	public static void vueChatRoom(HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException{
		vue("chatRoom",req,resp);
		
	}
	
	public static void vueChatRoomList(List<ChatRoom> chatRooms, HttpServletRequest req, HttpServletResponse resp ) throws ServletException, IOException{
		req.setAttribute("chatRoom", chatRooms);
		vue("chatRoomList",req,resp);
	}
	
	
	public static void vue(String jspName, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		req.getRequestDispatcher("/WEB-INF/"+jspName+".jsp").forward(req, resp);
	}
	
	
	
}

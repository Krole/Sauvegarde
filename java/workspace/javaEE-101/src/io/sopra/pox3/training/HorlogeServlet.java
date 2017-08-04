package io.sopra.pox3.training;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HorlogeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date d = new Date();
		resp.setContentType("text/html");
		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		resp.getWriter().print("<html><head></head><body>Paramètre 1 : " +p1+ "</br>");
		resp.getWriter().print("Paramètre 2 : " +p2+ "</br>");
		resp.getWriter().print("Il est: " + d.getHours() + ":" + d.getMinutes() + ":"
				+ d.getSeconds() + "</body></html>");

	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date d = new Date();
		resp.setContentType("text/html");
		String p1 = req.getParameter("param1");
		String p2 = req.getParameter("param2");
		resp.getWriter().print("<html><head></head><body>Paramètre 1 : " +p1+ "</br>");
		resp.getWriter().print("Paramètre 2 : " +p2+ "</br>");
		resp.getWriter().print("Il est: " + d.getHours() + ":" + d.getMinutes() + ":"
				+ d.getSeconds() + "</body></html>");

	}

}

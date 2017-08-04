package io.steria.pox3.essai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class ConnexionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		Outils.vuenewFormulaire(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String p1 = req.getParameter(Constante.NOM_PARAMETRE_NAME);
		String p2 = req.getParameter(Constante.NOM_PARAMETRE_SURNAME);
		
		User user = new User(p1, p2);
		Outils.setConnectedUser(user, req);
		Outils.vueConnexion(user, req, resp);
		
	

	}

}

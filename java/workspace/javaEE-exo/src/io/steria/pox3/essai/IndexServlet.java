package io.steria.pox3.essai;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		User user = Outils.getConnectedUser(req);

		if (user != null) 

			Outils.vueWelcomeConnected(user, req, resp);
			/*
			 * resp.getWriter().print("<html><head></head><body>Bonjour " +
			 * user.getNom() + " " + user.getPrenom() + "</br></body></html>");
			 * resp.getWriter().
			 * print("<html><head></head><body> <form action = 'deconnexion.html' method='get' >"
			 * 
			 * +
			 * "<button type = 'submit'> Deconnexion </button> </form></body></html>"
			 * );
			 */
			/*
			 * req.setAttribute("user", user);
			 * req.getRequestDispatcher("/WEB-INF/welcomeConnected.jsp").forward
			 * (req, resp);
			 */

		 else
			Outils.vueWelcomeNotConnected(user, req, resp);

		/*
		 * req.getRequestDispatcher("/WEB-INF/welcomeNotConnected.jsp").forward(
		 * req, resp);
		 * 
		 * resp.getWriter().print(
		 * "<html><head></head><body>Bonjour pour vous connecter, allez à <a href='connexion.html'>cette page</body></body></html>"
		 * );
		 */
	}

}

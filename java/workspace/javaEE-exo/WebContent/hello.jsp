<%@page import="io.steria.pox3.essai.Outils"%>
<%@page import="io.steria.pox3.essai.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Bonjour hello ola!
	</br> un plus un �gal
	<%=1 + 1%>

	<%
		String monRefer = request.getParameter("toto");
		out.print(monRefer);
	%>


	<%
		User user = Outils.getConnectedUser(request);
		if (user != null) {
			%>
				<div>
				Salut <%=user.getNom()%> <%=user.getPrenom() %>
				</div>
			<%
		}
	%>

	<br /> ton referer c'est :
	<%=monRefer%>
	
	

</body>
</html>
<%@page import="io.steria.pox3.essai.Constante"%>
<%@page import="io.steria.pox3.essai.Message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>

<body
	style="height: 100%; width: 100%; display: flex; flex-flow: column nowrap; position: absolute">


	<iframe src="chatRoomMessage.html" scrolling="no"
		style="height: 100%; width: 100%"></iframe>

	<form method='post'>
		<input type='text' name='<%=Constante.NOM_PARAMETRE_MESSAGE%>'>
		<button type='submit'>Envoyer</button>
	</form>

	<br>
	<a href='index.html'> accueil</a>
	<br>

</body>
</html>
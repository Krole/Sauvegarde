<%@page import="io.steria.pox3.essai.Constante"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Bonjour, ${user.nom} ${user.prenom}

<br>
<a href='chatRoomList.html'> Liste des chatRooms</a>
<br>

<form action='chat.html' method='get'>
<button type='submit' >Acces au chat</button><br></form>



<br>
<form action='index.html' method='get'>
<button type='submit' >Accueil</button><br></form>

<form action='index.html' method='get'>
<button type='submit' >Se déconnecter immédiatement</button><br>
</form>

</body>
</html>
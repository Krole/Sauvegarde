<%@page import="io.steria.pox3.essai.Message"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RoomMessage</title>
<meta http-equiv="refresh" content="2">
</head>

<body>

	<c:forEach var="message" items="${messages}">
	Le : ${message.date } <br>
	${message.user.nom} ${message.user.prenom} a dit : <br>
	${message.text} 
	 <br> 
	</c:forEach>
</body>
</html>
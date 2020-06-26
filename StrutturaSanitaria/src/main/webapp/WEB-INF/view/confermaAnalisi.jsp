<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.corso.main.model.Analisi"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONFERMA ANALISI </title>
</head>
<body>
		<h1>RIEPILOGO DATI:</h1>
<c:forEach items="${analisi}"></c:forEach>



</body>
</html>
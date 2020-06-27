<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.corso.main.model.Analisi"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CONFERMA ANALISI </title>
<style>
	body{
	
	background :url(CSS/analisi.jpg);
	background-position:center center;
	-webkit-background-size:cover;
	background-size:cover;
	height:100vh;
	
	}
	.contact-form{
	
	max-width:600px;
	margin:auto;
	border-radius:5px;
	background:#dbdcdc;
	padding:20px;
	margin-top: 200px;
	
	}
	input [type=text],[type=date],select{
	width:100%;
	padding:12px 20px;
	margin:8px 0;
	display:inline-block;
	border:1px solid #ccc;
	border-radius:4px;
	box-sizing:border-box;
	}
	a{
	
	margin-left:200px;
	
	}
	</style>
</head>
<body>
		<h1>CONFERMA PRENOTAZIONE RICOVERO:</h1>
	<div class="contact-form">
	<h3>RIEPILOGO PRENOTAZIONE : </h3>		
<% 
	
	out.println("NOME PAZIENTE : "+request.getAttribute("nome_paziente"));
	out.println("COGNOME PAZIENTE : "+request.getAttribute("cognome_paziente"));
	out.println("NOME RESPONSABILE : "+request.getAttribute("nome_responsabile"));
	out.println("COGNOME RESPONSABILE : "+request.getAttribute("cognome_responsabile"));
	out.println("REPARTO : "+request.getAttribute("reparto"));
	out.println("IN DATA : "+request.getAttribute("data"));
	

%>
	<br><br><br>
	<a href="homePage">HomePage</a>

	</div>

</body>
</html>
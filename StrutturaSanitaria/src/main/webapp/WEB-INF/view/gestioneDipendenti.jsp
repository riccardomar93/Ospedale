<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GESTIONE DIPENDENTI</title>
<style>
body{
	
	background :url(CSS/personalesanitario.jpg);
	background-position:center center;
	-webkit-background-size:cover;
	background-size:cover;
	height:100vh;
	
	}
	.contact-form{
	
	max-width:600px;
	margin:auto;
	border-radius:5px;
	background:#c8d6ff;
	padding:20px;
	margin-top: 150px;
	
	
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
	
	margin-left:10px;
	
	}
	h1{color:#ce2828}
</style>
</head>
<body>

<h1 align="center" >SEZIONE GESTIONE DIPENDENTI</h1>

<div class="contact-form">

<h3 align="center"><a href="ricercaDipendenti">VISUALIZZA TUTTI I DIPENDENTI</a></h3>
<h3 align="center"><a href="newDipendente">INSERISCI UN NUOVO DIPENDENTE</a></h3>
<h3 align="center"><a href="deleteDipendente">ELIMINA UN DIPENDENTE</a></h3>
<h3 align="center"><a href="updateDipendente">MODIFICA UN DIPENDENTE</a></h3>


</div>
</body>
</html>
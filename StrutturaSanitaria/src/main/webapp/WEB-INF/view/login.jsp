<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "CSS/login.css" />
<meta charset="ISO-8859-1">
<title>LOGIN</title>
<style>body{
	
	background :url(CSS/sfondoOspedale.jpg);
	
	}
</style>
</head>
<body>

<div class="loginbox">

	<h1>Login</h1>
	<form action="controlloCredenziali" method="get">
			
			<p>Username</p> 
			<input type="text" name="username" placeholder="Inserisci Username">
			<p>Password</p> 
			<input type="password" name="password" placeholder="Inserisci Password">
			<input type="submit" value="LOGIN">
	</form>

</div>

</body>
</html>
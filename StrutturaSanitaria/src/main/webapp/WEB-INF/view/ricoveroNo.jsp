<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NESSUNA DISPONIBILITA'</title>
</head>
<body>
 
 <h1 align="center">CERCA DISPONIBILITA' PER DATA E REPARTO DI INTERESSE</h1><br>
 <p align ="center">NESSUNA DISPONIBILITà PER LA DATA E IL REPARTO SELEZIONATI</p>
 <div align="center">
 
	<form action="maprico" method="get">

		<h5>Data : </h5><br>
		<input type ="text" name="data"><br>
		<h5>Reparto : </h5><br>
		<input type ="text" name="reparto"><br><br>
		
		<input type = "submit" value="CERCA DISPONIBILITA'">

	</form>
</div>

</body>
</html>
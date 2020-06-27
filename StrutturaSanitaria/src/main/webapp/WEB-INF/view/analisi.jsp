<!DOCTYPE html>
<html>
<head>
	<title>DISPONIBILITA'</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<link rel = "stylesheet" type = "text/css" href = "CSS/homePage.css" />
	<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.css" rel="stylesheet" id="bootstrap-css">
	
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
	
</style>	

</head>
<body>


		<div class="contact-form" >
			<form action="maplabo" method="get">
			<h2>CERCA DISPONIBILITA' PER DATA</h2>
		
		
				<input type="date" name ="data">
				<input type="submit" value="INVIO">
		
		</form>
		</div>



	
</body>
</html>
<!DOCTYPE html>
<html>
<head>
	<title>DISPONIBILITA'</title>
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker3.css" rel="stylesheet" id="bootstrap-css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>body{
	
	background :url();
	
	}
	.contact-form{
	
	max-width:600px;
	margin:auto;
	border-radius:5px;
	background:#96bb72;
	padding:20px;
	
	}
	input [type=text],select{
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
<div class="contact-form">

<form action="maprico" method="get">
	
	<div class="banner-area">
	<div class="container">
		<div class="row">
			<h5>CERCA DISPONIBILITA' PER DATA</h5>
		</div>
		<div class="row">
	        <div class='col-sm-6'>
	        	
		            <div class="form-group">
		                <div class='input-group date' id='datepicker'>
		                    <input type='text' name="Data" class="form-control" />
		                    <span class="input-group-addon">
		                        <span class="glyphicon glyphicon-calendar"></span>
		                    </span>
		                </div>
		            </div>
		            
		        
	        </div>
	    </div>
	</div>
</div>

	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
	<script >
	    $(function () {
	        $('#datepicker').datepicker({
	            format: "dd/mm/yyyy",
	            autoclose: true,
	            todayHighlight: true,
		        showOtherMonths: true,
		        selectOtherMonths: true,
		        autoclose: true,
		        changeMonth: true,
		        changeYear: true,
		        orientation: "button"
	        });
	    });
	</script>
		
		<label for ="reparto">Reparto</label><br>
		<select>
		<option value = "Ortopedia">Ortopedia</option>
		<option value = "Ginecoglogia">Ginecoglogia</option>
		</select>
		<input type="submit" value ="INVIO">
	</form>



</div>
</body>
</html>
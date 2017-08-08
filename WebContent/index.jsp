<html>
<head>
<title>Login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form action="cabecalho.jsp" method="post">
			<div class="form-group">
				<label for="login">Login</label>
				<input id="login" name="login" type="text" class="form-control"/>
			</div>
			
			<div class="form-group">
				<label for="senha">Senha</label>
				<input id="senha" name="senha" type="password" class="form-control"/>
			</div>
			
			<button type="submit" class="btn btn-default">Submit</button>
	
		</form>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESULT</title>
</head>
<body>

			
			<h1>MEU FILME</h1>
			<div>
				<p>T�tulo  : ${objFilme.titulo}</p>
				<p>Dura��o : ${objFilme.duracao}</p>
				<p>G�nero  : ${objFilme.genero}</p>
				<p>Ano lan�amento : ${objFilme.anoLanc}</p>
			</div>
			<p><a href="index.jsp">IN�CIO</a></p>
</body>	

	<h1>MEU FILME</h1>
	<div>
		<p>T�tulo : ${objFilme.titulo}</p>
		<p>Dura��o : ${objFilme.duracao}</p>
		<p>G�nero : ${objFilme.genero}</p>
		<p>Ano lan�amento : ${objFilme.anoLanc}</p>
	</div>
	<p>
		<a href="index.jsp">IN�CIO</a>
	</p>
</body>

</html>
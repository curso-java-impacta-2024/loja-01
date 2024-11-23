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
				<p>Título  : ${objFilme.titulo}</p>
				<p>Duração : ${objFilme.duracao}</p>
				<p>Gênero  : ${objFilme.genero}</p>
				<p>Ano lançamento : ${objFilme.anoLanc}</p>
			</div>
			<p><a href="index.jsp">INÍCIO</a></p>
</body>	

	<h1>MEU FILME</h1>
	<div>
		<p>Título : ${objFilme.titulo}</p>
		<p>Duração : ${objFilme.duracao}</p>
		<p>Gênero : ${objFilme.genero}</p>
		<p>Ano lançamento : ${objFilme.anoLanc}</p>
	</div>
	<p>
		<a href="index.jsp">INÍCIO</a>
	</p>
</body>

</html>
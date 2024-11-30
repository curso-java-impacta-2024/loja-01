<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RESULT</title>
</head>
<body>
	<c:if test="${msg eq '' || msg == null}">
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
	</c:if>
	<c:if test="${msg != ''}">
		<h1>${msg}</h1>
	</c:if>
</body>
</html>
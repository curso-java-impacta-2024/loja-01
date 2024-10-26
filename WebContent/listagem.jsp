<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Lista de Filmes</title>
</head>
<body>

	<h1>Lista com os melhores Filmes</h1>
	<div>
	<a href="index.jsp">INICIO</a>
	</div>
	<div>
		<table border="1">
			<thead>
				<tr>
					<th>Título</th>
					<th>Ano de Lançamento</th>
					<th>Duração</th>
					<th>Gênero</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="filme" items="${listaDeFilmes}">
				<tr>
					<td>${filme.titulo}</td>
					<td>${filme.anoLanc}</td>
					<td>${filme.genero}</td>
					<td>${filme.duracao}</td>
				</tr>
			</c:forEach>	
			</tbody>
			<tfoot>
				<tr>
					<td colspan = "4">Quantidade de Registros</td>
				</tr>
			</tfoot>
		</table>
	
	
	</div>

</body>
</html>
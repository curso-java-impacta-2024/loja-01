<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>



<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Filmes</title>

<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<h1>Lista com os melhores Filmes</h1>
	<div>
		<a href="index.jsp">ÍNICIO</a>
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
						<td><a href="filme-view?id=${filme.id}">${filme.titulo}></a></td>
						<td>${filme.anoLanc}</td>
						<td>${filme.duracao}</td>
						<td>${filme.genero}</td>
					</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="4">Quantidade de Registros -</td>
				</tr>
			</tfoot>
		</table>
	</div>


</body>
</html>
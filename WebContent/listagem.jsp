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
		<a href="index.jsp">�NICIO</a>
	</div>

	<div>
		<table border="1">
			<thead>
				<tr>
					<th>T�tulo</th>
					<th>Ano de Lan�amento</th>
					<th>Dura��o</th>
					<th>G�nero</th>
					<th>Editar</th>
					<th>Excluir</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="filme" items="${listaDeFilmes}">
					<tr>
						<td><a href="filme-view?id=${filme.id}">${filme.titulo}></a></td>
						<td>${filme.anoLanc}</td>
						<td>${filme.duracao}</td>
						<td>${filme.genero}</td>
						<td><a href="update?id=${filme.id}"><img src="./img/editar.png" alt="lapis" width="10%"/></a> </td>
						<td><a href="delete?id=${filme.id}"><img src="./img/excluir.png" alt="lixeira" width="10%"/></a> </td>
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
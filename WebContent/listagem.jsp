<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Listam com os melhores Filmes</h1>
	<div>
		<a href="index.jsp">ÍNICIO</a>
	</div>
	<div>
		<table border="1">
			<thead>
				<tr>
					<th>Título</th>
					<th>Ano de lançamento</th>
					<th>Duração</th>
					<th>Gênero</th>
				</tr>			
			</thead>
			<tbody>
			<c:forEach var="Filme" items="${listaDeFilmes}" >
				<tr>
					<td>${filme.titulo}</td>
					<td>${filme.anoLanc}</td>
					<td>${filme.duracao}</td>
					<td>${filme.genero}</td>
				</tr>
			</c:forEach>			
			</tbody>
			<tfoot>
				<tr>
				<td colspan="4"> Quantidade de Resgistro</td>
				</tr>			
			</tfoot>
		</table>	
	</div>
</body>
</html>
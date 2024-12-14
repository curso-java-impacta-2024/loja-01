<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<a href="index.jsp" style="color: white;" >INÍCIO</a>
			</div>
			<div>
				 <table>
	        <thead>
	            <tr>
	                <th>Título</th>
	                <th>Ano de lançamento</th>
	                <th>Duração</th>
	                <th>Gênero</th>
	                <th>Editar/Excluir</th>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach var="filme" items="${listaDeFilmes}">
	                <tr>
	                    <td><a href="filme-view?id=${filme.id}" style="color: white;">${filme.titulo}</a></td>
	                    <td>${filme.anoLanc}</td>
	                    <td>${filme.duracao}</td>
	                    <td>${filme.genero}</td>
	                    <td><a href="update?id=${filme.id}"><img src="./img/edit.png" alt="lápis" width="5%" /> </a> &nbsp;&nbsp; <a href="delete?id=${filme.id}"><img src="./img/delete.png" alt="lixeira" width="5%"/></a></td>
	                </tr>
	            </c:forEach>
	        </tbody>
	        <tfoot>
	            <tr>
	                <td colspan="4">Quantidade de Registros - ${listaDeFilmes.size()}</td>
	            </tr>
	        </tfoot>
	    </table>
			</div>
		
	</body>
</html>
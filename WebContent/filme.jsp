<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${filmeBean.titulo}</title>
</head>
<body>
<h1>P�gina do Filme : <span>${filmeBean.titulo}</span></h1>
<div>
	<p>T�tulo: ${filmeBean.titulo}</p>
	<p>Lancamento: ${filmeBean.anoLanc}</p>
	<p>Duracao: ${filmeBean.duracao}</p>
	<p>Genero: ${filmeBean.genero}</p>
	 
</div>
<div>
	<a href="listagem">Lista de Filmes</a>
</div>
</body>
</html>
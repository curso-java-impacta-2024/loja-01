<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>${filmeBean.titulo}</title>
</head>
<body>

<h1>P�gina do filme: <span>${filmeBean.titulo}</span></h1>
<div>
</div>
	<p>Titulo : ${filmeBean.titulo}</p>
	<p>Lan�amento : ${filmeBean.anoLanc}</p>
	<p>Dura��o : ${filmeBean.duracao}</p>
	<p>G�nero : ${filmeBean.genero}</p>
	
	<div>
		<a href="listagem">Lista de Filmes</a>
	</div>

</body>
</html>
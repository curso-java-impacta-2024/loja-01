<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='https://fonts.googleapis.com/css?family=Abril+Fatface'
	rel='stylesheet' type='text/css'>
<link href='https://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="./css/update.css">

<title>UPDATE FILME</title>
</head>
<body>
	<p>
		<a href="index.jsp">INÍCIO</a>
	</p>


	<section id="container">


		<section>
			<article>
				<h1>Atualizar</h1>
				<form action="filme-atualizado" method="post">
					<input type="hidden" name="idFilme" value="${filmeBean.id}" />
					<div>
						<label for="idTitulo">Título:</label> <input type="text"
							name="titulo" id="idTitulo" placeholder="titulo do filme"
							value="${filmeBean.titulo}" />
					</div>

					<div>
						<label for="idDuracao">Duração:</label> <input type="number"
							name="duracao" id="idDuracao" placeholder="duração do filme"
							value="${filmeBean.duracao}" />
					</div>

					<div>
						<label for="idGenero">Gênero:</label> <select name="genero"
							id="idGenero">
							<option value="0">Seleciona uma opção</option>
							<option value="acao">Ação</option>
							<option value="drama">Drama</option>
							<option value="terror">Terror</option>
							<option value="aventura">Aventura</option>
							<option value="ficcao">Ficção</option>
						</select>
					</div>
					<div>
						<label for="idAnoLanc">Ano de Lançamento:</label> <input
							type="number" name="anoLanc" id="idAnoLanc"
							placeholder="ano de lançamento" value="${filmeBean.anoLanc}" />
					</div>


					<div id="submit">
						<input type="submit" value="Submit" />
					</div>
				</form>
			</article>
		</section>


	</section>


</body>
</html>
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
		<a href="index.jsp">IN�CIO</a>
	</p>


	<section id="container">


		<section>
			<article>
				<h1>Atualizar</h1>
				<form action="filme-atualizado" method="post">
					<input type="hidden" name="idFilme" value="${filmeBean.id}" />
					<div>
						<label for="idTitulo">T�tulo:</label> <input type="text"
							name="titulo" id="idTitulo" placeholder="titulo do filme"
							value="${filmeBean.titulo}" />
					</div>

					<div>
						<label for="idDuracao">Dura��o:</label> <input type="number"
							name="duracao" id="idDuracao" placeholder="dura��o do filme"
							value="${filmeBean.duracao}" />
					</div>

					<div>
						<label for="idGenero">G�nero:</label> <select name="genero"
							id="idGenero">
							<option value="0">Seleciona uma op��o</option>
							<option value="acao">A��o</option>
							<option value="drama">Drama</option>
							<option value="terror">Terror</option>
							<option value="aventura">Aventura</option>
							<option value="ficcao">Fic��o</option>
						</select>
					</div>
					<div>
						<label for="idAnoLanc">Ano de Lan�amento:</label> <input
							type="number" name="anoLanc" id="idAnoLanc"
							placeholder="ano de lan�amento" value="${filmeBean.anoLanc}" />
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
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
<link rel='stylesheet' href='./css/update.css'>

<title>Update Filme</title>

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

					<div>
						<label for="idTitulo">Título:</label> <input type="text"
							name="firstName" id="idTitulo" placeholder="Titulo"
							value="${filmeBean.titulo}" />
					</div>

					<div>
						<label for="idDuracao">Duração:</label> <input type="number"
							name="lastName" id="idDuracao" placeholder="Duracao"
							value="${filmeBean.duracao}" />
							
					</div>

					<div>
						<label for="idGenero">Gênero:</label> 
						<select type="text" name="idGenero" id="idGenero">
						<option value="0">Selecione uma opção</option>
						<option value="ACAO">Ação</option>
						<option value="DRAMA">Drama</option>
						<option value="TERROR">Terror</option>
						<option value="AVENTURA">Aventura</option>
						<option value="FICCAO">Ficção</option>
						 </select>
					</div>

					<div>
						<label for="idAnoLanc">Ano Lançamento:</label> <input type="number"
							name="password" id="idAnoLanc" placeholder="ano lancamento"
							value="${filmeBean.anoLanc}" />
					</div>

			
					<div id="submit">
						<input type="submit" value="Enviar">
					</div>
				</form>
			</article>
		</section>


	</section>
</body>
</html>
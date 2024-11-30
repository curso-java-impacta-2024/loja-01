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

					<div>
						<label for="idtitulo">Titulo:</label> <input type="text"
							name="titulo" id="idtitulo" placeholder="titulo do filme" 
							value="${filmeBean.titulo}"/>
					</div>

					<div>
						<label for="idDuracao">Duração:</label> <input type="number"
							name="Duracao" id="idDuracao" placeholder="duração filme"
							valeu="${filmeBean.duracao}" />
					</div>

					<div>
						<label for="idGenero">Gênero:</label>
						<select name="genero" id="idGenero" >
						
							<option valeu="0">Selecione uma opção</option>
							<option valeu="acao">Ação</option>
							<option valeu="drama">Drama</option>	
							<option valeu="terror">Terror</option>
							<option valeu="aventura">Aventura</option>
							<option valeu="ficcao">Ficção</option>					
						
						</select>
						

					</div>

					<div>
						<label for="idAnoLanc">Ano Lançamento:</label> <input type="number"
							name="anoLanc" id="idAnoLanc" placeholder="somente 4 caractér"
							valeu=" ${filmeBean.anoLanc}" />
					</div>

					

					<div id="submit">
						<input type="submit" value="Atualizar" />
					</div>
				</form>
			</article>
		</section>


	</section>





</body>
</html>
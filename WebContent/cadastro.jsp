<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link stylerel="./css/style.css">
<title>IMDB</title>
</head>
<body>

	<h1>CADASTRO DE FILMES</h1>

	<div>
		<form action="index.php" method="post">
			<fieldset>
				<legend>Cadastro</legend>
				<div>
					<label for="idTitulo">T�tulo</label> <input type="text"
						name="titulo" id="idTitulo"
						placeholder="Digite o t�tulo do filme." required>
				</div>
				<div>
					<label for="idDuracao">Dura��o</label> <input type="number"
						name="duracao" id="idDuracao"
						placeholder="Digite a dura��o do filme." required>
				</div>
				<div>
					<label for="idGenero">G�nero</label> <select name="genero"
						id="idGenero">
						<option value="0">Selecione uma op��o</option>
						<option value="ficcao">Fic��o</option>
						<option value="guerra">Guerra</option>
						<option value="fantasia">Fantasia</option>
						<option value="aventura">Aventura</option>
						<option value="comedia">Com�dia</option>
						<option value="acao">A��o</option>
					</select>
				</div>
				<div>
					<label for="idAnoLanc">Ano de Lan�amento</label> <input type="text"
						name="anoLanc" id="idAnoLanc"
						placeholder="Digite o ano de lan�amento do filme." maxlength="4"
						required>
				</div>

				<div>
					<button type="submit">Cadastrar</button>
				</div>

			</fieldset>
		</form>
	</div>


</body>
</html>





















package br.com.impacta.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.bo.FilmeBO;

/**
 * Servlet implementation class CadastroController
 */
@WebServlet(urlPatterns= {"/index.php", "/listagem","/filme-view"})

public class CadastroController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/** 
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastroController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Recuperando o path atual
		String uriPath[] = request.getRequestURI().split("/");

		if (uriPath[uriPath.length - 1].equals("index.php")) {
			// Recebendo os dados do FORMULÁRIO E COLOCANDO NO OBJ...
			FilmeBEAN fb = new FilmeBEAN();
			// Pegando cada dado do formulário e adicionando no atributo do ObjFilme
			fb.setTitulo(request.getParameter("titulo"));
			fb.setDuracao(Integer.parseInt(request.getParameter("duracao")));
			fb.setGenero(request.getParameter("genero"));
			fb.setAnoLanc(Integer.parseInt(request.getParameter("anoLanc")));

			// Criando um atributo no request:
			request.setAttribute("objFilme", fb);

			// Criando um dispatcher com o request para enviar o atributo
			// para a nova página receber e ler o conteúdo...
			request.getRequestDispatcher("result.jsp").forward(request, response);
		}else if (uriPath[uriPath.length - 1].equals("listagem")) {
			
			//Instanciando a classe BO para iniciar o processo
			// de listagem dos dados.
			FilmeBO fbo = new FilmeBO();
			//Recebendo a lista do método de listagem e colocando em uma lista
			//do tipo FilmeBEAN
			List<FilmeBEAN> lista =  fbo.listaFilme();
						
			// Criando um atributo no request:
			request.setAttribute("listaDeFilmes", lista);
			// Criando um dispatcher com o request para enviar o atributo com
			// a lista para a página listagem receber e apresentar  o conteúdo...
			request.getRequestDispatcher("listagem.jsp").forward(request, response);
		}else if (uriPath[uriPath.length - 1].equals("filme-view")) {
			
			//Recebendo o ID do filme da página de listagem e colocando em uma
			// variável
			int idFilme = Integer.parseInt(request.getParameter("id"));
			
			//Instanciando a classe BO para iniciar o processo
			// de listagem dos dados.
			FilmeBO fbo = new FilmeBO();
			
			//Recebendo um objeto do tipo FilmeBEAN
			FilmeBEAN fb =  fbo.listaFilme(idFilme);
						
			// Criando um atributo no request:
			request.setAttribute("filmeBean", fb);
			// Criando um dispatcher com o request para enviar o atributo com
			// a lista para a página listagem receber e apresentar  o conteúdo...
			request.getRequestDispatcher("filme.jsp").forward(request, response);
		}

	}

	
}

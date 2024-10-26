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
@WebServlet(urlPatterns = { "/index.php", "/listagem" })

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

		String uriPath[] = request.getRequestURI().split("/");

		if (uriPath[uriPath.length - 1].equals("index.php")) {

			// Recebendo os dados do FORMUL�RIO E COLOCANDO NO OBJ...
			FilmeBEAN fb = new FilmeBEAN();
			// Pegando cada dado do formul�rio e adicionando no atributo do ObjFilme
			fb.setTitulo(request.getParameter("titulo"));
			fb.setDuracao(Integer.parseInt(request.getParameter("duracao")));
			fb.setGenero(request.getParameter("genero"));
			fb.setAnoLanc(Integer.parseInt(request.getParameter("anoLanc")));

			// Criando um atributo no request:
			request.setAttribute("objFilme", fb);

			// Criando um dispatcher com o request para enviar o atributo
			// para a nova p�gina receber e ler o conte�do...
			request.getRequestDispatcher("result.jsp").forward(request, response);
		} else if (uriPath[uriPath.length - 1].equals("listagem")) {
			
			//Instanciando a classe BO para iniciar o processo de listagem dos dados
			// Criando um atributo no request:
			FilmeBO fbo = new FilmeBO();
			//Recebendo a lista do m�todo de listagem e colocando em uma lista
			//do tipo FilmeBEAN
			List<FilmeBEAN> lista = fbo.listaFilme();
			
			// Criando um atributo no request:
			request.setAttribute("listaDeFilmes", lista);
			
			// Criando um dispatcher com o request para enviar o atributo
			// para a nova p�gina receber e ler o conte�do...
			request.getRequestDispatcher("listagem.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

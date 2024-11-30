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
@WebServlet(urlPatterns= {"/index.php", "/listagem", "/filme-view" , "/update", "/filme-atualizado"})

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
		}else if (uriPath[uriPath.length - 1].equals("listagem")) {
			
			//Instanciando a classe BO para iniciar o processo
			// de listagem dos dados.
			FilmeBO fbo = new FilmeBO();
			//Recebendo a lista do m�todo de listagem e colocando em uma lista
			//do tipo FilmeBEAN
			List<FilmeBEAN> lista =  fbo.listaFilme();
						
			// Criando um atributo no request:
			request.setAttribute("listaDeFilmes", lista);
			// Criando um dispatcher com o request para enviar o atributo com
			// a lista para a p�gina listagem receber e apresentar  o conte�do...
			request.getRequestDispatcher("listagem.jsp").forward(request, response);
		}else if (uriPath[uriPath.length - 1].equals("filme-view")) {
			//recebendo o id do filme
			int idFilme = Integer.parseInt(request.getParameter("id"));
			
			//Instanciando a classe BO para iniciar o processo
			// de listagem dos dados.
			FilmeBO fbo = new FilmeBO();
			//Recebendo unico objeto do m�todo do tipo FilmeBEAN
			FilmeBEAN fb =  fbo.listaFilme(idFilme);
						
			// Criando um atributo no request:
			request.setAttribute("filmeBean", fb);
			// Criando um dispatcher com o request para enviar o atributo com
			// a lista para a p�gina listagem receber e apresentar  o conte�do...
			request.getRequestDispatcher("filme.jsp").forward(request, response);
		}else if (uriPath[uriPath.length - 1].equals("update")) {
			//recebendo o id do filme
			int idFilme = Integer.parseInt(request.getParameter("id"));
			
			//Instanciando a classe BO para iniciar o processo
			// de listagem dos dados.
			FilmeBO fbo = new FilmeBO();
			//Recebendo unico objeto do m�todo do tipo FilmeBEAN
			FilmeBEAN fb =  fbo.listaFilme(idFilme);
						
			// Criando um atributo no request:
			request.setAttribute("filmeBean", fb);
			// Criando um dispatcher com o request para enviar o atributo com
			// a lista para a p�gina listagem receber e apresentar  o conte�do...
			request.getRequestDispatcher("update-filme.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uriPath[] = request.getRequestURI().split("/");
		//objeto bo ja instanciado
		FilmeBO fbo;

		if (uriPath[uriPath.length - 1].equals("filme-atualizado")) {
			// Recebendo os dados do FORMUL�RIO E COLOCANDO NO OBJ...
			FilmeBEAN fb = new FilmeBEAN();
			// Pegando cada dado do formul�rio e adicionando no atributo do ObjFilme
			fb.setTitulo(request.getParameter("titulo"));
			fb.setDuracao(Integer.parseInt(request.getParameter("duracao")));
			fb.setGenero(request.getParameter("genero"));
			fb.setAnoLanc(Integer.parseInt(request.getParameter("anoLanc")));

			fbo = new FilmeBO();
			
			if(fbo.atualizaFilme(fb)!= null) {
				// Criando um atributo no request:
				request.setAttribute("mensagem", "Filme atualizado com sucesso.");
	
				// Criando um dispatcher com o request para enviar o atributo
				// para a nova p�gina receber e ler o conte�do...
				request.getRequestDispatcher("result.jsp").forward(request, response);
			}else {
				
				request.setAttribute("mensagem", "Ocorreu um erro na atualiza��o.");
				// Criando um dispatcher com o request para enviar o atributo
				// para a nova p�gina receber e ler o conte�do...
				request.getRequestDispatcher("result.jsp").forward(request, response);
				
			}
		
	}
	
	}	
}

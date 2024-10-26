package br.com.impacta.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.impacta.bean.FilmeBEAN;

/**
 * Servlet implementation class CadastroController
 */
@WebServlet("/index.php")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recebendo os dados do FORMULÁRIO E COLOCANDO NO OBJ...
		FilmeBEAN fb = new FilmeBEAN();
		//Pegando cada dado do formulário e adicionando no atributo do ObjFilme
		fb.setTitulo( request.getParameter("titulo") );
		fb.setDuracao( Integer.parseInt(request.getParameter("duracao")));
		fb.setGenero(request.getParameter("genero"));
		fb.setAnoLanc( Integer.parseInt(request.getParameter("anoLanc")));
		
		//Criando um atributo no request:
		request.setAttribute("objFilme", fb);
		
		//Criando um dispatcher com o request para enviar o atributo
		//para a nova página receber e ler o conteúdo...
		request.getRequestDispatcher("result.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

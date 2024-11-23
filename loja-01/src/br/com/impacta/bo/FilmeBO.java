package br.com.impacta.bo;

import java.util.List;

import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.dao.FilmeDAO;

public class FilmeBO {
<<<<<<< HEAD

	private FilmeDAO filmeDAO = null;
	
	public List<FilmeBEAN> listaFilmes(){
		filmeDAO = new FilmeDAO();
		return filmeDAO.select();
	}
	
	public FilmeBEAN selecionaFilme(int id) {
		filmeDAO = new FilmeDAO();
		return filmeDAO.select(id);
		
	}
	
	public boolean deletaFilme(int id) {
		filmeDAO = new FilmeDAO();
		return filmeDAO.delete(id);
	}
	
	public boolean editaFilme(FilmeBEAN fb) {
		filmeDAO = new FilmeDAO();
		return filmeDAO.update(fb);
	}
	
	public boolean cadastrarFilme(FilmeBEAN fb) {
		filmeDAO = new FilmeDAO();
		return filmeDAO.insert(fb);
	}
=======
	
	private FilmeDAO fdao = null;
	
	public List<FilmeBEAN> listaFilme(){
		fdao = new FilmeDAO();
		return fdao.select();
	}
//	
//	public FilmeBEAN listaFilme(int id){
//		fdao = new FilmeDAO();
//		return fdao.select(id);
//	}
//	
//	public boolean cadastrarFilme(FilmeBEAN fb) {
//		fdao = new FilmeDAO();
//		return fdao.insert(fb);
//	}
//	
//	public boolean atualizaFilme(FilmeBEAN fb) {
//		fdao = new FilmeDAO();
//		return fdao.update(fb);
//	}
//	
//	public boolean deletaFilme(int id) {
//		fdao = new FilmeDAO();
//		return fdao.delete(id);
//	}
>>>>>>> master
}

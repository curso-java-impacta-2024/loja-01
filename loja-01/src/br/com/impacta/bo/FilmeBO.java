package br.com.impacta.bo;

import java.util.List;

import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.dao.FilmeDAO;

public class FilmeBO {

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
}

package br.com.impacta.bo;

import java.util.List;

import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.dao.FilmeDAO;

public class FilmeBO {
	
	private FilmeDAO fdao = null;
	
	public List<FilmeBEAN> listaFilme(){
		fdao = new FilmeDAO();
		return fdao.select();
	}
	
	public FilmeBEAN listaFilme(int id){
		fdao = new FilmeDAO();
		return fdao.select(id);
	}
//	
//	public boolean cadastrarFilme(FilmeBEAN fb) {
//		fdao = new FilmeDAO();
//		return fdao.insert(fb);
//	}
//	
	public FilmeBEAN atualizaFilme(FilmeBEAN fb) {
		fdao = new FilmeDAO();
		return fdao.update(fb);
	}
//	
//	public boolean deletaFilme(int id) {
//		fdao = new FilmeDAO();
//		return fdao.delete(id);
//	}
}

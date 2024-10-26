package br.com.impacta.bo;

import java.awt.List;
import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.dao.FilmeDAO;

public class FilmeBO {
	
	private FilmeDAO fdao = null;
	
	public java.util.List<FilmeBEAN> listaFilme1(){
		fdao = new FilmeDAO();
		return fdao.select();
		
	}
	public FilmeBEAN listaFilme(int id){
		fdao = new FilmeDAO();
		return fdao.select(id);
		
	}
	
	public boolean cadastrarFilme(FilmeBEAN fb) {
		fdao = new FilmeDAO();
		return fdao.insert(fb);
	}
	public boolean atualizarFilme(FilmeBEAN fb) {
	fdao = new FilmeDAO();
	return fdao.update(fb);
	}
	public boolean adeletarFilme(int fb) {
		fdao = new FilmeDAO();
		return fdao.delete(fb);
	}
	
}

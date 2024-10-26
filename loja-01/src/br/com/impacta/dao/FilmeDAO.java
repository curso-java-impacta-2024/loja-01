package br.com.impacta.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.bean.FilmeBEAN;

public class FilmeDAO {
	public static List<FilmeBEAN> listaFilmeB;
	
	

	public FilmeDAO() {
		//implementando a lista 
		if(listaFilmeB == null) {
			listaFilmeB = new ArrayList<FilmeBEAN>();
			//instanciar a classe filme e criar objetos
			
			FilmeBEAN fb = new FilmeBEAN();
			fb.setId(1);
			fb.setAnoLanc(2001);
			fb.setDuracao(2.30);
			fb.setGenero("acao");
			fb.setTitulo("O pequenino");
			
			//adicionando o filme na lista
			listaFilmeB.add(fb);
			
			FilmeBEAN fb2 = new FilmeBEAN();
			fb2.setId(2);
			fb2.setAnoLanc(2001);
			fb2.setDuracao(2.30);
			fb2.setGenero("acao");
			fb2.setTitulo("O pequenino");
			
			//adicionando o filme na lista
			listaFilmeB.add(fb2);
			
			FilmeBEAN fb3 = new FilmeBEAN();
			fb3.setId(3);
			fb3.setAnoLanc(2001);
			fb3.setDuracao(2.30);
			fb3.setGenero("acao");
			fb3.setTitulo("O pequenino");
			
			//adicionando o filme na lista
			listaFilmeB.add(fb3);
		}
		
		
	}


	public List<FilmeBEAN> select(){
		return listaFilmeB;
	}
	
	public FilmeBEAN select(int id){
		for (int i = 0; i < listaFilmeB.size(); i++) {
			if(listaFilmeB.get(i).getId() == id) {
				return listaFilmeB.get(i);
			}
			
		}
		return null;
	}
	
	public boolean insert(FilmeBEAN filmeb){
		return listaFilmeB.add(filmeb);
		
	}
	
	public boolean update(FilmeBEAN filmeb){
		
		for (int i = 0; i < listaFilmeB.size(); i++) {
			if(listaFilmeB.get(i) == filmeb) {
				listaFilmeB.set(i, filmeb);
				return true;
			}
		}
		return false;
	}
	
	public boolean delete(int id) {
		for (int i = 0; i < listaFilmeB.size(); i++) {
			if(listaFilmeB.get(i).getId() == id) {
				return listaFilmeB.remove(listaFilmeB.get(i));
				
			}
		}
		return false;
	}
		
}

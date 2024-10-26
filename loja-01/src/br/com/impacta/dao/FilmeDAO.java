package br.com.impacta.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.bean.FilmeBEAN;

public class FilmeDAO {
	
	public static List<FilmeBEAN> listaFilme = null;
	
	
	
	public FilmeDAO() {
		
		//Implementandoa lista com a estrutura de um ArrayList
		
		if(listaFilme == null) {
			listaFilme = new ArrayList<FilmeBEAN>();
			
			//Instanciar a classe filme para criar alguns Objetos
			
			FilmeBEAN fb = new FilmeBEAN();
			//Criando o primeiro objeto
			
			fb.setId(1);
			fb.setTitulo("Velocidade Terminal");
			fb.setAnoLanc(2021);
			fb.setDuracao(360);
			fb.setGenero("acao");
			// Adicionando o filme na lista
			
			listaFilme.add(fb);
			
			//Criando o segundo objeto
			fb = new FilmeBEAN();
			
			fb.setId(2);
			fb.setTitulo("ET");
			fb.setAnoLanc(1983);
			fb.setDuracao(410);
			fb.setGenero("aventura");
			// Adicionando o filme na lista
			
			listaFilme.add(fb);
			
			//Criando o terceiro objeto
			fb = new FilmeBEAN();

			fb.setId(3);
			fb.setTitulo("A Cor Purpura");
			fb.setAnoLanc(1985);
			fb.setDuracao(370);
			fb.setGenero("drama");
			// Adicionando o filme na lista
			
			listaFilme.add(fb);
			
			
			
			
		}
	}
	
	
	public List<FilmeBEAN> select(){
		
		return listaFilme;
		
	}
	

	public FilmeBEAN select(int id){ //parametro
		
		for (int i = 0; i < listaFilme.size(); i++) {
			
			if(listaFilme.get(i).getId() == id) {
				
				return listaFilme.get(i);
				
			}
			
		}
		
		return null;
		
	}
	
	
	public boolean insert(FilmeBEAN fb){
		
		return listaFilme.add(fb);
		
	}
	
	
	
	public boolean update(FilmeBEAN fb){
		
		for (int i = 0; i < listaFilme.size(); i++) {
			
			if(listaFilme.get(i) == fb) {
				
				 listaFilme.set(i, fb);
   				 return true;
			}
			
		}
		
		return false;
			
	}
	
	
	public boolean delete(int id){
		
		for (int i = 0; i < listaFilme.size(); i++) {
			
			if(listaFilme.get(i).getId() == id) {
				
				 return listaFilme.remove(listaFilme.get(i));
   				 
			}
			
		}
		
		return false;
			
	}
	
	
	
	
	
	
	
	
}

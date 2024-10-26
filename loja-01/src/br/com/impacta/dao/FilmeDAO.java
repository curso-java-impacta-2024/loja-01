package br.com.impacta.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.bean.FilmeBEAN;

public class FilmeDAO {
	
	public static List<FilmeBEAN> listaFilme = null;
	

	public FilmeDAO() {
		
		//Implementando a lista com a estrutura de um Arrylist
		
		if(listaFilme == null) {
			listaFilme = new ArrayList<FilmeBEAN>();
			
			FilmeBEAN fb = new FilmeBEAN();
			fb.setId("1");
			fb.setTitulo("velociadade terminal");
			fb.setAnoLanc(2021);
			fb.setDuracao(360);
			fb.setGenero("ação");
			
			listaFilme.add(fb);
			fb.setId("2");
			fb.setTitulo("ET");
			fb.setAnoLanc(2001);
			fb.setDuracao(410);
			fb.setGenero("aventura");
			
			listaFilme.add(fb);
			fb.setId("3");
			fb.setTitulo("A cor purpura");
			fb.setAnoLanc(2022);
			fb.setDuracao(370);
			fb.setGenero("drama");
					
			
			
		}
		
	}

	
	public List<FilmeBEAN> select(){
		return listaFilme;
	}
	
	public FilmeBEAN select(int id){
		
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

	

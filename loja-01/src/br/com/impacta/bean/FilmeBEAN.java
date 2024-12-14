package br.com.impacta.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class FilmeBEAN {
	private int id;
	private String titulo;
	private double duracao;
	private String genero;
	private int anoLanc;
	
	
}

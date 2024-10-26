package br.com.impacta.bean;

public class FilmeBEAN {
	private int id;
	private String titulo;
	private double duracao;
	private String genero;
	private int anoLanc;
	
	public FilmeBEAN() {
		// TODO Auto-generated constructor stub
	}

	public FilmeBEAN(int id, String titulo, double duracao, String genero, int anoLanc) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.duracao = duracao;
		this.genero = genero;
		this.anoLanc = anoLanc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLanc() {
		return anoLanc;
	}

	public void setAnoLanc(int anoLanc) {
		this.anoLanc = anoLanc;
	}
	
}

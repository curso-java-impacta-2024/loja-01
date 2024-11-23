package br.com.impacta.dao;

<<<<<<< HEAD
=======
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
>>>>>>> master
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.bean.FilmeBEAN;
<<<<<<< HEAD

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
=======
import br.com.impacta.conexao.ConexaoFactory;

public class FilmeDAO {
	
	private Connection con = null;
	
	public FilmeDAO() {
		ConexaoFactory cf = new ConexaoFactory();
		this.con = cf.getConexao();
	}
	
	public List<FilmeBEAN> select(){
		
		String sql = "SELECT * FROM FILME";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<FilmeBEAN> listaFilmes = new ArrayList<FilmeBEAN>();
			
			FilmeBEAN fb;
			
			while (rs.next()) {
				fb = new FilmeBEAN();
				fb.setId(Integer.parseInt(rs.getString("id")));
				fb.setAnoLanc(Integer.parseInt(rs.getString("anoLanc").replace("-", "")));
				fb.setDuracao( Double.parseDouble(rs.getString("duracao")));
				fb.setGenero(rs.getString("genero"));
				fb.setTitulo(rs.getString("titulo"));
				
				listaFilmes.add(fb);
			}
			
			//Encerrar os objetos do BANCO
			rs.close();
			ps.close();
			con.close();
			return  listaFilmes;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	
>>>>>>> master
		
}

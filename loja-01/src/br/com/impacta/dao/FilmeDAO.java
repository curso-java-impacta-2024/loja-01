package br.com.impacta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.conexao.ConexaoFactory;

public class FilmeDAO {
	
	
	
	public static List<FilmeBEAN> listaFilme = null;
	
	private Connection con = null;
	

	
	public FilmeDAO() {
		
		ConexaoFactory cf = new ConexaoFactory(); // Insjeção de dependencia
		
		this.con = cf.getConexao();
		
	}
	
	
	public List<FilmeBEAN> select(){
		
		return listaFilme;
		
	}
	
	public List<FilmeBEAN> select2(){
		
		try {
			
			String sql = "SELECT * FROM FILME";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<FilmeBEAN> list = new ArrayList<FilmeBEAN>();
			
			FilmeBEAN fb;
			
			while(rs.next()) {
				
				fb = new FilmeBEAN();
				
				fb.setId( Integer.parseInt(rs.getString("id")));
				fb.setAnoLanc(Integer.parseInt(rs.getString("anoLanc")));
				fb.setDuracao( Double.parseDouble(rs.getString("duracao")));
				fb.setGenero(rs.getString("genero"));
				fb.setGenero(rs.getString("titulo"));
				
				list.add(fb);
				
				
			}
			
			//Encerrar os objetos do BANCO
			rs.close();
			ps.close();
			con.close();
			return list;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	

	
	
	
	
	
	
	
	
}

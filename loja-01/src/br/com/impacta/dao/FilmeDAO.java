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
	
	
	
		
}

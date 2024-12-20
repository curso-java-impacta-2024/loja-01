package br.com.impacta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.bean.FilmeBEAN;
import br.com.impacta.conexao.ConexaoFactory;

public class FilmeDAO implements FilmeDAOInterface{
	
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
	
	//Crie a assinatura de um m�todo para retornar apenas um registro do banco de dados
	//passando um �nico par�metro...
	
	public FilmeBEAN select(int id) {
		
		String sql = "SELECT * FROM FILME WHERE id = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			FilmeBEAN fb = new FilmeBEAN();
			
			while(rs.next()) {
				fb.setId(Integer.parseInt(rs.getString("id")));
				fb.setAnoLanc(Integer.parseInt(rs.getString("anoLanc").replace("-", "")));
				fb.setDuracao( Double.parseDouble(rs.getString("duracao")));
				fb.setGenero(rs.getString("genero"));
				fb.setTitulo(rs.getString("titulo"));
			}
			
			//Encerrar os objetos do BANCO
			rs.close();
			ps.close();
			con.close();
		
			//Retornando um FilmeBEAN
			return  fb;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(FilmeBEAN fb) {
		
		String sql = "UPDATE FILME SET TITULO = ?, DURACAO = ?, GENERO = ?, ANOLANC = ?"
				+ " WHERE ID = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, fb.getTitulo());
			ps.setDouble(2, fb.getDuracao());
			ps.setString(3, fb.getGenero());
			ps.setInt(4, fb.getAnoLanc());
			ps.setInt(5, fb.getId());
			
			int upFilme = ps.executeUpdate();
			
			System.out.println(upFilme);
			
			ps.close();
			con.close();
			
			if(upFilme>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean insert(FilmeBEAN fb) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}





















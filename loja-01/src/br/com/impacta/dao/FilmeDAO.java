package br.com.impacta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public FilmeBEAN select(int id) {
		
		String sql = "SELECT * FROM FILME WHERE ID = ?";
		
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				
				FilmeBEAN fb =new FilmeBEAN();
				
				while (rs.next()) {
	
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
				
				return fb;

				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return null;

	}

	
	public boolean delete(int id) {
		
		String sql = "DELETE FROM FILME WHERE ID = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			
			int deletedFilme = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			if(deletedFilme > 0) {
				return true;
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		return false;
	}
	
	
	

	@Override
	public boolean update(FilmeBEAN fb) {
	
		String sql = "UPDATE FILME SET TITULO = ?, DURACAO = ?,"
				+ " GENERO = ?, ANOLANC = ? WHERE ID = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, fb.getTitulo());
			ps.setDouble(2, fb.getDuracao());
			ps.setString(3, fb.getGenero());
			ps.setInt(4, fb.getAnoLanc());
			ps.setInt(5, fb.getId());
			
			System.out.println(ps);
			
			int upFilme = ps.executeUpdate();

			System.out.println(upFilme + " linha(s) afe");

			
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
		String sql = "INSERT INTO FILME (TITULO, DURACAO , ANOLANC , GENERO ) VALUES (?, ?, ?, ?)" ;
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, fb.getTitulo());
			ps.setDouble(2, fb.getDuracao());
			ps.setInt(3, fb.getAnoLanc());
			ps.setString(4, fb.getGenero());
			
			int cadastrarFilme = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			if(cadastrarFilme>0) {
				return true;
			}
		}catch (SQLException e ) {
			e.printStackTrace();	
		}
		
		return false;
		
	}
	
	
		
}

package br.com.impacta.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	private Connection con = null;
	private String urLDB = "jdbc:mysql://172.18.37.15:3306/imdb_sabado";
	private String user = "root";
	private String pass = "Imp@ct@";
	
	public Connection getConexao() {
		
		// Realizando a conexão com o banco
		// Utilizamos o DriverManager passando os parâmetros no ordem
		// urLDB, user e pass
		
		try {
			con = DriverManager.getConnection(urLDB, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
		}
		
			System.out.println("CONECTOU!!");
		return con;
		
		
	}
	

}

package br.com.impacta.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
	private Connection con = null;
	private String urlDB = "jdbc:mysql://172.18.37.15:3306/imdb_sabado";
	private String user = "teste";
	private String pass = "impacta1";

	public Connection getConexao() {
		//Realizando a conexão com o banco
		//Uitilizamos o DriverManager passando os parâmetros na ordem:
		//urlDB, user e pass
		try {
			con = DriverManager.getConnection(urlDB, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		System.out.println("CONECTOU!!!");
	
		return con;
	}
	
}

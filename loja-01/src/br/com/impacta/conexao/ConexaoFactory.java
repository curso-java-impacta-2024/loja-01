package br.com.impacta.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	private Connection con = null;
	private String urlDB = "jdbc:mysql://localhost:3306/imdb_sabado";
	private String user = "teste";
	private String pass = "impacta1";
	
	public Connection getConexao() {
		//Realizando a conex�o com o banco
		//Utilizaos o DriverManager passando os par�metros na ordem:
		//urlDB,user e pass
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(urlDB, user, pass);
		} catch (SQLException e) {                                                                               
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				System.out.println("CONECTOU!!");
		return con;
	}
	
}

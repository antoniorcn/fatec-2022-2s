package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteBancoDados {
	private static final String URL = 
			"jdbc:mariadb://localhost:3306/mecanica";
	private static final String USER = "root";
	private static final String PASS = "123456";
	public static void main(String[] args) {	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Classe foi carregada");
			Connection con = 
					DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conectado no banco de dados");
			PreparedStatement stmt = 
				con.prepareStatement("INSERT INTO carros (marca, modelo) "
					+ "VALUES('Volkswagen', 'Fox')");
			int numero = stmt.executeUpdate();
			System.out.println("Executado: " + numero);
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

}

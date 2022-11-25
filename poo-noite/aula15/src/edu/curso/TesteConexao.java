package edu.curso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteConexao {
	
	public final static String URL = 
			"jdbc:mariadb://localhost:3306/times";
	public final static String USER = "root";
	public final static String PASS = "";
	
	public static void main(String[] args) 
			throws ClassNotFoundException {
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Classe carregada");
		
		try (Connection con = 
				DriverManager.getConnection(URL, USER, PASS)) {
			System.out.println("Conectado no banco de dados");
			String sql = "INSERT INTO time "
					+ "(nome, qtd_jogadores, tecnico, estadio) "
					+ "VALUES ('Corinthians', 24, "
					+ "'Vitor Pereira', 'Itaquerão')";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

}

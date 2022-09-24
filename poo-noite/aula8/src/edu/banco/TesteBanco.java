package edu.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteBanco {

	public static void insere(Connection con) throws SQLException { 
		String sql = "INSERT INTO musica (nome, instrumento) " + 
		"VALUES ('Bia', 'Teclado')";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.executeUpdate();
		System.out.println("Inserido no banco");
	}
	
	public static void consultar(Connection con) throws SQLException { 
		String sql = "SELECT * FROM musica";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) { 
			System.out.println(rs.getString("nome") + " - " +
					rs.getString("instrumento"));
		}
	}
	
	public static void main(String[] args) throws SQLException {
		String dbURL = "jdbc:mariadb://localhost:3306/musicas";
		Connection con = 
			DriverManager.getConnection(dbURL, "root", "123456");
		System.out.println("Conectado no banco de dados");
		
		// insere(con);
		consultar(con);
		
		con.close();
	}
}

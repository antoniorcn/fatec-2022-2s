package edu.curso;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class TimeDAOImpl implements TimeDAO {
	public final static String URL = 
			"jdbc:mariadb://localhost:3306/times";
	public final static String USER = "root";
	public final static String PASS = "";
	private Connection con;
	
	public TimeDAOImpl() { 
		try { 
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASS);
			
		} catch(ClassNotFoundException | SQLException e) { 
			e.printStackTrace();
		}
	}
	
	@Override
	public void criar(Time t) {	
		String sql = "INSERT INTO time " +
				"(nome, qtd_jogadores, tecnico, estadio) " +
				"VALUES ('" + t.getNome() + 
				"', " + t.getQtdJogadores() + 
				", '" + t.getTecnico() +
				"', '" + t.getEstadio() + "')";
		try { 
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

	@Override
	public List<Time> pesquisarPorNome(String nome) {
		List<Time> lista = new ArrayList<>();
		String sql = "SELECT * FROM time "
				+ "WHERE nome LIKE '%" + nome + "%'";
		try { 
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) { 
				Time t = new Time();
				t.setNome(rs.getString("nome"));
				t.setQtdJogadores(rs.getInt("qtd_jogadores"));
				t.setTecnico(rs.getString("tecnico"));
				t.setEstadio(rs.getString("estadio"));
				lista.add(t);
			}
		} catch (SQLException e) { 
			e.printStackTrace();
		}
		return lista;
	}
	
	public void apagar(Time t) { 
		String sql = "DELETE FROM time " +
				"WHERE nome = '" + t.getNome() + "'";
		try { 
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}
	
	public void atualizar(String nomeAntigo, Time t) { 
		String sql = "UPDATE time " +
				" SET nome = '" + t.getNome() + 
				"', qtd_jogadores = " + t.getQtdJogadores() + 
				", tecnico = '" + t.getTecnico() +
				"', estadio = '" + t.getEstadio() + 
				"' WHERE nome = '" + nomeAntigo + "'";
		try { 
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

}

package edu.curso;

import java.util.List;

public interface TimeDAO {
	
	void criar(Time t);
	List<Time> pesquisarPorNome(String nome);
	void apagar(Time t);
	void atualizar(String nomeAntigo, Time t);

}

package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Publicador {
	private String nome;
	private List<Assinante> assinantes = new ArrayList<>();
	public Jornal(String nome) { 
		this.nome = nome;
	}
	
	@Override
	public void adicionar(Assinante a) {
		assinantes.add(a);
	}

	@Override
	public void remover(Assinante a) {
		assinantes.remove(a);
	}

	@Override
	public void publicar(String noticia) {
		for (Assinante a : assinantes) { 
			if (a != null) { 
				a.receberNoticia(this.nome + 
						" - " + noticia);
			}
		}
	}

}

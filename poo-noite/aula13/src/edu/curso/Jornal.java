package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class Jornal implements Publicadora {
	private List<Assinante> assinantes = new ArrayList<>();
	private String nome;
	
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
	public void publicar(String s) {
		for (Assinante a : assinantes) { 
			a.ler( "Noticia da " + this.nome + " - " + s );
		}
	}
}

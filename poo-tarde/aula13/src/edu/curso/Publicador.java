package edu.curso;

public interface Publicador {
	void adicionar(Assinante a);
	void remover(Assinante a);
	void publicar(String noticia);
}

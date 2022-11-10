package edu.curso;

public class TesteObserver {

	public static void main(String[] args) {
		Estudante maria = new Estudante("Maria");
		Estudante joao = new Estudante("João");
		Trabalhador osmar = new Trabalhador("Osmar");
		Trabalhador jennifer = new Trabalhador("Jennifer");
		
		Jornal folha = new Jornal("Folha");
		Jornal lance = new Jornal("Lance");
		
		folha.adicionar(maria);
		folha.adicionar(joao);
		lance.adicionar(joao);
		
		folha.adicionar(osmar);
		lance.adicionar(jennifer);
		
		lance.publicar("Brasil hexacampeão");
		folha.publicar("França perde para o Brasil na final");
	}
}

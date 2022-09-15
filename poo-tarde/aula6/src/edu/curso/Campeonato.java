package edu.curso;

public class Campeonato {
	String nome;
	private Jogo[] jogos = new Jogo[7];
	
	public Campeonato(String nome, Time t1, Time t2, Time t3)  { 
		this.nome = nome;
		
		jogos[0] = new Jogo("16/09/2022", "Itaquerao", t1, t3);
		jogos[1] = new Jogo("23/09/2022", "Morumbi", t1, t2);
		jogos[2] = new Jogo("30/09/2022", "Pacaembu", t2, t3);
	}
	
	public void jogarDisputaDeTerceiros() { 
		System.out.println("Jogando as "
				+ "para decidir o 3o lugar no campeonato " + this.nome);
		jogos[2].jogar();
	}
	
	public void jogarSemifinais() { 
		System.out.println("Jogando as "
				+ "semifinais no campeonato " + this.nome);
		jogos[1].jogar();
		jogos[2].jogar();
	}
	
	public void jogarFinal() { 
		System.out.println("Jogando a "
				+ "final no campeonato " + this.nome);
		jogos[0].jogar();
	}

}

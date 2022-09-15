package edu.curso;

public class TesteCampeonato {

	public static void main(String[] args) {
		Jogador j1 = new Jogador("Neymar", 100);
		Jogador j2 = new Jogador("Messi", 100);
		Jogador j3 = new Jogador("Cristiano Ronaldo", 100);
		Jogador j4 = new Jogador("Ronaldo Fenômeno", 100);
		Jogador j5 = new Jogador("Ronaldinho Gaucho", 100);
		Jogador j6 = new Jogador("Rivaldo", 100);
		
		Time t1 = new Time("Corinthians");
		Time t2 = new Time("São Paulo");
		Time t3 = new Time("Palmeiras");
		t3 = null;
		
		t1.jogadores[0] = j1;
		t1.jogadores[1] = j4;
		
		t2.jogadores[0] = j6;
		t2.jogadores[1] = j2;
		
		t3.jogadores[0] = j3;
		t3.jogadores[1] = j5;
			
		Campeonato c1 = new Campeonato("Libertadores", t1, t2, t3);
//		Jogo g1 = new Jogo("16/09/2022", "Itaquerao", t1, t3);
//		Jogo g2 = new Jogo("23/09/2022", "Morumbi", t1, t2);
//		Jogo g3 = new Jogo("30/09/2022", "Pacaembu", t2, t3);

//		c1.jogarSemifinais(g1, g2);
//		c1.jogarFinal(g1);
//		c1.jogarDisputaDeTerceiros(g3);
		
			
	}

}

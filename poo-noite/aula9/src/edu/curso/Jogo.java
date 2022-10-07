package edu.curso;

public class Jogo {
	
	public void realizarPartida(Estadio estadio,
			Selecao a, Selecao b, 
			Torcedor torcedor) {
		estadio.abrigarJogo();
		a.jogar();
		b.jogar();
		torcedor.torcer();
	}
	


}

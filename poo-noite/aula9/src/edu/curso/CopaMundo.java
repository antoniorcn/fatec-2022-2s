package edu.curso;

public class CopaMundo {
	public static void main(String[] args) {
		DiretorFatec joao = new DiretorFatec();
		Fatecanos luis = new Fatecanos();
		Torcida salaPoo = new Torcida();
		
		Selecao brasil = new Selecao();
		Selecao argentina = new Selecao();
		
		Estadio maracana = new Estadio();
					
		Jogo jogo = new Jogo();
		jogo.realizarPartida(maracana, brasil, 
				argentina, joao);
		
	}
}

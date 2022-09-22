package edu.curso;

public class Jogo {
		
	String data;
	int lotacao;
	String nomeEstadio;
	Time[] times = new Time[2];
	
	public Jogo(String data, String estadio, Time time1, Time time2) { 
		this.data = data;
		this.nomeEstadio = estadio;
		this.times[0] = time1;
		this.times[1] = time2;
	}
	
	
	public void jogar() { 
		System.out.println("Jogo ocorrendo em " + this.data + 
				" no " + this.nomeEstadio);
		this.times[0].jogar();
		this.times[1].jogar();
	}


}

package edu.curso;

public class Carro {
	String chassi;
	String cor;
	String placa;
	String fabricante;
	String modelo;
	int ano;
	Pneu[] pneus = new Pneu[4];
	
	public void acelerar() {
		for (int i = 0; i < pneus.length; i++) { 
			pneus[i].rodar();
		}
	}
	
	public void frear() { 
		System.out.println("Reduzindo a velocidade");
	}
	
	public void trocarMarcha() { 
		System.out.println("Trocando a marcha do carro");
	}
	
	public void seta() {
		System.out.println("Acionando a seta");
	}
	
	public void virar() { 
		System.out.println("Virando o volante");
	}
}

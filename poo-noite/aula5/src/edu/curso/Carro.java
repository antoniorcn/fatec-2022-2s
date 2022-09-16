package edu.curso;
public class Carro {
	private Chassi chassi = new Chassi();
	String cor;
	String placa;
	String fabricante;
	String modelo;
	int ano;
	Pneu[] pneus = new Pneu[4];
		
	public void acelerar() {
		if (chassi == null)  { 
			System.out.println("Este carro não tem chassi");
		} else { 
			for (int i = 0; i < pneus.length; i++) { 
				pneus[i].rodar();
			}
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

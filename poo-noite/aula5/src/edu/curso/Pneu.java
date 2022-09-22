package edu.curso;
public class Pneu {
	final static int PRESSAO_MAXIMA = 33;
	int aro;
	int largura;
	String marca;
	int pressao;
	public void rodar() { 
		if (this.pressao > 10) { 
			this.pressao -= 1;
			System.out.println("Pneu esta rodando");
		} else { 
			this.pressao = 10;
			System.out.println("Não pode rodar porque "
					+ "a pressão do pneu esta baixa");
		}
	}
	public void encher() { 
		this.pressao = PRESSAO_MAXIMA;
	}
}

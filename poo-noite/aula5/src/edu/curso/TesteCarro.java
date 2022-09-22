package edu.curso;

public class TesteCarro {
	public static void main(String[] args) {
		Carro ka = new Carro();
		
		Pneu p1 = new Pneu();
		Pneu p2 = new Pneu();
		Pneu p3 = new Pneu();
		Pneu p4 = new Pneu();
		
		Pneu step = new Pneu();
		ka.pneus[0] = step;
		ka.pneus[1] = p2;
		ka.pneus[2] = p3;
		ka.pneus[3] = p4;
		ka.acelerar();
		
		ka = null;
	}
}

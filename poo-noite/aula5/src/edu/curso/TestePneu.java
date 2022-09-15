package edu.curso;

public class TestePneu {
	
	public static void main(String[] args) {
		Pneu p = new Pneu();
		p.encher();
		for (int i = 0; i < 25; i++) { 
			p.rodar();
		}
	}

}

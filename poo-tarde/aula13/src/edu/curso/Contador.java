package edu.curso;

public class Contador {
	private long petCounter = 1;
	private static Contador instancia = null;
	
	private Contador() { 
	}
	
	public static Contador getInstance() { 
		if (Contador.instancia == null) { 
			Contador.instancia = new Contador();
		}
		return Contador.instancia;
	}
	
	public long nextPetCounter() { 
		return this.petCounter++;
	}
}

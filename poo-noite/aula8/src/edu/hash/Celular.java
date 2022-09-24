package edu.hash;

public class Celular {
	
	public String marca;
	public String modelo;
	
	@Override
	public int hashCode() { 
		return marca.hashCode() + modelo.hashCode();
	}
	
	@Override
	public boolean equals(Object c) { 
		return this.hashCode() == c.hashCode();
	}
	
}

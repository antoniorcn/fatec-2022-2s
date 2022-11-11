package edu.curso;

import java.util.ArrayList;
import java.util.List;

public class PetControl {
	
	private List<Pet> lista = new ArrayList<>();
	
	
	public void adicionar(Pet p) { 
		lista.add(p);
	}
	
	public Pet pesquisar(String texto) {
		for (Pet p : lista) { 
			if (p.getNome().contains(texto)) { 
				return p;
			}
		}
		return null;
	}
}

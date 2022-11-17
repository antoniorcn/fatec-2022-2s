package edu.curso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PetControl {
	
	private ObservableList<Pet> lista = FXCollections.observableArrayList();
	
	private LongProperty id = new SimpleLongProperty(0);
	private StringProperty nome = new SimpleStringProperty("");
	private ObjectProperty<LocalDate> nascimento = 
			new SimpleObjectProperty<>(LocalDate.now());
	
	public void adicionar(Pet p) { 
		lista.add(p);
	}
	
	public Pet pesquisar(String nome) { 
		for (Pet p : lista) { 
			if (p.getNome().contains(nome)) { 
				return p;
			}
		}
		return null;
	}
	
	public Pet boundaryToPet() { 
		Pet p = new Pet();
		p.setId(id.get());
		p.setNome(nome.get());
		p.setNascimento(nascimento.get());
		return p;
	}
	
	public void petToBoundary(Pet p) {
		if (p != null) {
			id.set(p.getId());
			nome.set(p.getNome());
			nascimento.set(p.getNascimento());
		}
	}
	
	public void cleanBoundary() { 
		Pet p = new Pet();
		petToBoundary(p);
	}
	
	public void adicionar() { 
		Pet p = boundaryToPet();
		lista.add(p);
	}
	
	public void pesquisar() { 
		for (Pet p : lista) { 
			if (p.getNome().contains(nome.get())) { 
				petToBoundary(p);
			}
		}
	}
	
	public ObservableList<Pet> getLista() { 
		return this.lista;
	}
	
	public LongProperty idProperty() { 
		return this.id;
	}
	public StringProperty nomeProperty() { 
		return this.nome;
	}
	public ObjectProperty<LocalDate> nascimentoProperty() { 
		return this.nascimento;
	}

}

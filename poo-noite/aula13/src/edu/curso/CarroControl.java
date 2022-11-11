package edu.curso;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CarroControl {
	
	private List<Carro> lista = new ArrayList<>();
	
	private LongProperty id = new SimpleLongProperty(0);
	private StringProperty marca = new SimpleStringProperty("");
	private StringProperty modelo = new SimpleStringProperty("");

	
	public void adicionar() { 
		Carro c = new Carro();
		c.setId(id.get());
		c.setMarca(marca.get());
		c.setModelo(modelo.get());
		lista.add(c);
	}
	
	public void pesquisar() { 
		for (Carro c : lista) {
			if (c.getMarca().contains(marca.get())) { 
				id.set(c.getId());
				marca.set(c.getMarca());
				modelo.set(c.getModelo());
				break;
			}
		}
	}
	
	public LongProperty idProperty() { 
		return id;
	}
	public StringProperty marcaProperty() { 
		return marca;
	}
	public StringProperty modeloProperty() { 
		return modelo;
	}
}

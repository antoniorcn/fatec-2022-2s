package edu.curso;

import javafx.beans.property.LongProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CarroControl {
	
	private ObservableList<Carro> lista = 
				FXCollections.observableArrayList();
	
	private LongProperty id = new SimpleLongProperty(0);
	private StringProperty marca = new SimpleStringProperty("");
	private StringProperty modelo = new SimpleStringProperty("");
	
	private Carro carroAtual;

	public void entityToBoundary(Carro c) { 
		if (c != null) { 
			id.set(c.getId());
			marca.set(c.getMarca());
			modelo.set(c.getModelo());
		}
	}
	
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
				entityToBoundary(c);
				break;
			}
		}
	}
	
	public void apagar() { 
		if (this.carroAtual != null) { 
			lista.remove(carroAtual);
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
	
	public ObservableList<Carro> getLista() { 
		return this.lista;
	}

	public Carro getCarroAtual() {
		return carroAtual;
	}
	public void setCarroAtual(Carro carroAtual) {
		this.carroAtual = carroAtual;
	}
}

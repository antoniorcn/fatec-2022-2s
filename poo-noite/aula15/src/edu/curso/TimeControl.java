package edu.curso;

import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TimeControl {
	private StringProperty nome = new SimpleStringProperty("");
	private IntegerProperty qtdJogadores = new SimpleIntegerProperty(0);
	private StringProperty tecnico = new SimpleStringProperty("");
	private StringProperty estadio = new SimpleStringProperty("");
	
	private TimeDAO timeDao = new TimeDAOImpl();
	
	private boolean editando = false;
	private String nomeAntigo = null;
	
	private ObservableList<Time> lista = 
			FXCollections.observableArrayList();
	
	public Time getEntity() { 
		Time t = new Time();
		t.setNome(nome.get());
		t.setQtdJogadores(qtdJogadores.get());
		t.setTecnico(tecnico.get());
		t.setEstadio(estadio.get());
		return t;
	}
	
	public void setEntity(Time t) { 
		nome.set( t.getNome() );
		qtdJogadores.set( t.getQtdJogadores() );
		tecnico.set( t.getTecnico() );
		estadio.set( t.getEstadio() );
	}
	
	public void editar() { 
		this.editando = true;
		this.nomeAntigo = nome.get();
	}
	
	public void salvar() {
		Time t = getEntity();
		if (this.editando) {
			timeDao.atualizar(nomeAntigo, t);
		} else { 
			timeDao.criar(t);
		}
	}
	
	public void limpar() { 
		nome.set("");
		qtdJogadores.set(0);
		tecnico.set("");
		estadio.set("");
		this.editando = false;
		this.nomeAntigo = null;
	}
	
	public void apagar(Time t) { 
		timeDao.apagar(t);
	}
		
	public void pesquisar() { 
		List<Time> tempLista = timeDao.pesquisarPorNome( nome.get() );
		lista.clear();
		lista.addAll(tempLista);
	}
	
	public StringProperty nomeProperty() {
		return nome;
	}
	
	public IntegerProperty qtdJogadoresProperty() {
		return qtdJogadores;
	}
	
	public StringProperty tecnicoProperty() {
		return tecnico;
	}
	
	public StringProperty estadioProperty() {
		return estadio;
	}

	public ObservableList<Time> getLista() {
		return lista;
	}

	public boolean isEditando() {
		return editando;
	}

	public void setEditando(boolean editando) {
		this.editando = editando;
	}

	public String getNomeAntigo() {
		return nomeAntigo;
	}

	public void setNomeAntigo(String nomeAntigo) {
		this.nomeAntigo = nomeAntigo;
	}
}

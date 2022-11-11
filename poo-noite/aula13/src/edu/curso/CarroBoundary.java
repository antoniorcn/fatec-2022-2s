package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LongStringConverter;
import javafx.util.converter.NumberStringConverter;

public class CarroBoundary extends Application {

	private TextField txtId = new TextField();
	private TextField txtMarca = new TextField();
	private TextField txtModelo = new TextField();
	
	private CarroControl control = new CarroControl();
	
	@Override
	public void start(Stage stage) throws Exception {
		GridPane gp = new GridPane();
		Scene scn = new Scene(gp, 400, 300);
		
		Button btnAdicionar = new Button("Adicionar");
		Button btnPesquisar = new Button("Pesquisar");
		
		gp.add(new Label("Id"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Marca"), 0, 1);
		gp.add(txtMarca, 1, 1);
		gp.add(new Label("Modelo"), 0, 2);
		gp.add(txtModelo, 1, 2);
		gp.add(btnAdicionar, 0, 3);
		gp.add(btnPesquisar, 1, 3);
		
		vincular();
		
		btnAdicionar.setOnAction(e-> control.adicionar());
		btnPesquisar.setOnAction(e-> control.pesquisar());
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Carros");
		stage.show();
	}
	
	public void vincular() { 
		Bindings.bindBidirectional(txtMarca.textProperty(), 
				control.marcaProperty());
		Bindings.bindBidirectional(txtModelo.textProperty(), 
				control.modeloProperty());
		StringConverter<? extends Number> converterNumber = 
				new LongStringConverter();

		Bindings.bindBidirectional(txtId.textProperty(), 
				control.idProperty(),
				(StringConverter<Number>) converterNumber);
	}
	
	public static void main(String[] args) {
		Application.launch(CarroBoundary.class, args);
	}

}

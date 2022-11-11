package edu.curso;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application {

	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	
	private PetControl control = new PetControl();
		
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		Scene scn = new Scene(bp, 400, 300);
		bp.setCenter(gp);
		
		gp.add(new Label("ID:"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Nome:"), 0, 1);
		gp.add(txtNome, 1, 1);
		gp.add(new Label("Nascimento:"), 0, 2);
		gp.add(txtNascimento, 1, 2);
		gp.add(btnAdicionar, 0, 3);
		gp.add(btnPesquisar, 1, 3);
		
		btnAdicionar.setOnAction( e-> { 
			Pet p = boundaryToPet();
			control.adicionar(p);
			cleanBoundary();
			Alert a = new Alert(AlertType.INFORMATION, 
					"Pet cadastrado", ButtonType.OK);
			a.show();
		});
		
		btnPesquisar.setOnAction( e-> {
			Pet p = control.pesquisar(txtNome.getText());
			petToBoundary(p);
		});
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Pets");
		stage.show();
	}

	private void cleanBoundary() {
		txtId.setText("");
		txtNome.setText("");
		txtNascimento.setText("");
	}
	
	public Pet boundaryToPet() { 
		Pet p = new Pet();
		p.setId(Long.parseLong(txtId.getText()));
		p.setNome(txtNome.getText());
		p.setNascimento(txtNascimento.getText());
		
		return p;
	}
	
	public void petToBoundary(Pet p) { 
		if (p != null) {
			txtId.setText(String.valueOf(p.getId()));
			txtNome.setText(p.getNome());
			txtNascimento.setText(p.getNascimento());
		}
	}
	
	public static void main(String[] args) {
		Application.launch(PetBoundary.class, args);
	}

}

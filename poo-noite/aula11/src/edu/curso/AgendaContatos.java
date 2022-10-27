package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AgendaContatos extends Application {

	@Override
	public void start(Stage stage) throws Exception {
//		FlowPane fp = new FlowPane();
		GridPane gp = new GridPane();
		Scene scn = new Scene(gp, 300, 200);
		
		Label lblId = new Label("ID: ");
		TextField txtId = new TextField();
		
		Label lblNome = new Label("Nome: ");
		TextField txtNome = new TextField();
		
		Label lblTelefone = new Label("Telefone: ");
		TextField txtTelefone = new TextField();
		
//		fp.getChildren().addAll(lblId, txtId, 
//				lblNome, txtNome, 
//				lblTelefone, txtTelefone);
		
		gp.add(lblId, 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(lblNome, 0, 1);
		gp.add(txtNome, 1, 1);
		gp.add(lblTelefone, 0, 2);
		gp.add(txtTelefone, 1, 2);
		
		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(AgendaContatos.class, args);
	}
}

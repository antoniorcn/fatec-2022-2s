package edu.curso;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class VetBoundary {
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");

	public Node render() {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		
		bp.setTop(gp);
		
		gp.add(new Label("Id"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Nome"), 0, 1);
		gp.add(txtNome, 1, 1);
		gp.add(new Label("Numero Vet"), 0, 2);
		gp.add(txtNascimento, 1, 2);
		gp.add(btnAdicionar, 0, 3);
		gp.add(btnPesquisar, 1, 3);    
		
		btnAdicionar.setOnAction( e -> {
		});

		btnPesquisar.setOnAction( e -> { //Arrow Function
		});
		return bp;
	}

}

package edu.curso;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class TelaB {

	private TextField txtId = new TextField();
	private TextField txtMarca = new TextField();
	private TextField txtModelo = new TextField();

	private TableView<Carro> tableCarro = new TableView<>();
	
	public Node render() {
		GridPane gp = new GridPane();
		BorderPane bp = new BorderPane();
	
		Button btnAdicionar = new Button("Adicionar");
		Button btnPesquisar = new Button("Pesquisar");
		Button btnApagar = new Button("Apagar");
		
		gp.add(new Label("Id"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Marca"), 0, 1);
		gp.add(txtMarca, 1, 1);
		gp.add(new Label("Modelo"), 0, 2);
		gp.add(txtModelo, 1, 2);
		gp.add(btnAdicionar, 0, 3);
		gp.add(btnPesquisar, 1, 3);
		gp.add(btnApagar, 2, 3);
		
		// gp.setStyle("-fx-background-color: 'yellow';");
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(30);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(70);
		gp.getColumnConstraints().addAll(col1, col2);
		
		bp.setTop(gp);
		bp.setCenter(tableCarro);
		
		BorderPane.setAlignment(gp, Pos.CENTER);
		bp.setPadding(new Insets(20));
		BorderPane.setMargin(gp, new Insets(30));
		return bp;
	}
}
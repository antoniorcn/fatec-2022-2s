package edu.curso;

import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Formulario extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();
		Scene scn = new Scene(grid, 600, 200);
		
		Label lblId = new Label("Id: ");
		TextField txtId = new TextField();
		
		Label lblNome = new Label("Nome: ");
		TextField txtNome = new TextField();

		Label lblTelefone = new Label("Telefone: ");
		TextField txtTelefone = new TextField();
				
		grid.add(lblId, 0, 0);
		grid.add(txtId, 1, 0);
		grid.add(lblNome, 0, 1);
		grid.add(txtNome, 1, 1);
		grid.add(lblTelefone, 0, 2);
		grid.add(txtTelefone, 1, 2);
		
		TranslateTransition animation1 = 
				new TranslateTransition(Duration.seconds(0.3));
		animation1.setFromX(500);
		animation1.setToX(0);
		animation1.setNode(txtId);
		
		RotateTransition animation11 = new RotateTransition(
				Duration.seconds(0.3));
		animation11.setNode(txtId);
		animation11.setFromAngle(90);
		animation11.setToAngle(0);
		animation11.play();
		
		TranslateTransition animation2 = 
				new TranslateTransition(Duration.seconds(0.3));
		animation2.setFromX(500);
		animation2.setToX(0);
		animation2.setNode(txtNome);
			
		TranslateTransition animation3 = 
				new TranslateTransition(Duration.seconds(0.3));
		animation3.setFromX(500);
		animation3.setToX(0);
		animation3.setNode(txtTelefone);

		SequentialTransition animateAll = 
				new SequentialTransition(
				animation1, animation2, animation3);
		animateAll.play();
		
		Button btnSalvar = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");
		
		grid.add(btnSalvar, 0, 3);
		grid.add(btnPesquisar, 1, 3);
		
		RowConstraints row1 = new RowConstraints();
		row1.setPercentHeight(25);
		RowConstraints row2 = new RowConstraints();
		row2.setPercentHeight(25);
		RowConstraints row3 = new RowConstraints();
		row3.setPercentHeight(25);
		RowConstraints row4 = new RowConstraints();
		row4.setPercentHeight(25);
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(75);
		grid.getColumnConstraints().addAll(col1, col2);
		grid.getRowConstraints().addAll(row1, row2, row3, row4);
		grid.setPadding(new Insets(10));
		
		stage.setScene(scn);
		stage.setTitle("Fomulário Cadastro Contatos");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Formulario.class, args);
	}

}
;
package edu.curso;

import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

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
		
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(25);
		
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(75);
		
		gp.getColumnConstraints().addAll(col1, col2);
		gp.setPadding(new Insets(10));
		
//		RotateTransition rt1 = new RotateTransition(
//				Duration.seconds(3), lblId);
//		rt1.setFromAngle(180);
//		rt1.setToAngle(0);
//		rt1.play();
		
		TranslateTransition tt1 = new TranslateTransition(
				Duration.seconds(0.3), lblId);
		tt1.setFromY(400);
		tt1.setToY(0);
		tt1.play();
		
		TranslateTransition tt2 = new TranslateTransition(
				Duration.seconds(0.3), txtId);
		tt2.setFromX(400);
		tt2.setToX(0);
//		tt2.play();
		
		TranslateTransition tt3 = new TranslateTransition(
				Duration.seconds(0.3), txtNome);
		tt3.setFromX(400);
		tt3.setToX(0);
//		tt3.play();
		
		TranslateTransition tt4 = new TranslateTransition(
				Duration.seconds(0.3), txtTelefone);
		tt4.setFromX(400);
		tt4.setToX(0);
//		tt4.play();
		
		SequentialTransition st1 = new SequentialTransition(
				tt1, tt2, tt3, tt4
				);
		st1.play();
		stage.setScene(scn);
		stage.setTitle("Agenda de Contatos");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(AgendaContatos.class, args);
	}
}

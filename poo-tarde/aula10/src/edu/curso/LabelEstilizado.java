package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LabelEstilizado extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Pane painelFundo = new Pane();
		
		FlowPane painelComTexto = new FlowPane();
		Text txt = new Text("Com Estilo");
		painelComTexto.getChildren().add(txt);
		DropShadow sh = new DropShadow(5, 5, 5, Color.BLACK);
		painelComTexto.setStyle("-fx-text-fill: 'red'; "
				+ "-fx-font-size: 3em;"
				+ "-fx-font-weight: bold;"
				+ "-fx-background-color: 'yellow';"
				+ "-fx-border-color: 'blue';"
				+ "-fx-border-width: 3px;"
				+ "-fx-border-radius: 50;"
				+ "-fx-background-radius: 50;"
				+ "-fx-effect: dropshadow( one-pass-box, black, 8, 0.0, 3, 3)");
		painelComTexto.relocate(100, 100);
		painelFundo.getChildren().add(painelComTexto);
		Scene scn = new Scene(painelFundo, 400, 300);
		stage.setScene(scn);
		stage.setTitle("Teste de Estilos");
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch(LabelEstilizado.class, args);
	}
}

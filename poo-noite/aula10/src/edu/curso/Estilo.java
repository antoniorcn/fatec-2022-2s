package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Estilo extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
		Scene scn = new Scene(painel, 600, 400);
		
		Pane fundo = new Pane();
		fundo.relocate(100, 100);
		fundo.setPrefSize(430, 150);
		fundo.setStyle("-fx-background-color: 'bisque';"
				+ "-fx-border-color: 'chocolate';"
				+ "-fx-border-width: 3px;"
				+ "-fx-border-radius: 30;"
				+ "-fx-background-radius: 30;"
				+ "-fx-effect: dropshadow(gaussian, gray, 10, 0, 5, 5);");
		
		Text txt = new Text("Teste de Estilo");
		txt.setStyle("-fx-font-size: 4em; "
				+ "-fx-stroke: yellow; -fx-fill: red;"
				+ "-fx-font-weight: bold;"
				+ "-fx-effect: dropshadow( gaussian, black, 10, "
				+ "0, 5, 5);");
		txt.relocate(150, 175);
		painel.getChildren().add(fundo);
		painel.getChildren().add(txt);
		stage.setScene(scn);
		stage.setTitle("Teste de Estilo");
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch(Estilo.class, args);
	}
}

package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MeuPrimeiroProgramaJavaFX 
			extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		Pane painel = new Pane();
		Scene scn = new Scene(painel, 600, 400);
		Button btn = new Button("Ok");
		btn.relocate(200, 100);
		painel.getChildren().add(btn);
		
		stage.setScene(scn);
		stage.setTitle("Meu primeiro programa JavaFX");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}

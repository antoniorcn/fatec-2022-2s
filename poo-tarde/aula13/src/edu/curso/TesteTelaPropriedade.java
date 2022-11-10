package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TesteTelaPropriedade extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 400, 200);
		
		TextField txtInput = new TextField();
		Button btnTeste = new Button("Teste");
		
		txtInput.textProperty().addListener(
			(observavel, antigo, novo) -> {
				System.out.println("Texto novo: " + novo);
				int valor = Integer.parseInt(novo);
				if (valor > 0) { 
					btnTeste.setStyle("-fx-background-color: 'blue';");
				} else {
					btnTeste.setStyle("-fx-background-color: 'red';");
				}
			});
		
		bp.setTop(txtInput);
		bp.setBottom(btnTeste);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Propriedades");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteTelaPropriedade.class, args);
	}

}

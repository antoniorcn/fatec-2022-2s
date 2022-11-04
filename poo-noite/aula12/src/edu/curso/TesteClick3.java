package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TesteClick3 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 300, 300);
		
		Button btnOk = new Button("Ok");
		Label lblTexto = new Label("Texto");
		
		btnOk.addEventFilter(ActionEvent.ANY, 
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent e) { 
						lblTexto.setText("Novo Valor");
					}
		});
		
		bp.setTop(lblTexto);
		bp.setBottom(btnOk);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Click");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteClick3.class, args);
	}
}

package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

class Manipulador implements EventHandler<ActionEvent> { 
	 Label lblValor; 
	 public void handle(ActionEvent e) { 
		 lblValor.setText("Outro Texto");
	 }
}
public class TesteClick1 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 300, 300);
		Label lblTexto = new Label("Texto");
		Button btnOk = new Button("Ok");
		Manipulador man = new Manipulador();
		man.lblValor = lblTexto;
		btnOk.addEventFilter(ActionEvent.ANY, man);
		
		bp.setTop(lblTexto);
		bp.setBottom(btnOk);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Click");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteClick1.class, args);
	}

}

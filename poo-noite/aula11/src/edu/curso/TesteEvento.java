package edu.curso;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


class Manipuladora implements EventHandler<MouseEvent> {
	public void handle(MouseEvent evento) { 
		// System.out.println("Mouse clicado");
		if (evento.getTarget() instanceof Button) {
			Button btn = (Button) evento.getTarget();
			if (evento.getEventType() == MouseEvent.MOUSE_ENTERED) { 
				btn.setStyle("-fx-background-color: 'red';");
			} else if (evento.getEventType() == MouseEvent.MOUSE_EXITED){ 
				btn.setStyle("-fx-background-color: 'blue';");
			}
		}
	}
}

class ManipuladoraTec implements EventHandler<KeyEvent> {
	@Override
	public void handle(KeyEvent event) {
		KeyCode k = event.getCode();
		System.out.printf("Code: %d   Char: %s%n",
					k.getCode(), k.getChar());
	} 
}

public class TesteEvento extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 300, 300);
		
		Button btnOk = new Button("Ok");
		bp.setCenter(btnOk);
		
		
		Label lblTeste = new Label("Teste de Evento");
		bp.setBottom(lblTeste);
		
		Manipuladora man = new Manipuladora();
		ManipuladoraTec manTec = new ManipuladoraTec();
		
		scn.addEventFilter(KeyEvent.KEY_PRESSED, manTec);
		
		btnOk.addEventHandler(MouseEvent.ANY, man);
		
		lblTeste.addEventFilter(MouseEvent.MOUSE_PRESSED, man);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Eventos");
		stage.show();
	}
	public static void main(String[] args) {
		Application.launch(TesteEvento.class, args);
	}
}

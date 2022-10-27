package edu.curso;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

class Manipulador implements EventHandler<MouseEvent> {
	@Override
	public void handle(MouseEvent event) {
		System.out.println("Botão Apertado");
	}
}

class ManipuladorAction implements EventHandler<ActionEvent> {
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Botão foi acionado");
	} 
}

class ManipuladorTeclado implements 
			EventHandler<KeyEvent> {
	@Override
	public void handle(KeyEvent event) {
		System.out.print("Botão Apertado com o teclado ");
		System.out.printf("Code: %d   Text'%s' %n",
				event.getCode().getCode(), event.getText());
	}
}

public class EventosBotaoOk extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane painel = new BorderPane();
		Button btnOk = new Button("Ok");
		painel.setCenter(btnOk);
		Scene scn = new Scene(painel, 300, 300);
		
//		Manipulador man = new Manipulador();
		ManipuladorTeclado manTec = new ManipuladorTeclado();
		
		ManipuladorAction man = new ManipuladorAction();
		
//		btnOk.addEventFilter(MouseEvent.MOUSE_PRESSED, 
//				man);
//		btnOk.addEventFilter(KeyEvent.KEY_PRESSED, manTec);
		
		btnOk.addEventFilter(ActionEvent.ANY, man);
		
		Button btnCancel = new Button("Cancela");
		btnCancel.addEventFilter(KeyEvent.KEY_PRESSED, manTec);
		
		painel.setBottom(btnCancel);
		stage.setScene(scn);
		stage.setTitle("Teste de Evento no Botão");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(EventosBotaoOk.class, args);
	}

}

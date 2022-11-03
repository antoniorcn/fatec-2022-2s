package edu.curso;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class TesteBotao2 extends Application 
			implements EventHandler<ActionEvent> {
	
	private Label lblTexto = new Label("Label Texto");
	 
	public void handle(ActionEvent e) { 
		lblTexto.setText("Botão apertado");
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane bp = new BorderPane();
		Button btnOk = new Button("Ok");

		btnOk.addEventFilter(ActionEvent.ANY, this);
				
		Scene scn = new Scene(bp, 300, 300);
		bp.setBottom(btnOk);
		bp.setTop(lblTexto);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Clique Botão");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteBotao2.class, args);
	}

}

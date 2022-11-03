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
	private Label lblValorTexto;
	public void handle(ActionEvent e) { 
		lblValorTexto.setText("Botão apertado");
	}
	
	public Label getLblValorTexto() {
		return lblValorTexto;
	}
	public void setLblValorTexto(Label lblValorTexto) {
		this.lblValorTexto = lblValorTexto;
	}
}

public class TesteBotao extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane bp = new BorderPane();
		Button btnOk = new Button("Ok");
		Label lblTexto = new Label("Label Texto");
		
		Manipulador man = new Manipulador();
		man.setLblValorTexto(  lblTexto );
				
		btnOk.addEventFilter(ActionEvent.ANY, man);
				
		Scene scn = new Scene(bp, 300, 300);
		bp.setBottom(btnOk);
		bp.setTop(lblTexto);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Clique Botão");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteBotao.class, args);
	}

}

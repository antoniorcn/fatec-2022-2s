package edu.curso;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class TesteBotao3 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane bp = new BorderPane();
		Button btnOk = new Button("Ok");
		Button btnVisivel = new Button("Visivel");
		Label lblTexto = new Label("Label Texto");
		lblTexto.setVisible(false);
		
		EventHandler<ActionEvent> man = 
				new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) { 
				// Label lbl = new Label("Botão Apertado");
				// bp.setTop(lbl);
				lblTexto.setText("Botão Apertado");
			}
		};
		
		btnVisivel.addEventHandler(ActionEvent.ANY,
			new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) { 
					lblTexto.setVisible(true);
				}
		});
		
		btnOk.addEventFilter(ActionEvent.ANY, man);
				
		Scene scn = new Scene(bp, 300, 300);
		bp.setBottom(btnOk);
		bp.setTop(lblTexto);
		bp.setRight(btnVisivel);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Clique Botão");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteBotao3.class, args);
	}

}

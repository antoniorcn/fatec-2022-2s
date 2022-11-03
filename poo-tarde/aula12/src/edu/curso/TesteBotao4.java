package edu.curso;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class TesteBotao4 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane bp = new BorderPane();
		Button btnOk = new Button("Ok");
		Button btnVisivel = new Button("Visivel");
		Label lblTexto = new Label("Label Texto");
		lblTexto.setVisible(false);
		
		btnVisivel.addEventHandler(ActionEvent.ANY,
			(e) -> {
				lblTexto.setVisible(true);	
		});
		
//		btnOk.addEventHandler(ActionEvent.ANY,
//				e -> lblTexto.setText("Outro Texto") 
//		);
		
		btnOk.setOnAction(
				e -> lblTexto.setText("Outro Texto")
		);		
				
		Scene scn = new Scene(bp, 300, 300);
		bp.setBottom(btnOk);
		bp.setTop(lblTexto);
		bp.setRight(btnVisivel);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Clique Botão");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteBotao4.class, args);
	}

}

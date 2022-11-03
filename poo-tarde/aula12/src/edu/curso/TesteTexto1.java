package edu.curso;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class TesteTexto1 extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane bp = new BorderPane();
		Button btnAplicar = new Button("Aplicar");
		Label lblTexto = new Label("Histórico");
		TextField txtEstilo = new TextField("Digite o estilo");
		
		lblTexto.setVisible(true);
		
		btnAplicar.setOnAction( e -> {
			lblTexto.setStyle( txtEstilo.getText() );
			lblTexto.setText( lblTexto.getText() + 
					"\n" + txtEstilo.getText());
		});
		
				
		Scene scn = new Scene(bp, 300, 300);
		bp.setBottom(btnAplicar);
		bp.setTop(txtEstilo);
		bp.setCenter(lblTexto);
		
		stage.setScene(scn);
		stage.setTitle("Teste de Clique Botão");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteTexto1.class, args);
	}

}

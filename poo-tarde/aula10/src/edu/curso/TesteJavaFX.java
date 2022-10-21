package edu.curso;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class TesteJavaFX extends Application {
	@Override
	public void start(Stage stage) { 
		Pane painel = new Pane();
		Scene scn = new Scene(painel, 800, 600);
		
		Button btn = new Button("Hello World");
		btn.relocate(250, 300);
		painel.getChildren().add(btn);
		
		Label lbl = new Label("Meu Primeiro Programa JavaFX");
		lbl.relocate(250, 100);
		painel.getChildren().add(lbl);
		
		Label lblNome = new Label("Nome: ");
		lblNome.relocate(250, 150);
		painel.getChildren().add(lblNome);
		
		TextField txtNome = new TextField();
		txtNome.relocate(350, 150);
		painel.getChildren().add(txtNome);
		stage.setScene(scn);
		stage.setTitle("Teste de JavaFX");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteJavaFX.class, args);
	}
}

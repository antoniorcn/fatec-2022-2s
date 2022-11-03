package edu.curso;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TesteIcone extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		FlowPane fp = new FlowPane();
		
		Label lblTeste = new Label("Teste de Icone");
		Image img = new Image("images/dog.jpg");
		ImageView imgView = new ImageView(img);
		
		stage.getIcons().add(img);
		
		fp.getChildren().addAll(lblTeste, imgView);
		
		Scene scn = new Scene(fp, img.getWidth(), img.getHeight());
		
		stage.setScene(scn);
		stage.setTitle("Teste de Icone");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(TesteIcone.class, args);
	}

}

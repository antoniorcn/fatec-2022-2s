package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestePropertyJavaFX extends Application {
	@Override
	public void start(Stage stage) throws Exception {	
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 400, 200);
		
		TextField txt = new TextField("0");
		Label lblValor = new Label("0");
		
//		txt.textProperty().addListener(
//			(observable, antigo, novo) -> {
//				lblValor.setText(novo);
//				double valor = Double.parseDouble(novo); 
//				if (valor > 0) { 
//					lblValor.setStyle("-fx-background-color: 'blue'");
//				} else { 
//					lblValor.setStyle("-fx-background-color: 'red'");
//				}
//			}
//		);
		
		// Bindings.bindBidirectional(txt.textProperty(), 
		//		lblValor.textProperty());

		lblValor.textProperty().bind(txt.textProperty());
		
		BorderPane.setAlignment(lblValor, Pos.CENTER);
		
		bp.setTop(txt);
		bp.setBottom(lblValor);
		
		stage.setScene(scn);
		stage.setTitle("Mudança de cor");
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(TestePropertyJavaFX.class, args);
	}
}

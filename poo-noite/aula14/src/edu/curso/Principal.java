package edu.curso;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal extends Application {

	private TelaA telaA = new TelaA();
	private TelaB telaB = new TelaB();
	
	@Override
	public void start(Stage stage) {
		BorderPane bp = new BorderPane();
		
		Scene scn = new Scene(bp, 800, 600);
		
		MenuBar mnuBar = new MenuBar();
		Menu mnuTelas = new Menu("Telas");
		mnuBar.getMenus().add(mnuTelas);
		
		MenuItem mnuTelaA = new MenuItem("Tela A");
		mnuTelaA.setOnAction(e->{bp.setCenter(telaA.render());});
		MenuItem mnuTelaB = new MenuItem("Tela B");
		mnuTelaB.setOnAction(e->{bp.setCenter(telaB.render());});
		
		mnuTelas.getItems().addAll(mnuTelaA, mnuTelaB);
		
		bp.setTop(mnuBar);
		bp.setCenter(telaB.render());
		
		stage.setScene(scn);
		stage.setTitle("Sistema de Mecanica");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Principal.class, args);
	}
}
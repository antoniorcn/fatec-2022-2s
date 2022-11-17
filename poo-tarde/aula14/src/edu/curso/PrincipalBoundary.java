package edu.curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

public class PrincipalBoundary extends Application {
	private Button btnPets = new Button("Pets");
	private Button btnVets = new Button("Vets");
	
	private VetBoundary boundaryA = new VetBoundary();
	private PetInnerBoundary boundaryB = new PetInnerBoundary();

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		
		bp.setBottom(gp);
		bp.setCenter(boundaryA.render());

		gp.add(btnPets, 0, 0);
		gp.add(btnVets, 0, 1);    
		
		btnPets.setOnAction( e -> {
			bp.setCenter(boundaryB.render());
		});

		btnVets.setOnAction( e -> { //Arrow Function
			bp.setCenter(boundaryA.render());
		});
		
		Scene scn = new Scene(bp, 600, 300);
		
		stage.setScene(scn);
		stage.getIcons().add(
				new Image(
		"https://www.stickersdevs.com.br/wp-content/uploads/2022/01/java-adesivo-sticker-768x768.png"));
		stage.setTitle("Gestão de Veterinario");
		stage.show();	
	}
	
	public static void main(String[] args) {
		Application.launch(PrincipalBoundary.class, args);
	}

}

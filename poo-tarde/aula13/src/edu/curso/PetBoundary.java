package edu.curso;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetBoundary extends Application {
	private Contador contador = Contador.getInstance();
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");

	private DateTimeFormatter dtf = 
			DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private PetControl control = new PetControl();
	
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		
		bp.setCenter(gp);
		
		gp.add(new Label("Id"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Nome"), 0, 1);
		gp.add(txtNome, 1, 1);
		gp.add(new Label("Nascimento"), 0, 2);
		gp.add(txtNascimento, 1, 2);
		gp.add(btnAdicionar, 0, 3);
		gp.add(btnPesquisar, 1, 3);
		
		cleanBoundary();
		
		btnAdicionar.setOnAction(e->{
			Pet p = boundaryToEntity();
			control.adicionar(p);
			cleanBoundary();
		});

		btnPesquisar.setOnAction(e->{
			Pet p = control.pesquisar(txtNome.getText());
			if (p != null ) { 
				entityToBoundary(p);
			} else { 
				Alert a = new Alert(AlertType.ERROR, 
							"Pet inexistente", 
							ButtonType.CLOSE, ButtonType.CANCEL);
				stage.hide();
				a.showAndWait();
				stage.show();
			}
		});
		
		Scene scn = new Scene(bp, 400, 200);
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Pets");
		stage.show();	
	}
	
	public Pet boundaryToEntity() {
		Pet p = new Pet();
		p.setId(
				Long.parseLong(txtId.getText())
			    );
		p.setNome(txtNome.getText());
		LocalDate dt = LocalDate.parse(txtNascimento.getText(), dtf);
		p.setNascimento(dt);
		return p;
	}
	
	public void cleanBoundary() { 
		Pet p = new Pet();
		p.setId(contador.nextPetCounter());
		entityToBoundary(p);
	}
	
	public void entityToBoundary(Pet p) { 
		if (p != null) {
			txtId.setText(String.valueOf(p.getId()));
			txtNome.setText(p.getNome());
			String txtData = dtf.format(p.getNascimento());
			txtNascimento.setText(txtData);
		}
	}

	public static void main(String[] args) {
		Application.launch(PetBoundary.class, args);
	}
}

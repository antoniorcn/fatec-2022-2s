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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.NumberStringConverter;

public class PetBoundary extends Application {
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	
	private TableView<Pet> tablePet = new TableView<>();

	private DateTimeFormatter dtf = 
			DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private PetControl control = new PetControl();
	
	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();
		
		bp.setTop(gp);
		bp.setCenter(tablePet);
		
		gp.add(new Label("Id"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Nome"), 0, 1);
		gp.add(txtNome, 1, 1);
		gp.add(new Label("Nascimento"), 0, 2);
		gp.add(txtNascimento, 1, 2);
		gp.add(btnAdicionar, 0, 3);
		gp.add(btnPesquisar, 1, 3);

		StringConverter<? extends Number> converterNumber = 
				new NumberStringConverter();
		StringConverter<? extends LocalDate> converterDate = 
				new LocalDateStringConverter();       

		
		Bindings.bindBidirectional(control.nomeProperty(),
				txtNome.textProperty());
		Bindings.bindBidirectional(txtId.textProperty(),
				control.idProperty(), 
				(StringConverter<Number>) converterNumber);
		Bindings.bindBidirectional(txtNascimento.textProperty(), 
				control.nascimentoProperty(), 
				(StringConverter<LocalDate>)converterDate);
		
		control.cleanBoundary();
		
		TableColumn<Pet, Long> col1 = new TableColumn<>("ID");
		col1.setCellValueFactory(
				new PropertyValueFactory<Pet, Long>("id") ); 	

		TableColumn<Pet, String> col2 = new TableColumn<>("Nome");
		col2.setCellValueFactory(
				new PropertyValueFactory<Pet, String>("nome") ); 	
		
		TableColumn<Pet, LocalDate> col3 = new TableColumn<>("Nascimento");
		col3.setCellValueFactory(
				new PropertyValueFactory<Pet, LocalDate>("nascimento") ); 	
		
		tablePet.setItems(control.getLista());
		tablePet.getColumns().addAll(col1, col2, col3);
	 
		
		btnAdicionar.setOnAction( e -> {
			control.adicionar();
		});

		btnPesquisar.setOnAction( e -> { //Arrow Function
			control.pesquisar();
		});
		
		Scene scn = new Scene(bp, 600, 300);
		
		stage.setScene(scn);
		stage.setTitle("Gest?o de Pets");
		stage.show();	
		stage.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
			System.out.println(e);
			e.consume();
		});
	}
	

	public static void main(String[] args) {
		System.out.println("App iniciado");
		Application.launch(PetBoundary.class, args);
	}
}

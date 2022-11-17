package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LongStringConverter;

public class CarroBoundary extends Application {

	private TextField txtId = new TextField();
	private TextField txtMarca = new TextField();
	private TextField txtModelo = new TextField();
	
	private CarroControl control = new CarroControl();
	
	private TableView<Carro> tableCarro = new TableView<>();
	
	@Override
	public void start(Stage stage) throws Exception {
		GridPane gp = new GridPane();
		BorderPane bp = new BorderPane();
		Scene scn = new Scene(bp, 800, 600);
		
		Button btnAdicionar = new Button("Adicionar");
		Button btnPesquisar = new Button("Pesquisar");
		Button btnApagar = new Button("Apagar");
		
		gp.add(new Label("Id"), 0, 0);
		gp.add(txtId, 1, 0);
		gp.add(new Label("Marca"), 0, 1);
		gp.add(txtMarca, 1, 1);
		gp.add(new Label("Modelo"), 0, 2);
		gp.add(txtModelo, 1, 2);
		gp.add(btnAdicionar, 0, 3);
		gp.add(btnPesquisar, 1, 3);
		gp.add(btnApagar, 2, 3);
		
		// gp.setStyle("-fx-background-color: 'yellow';");
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(30);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(70);
		gp.getColumnConstraints().addAll(col1, col2);
		
		bp.setTop(gp);
		bp.setCenter(tableCarro);
		
		BorderPane.setAlignment(gp, Pos.CENTER);
		bp.setPadding(new Insets(20));
		BorderPane.setMargin(gp, new Insets(30));
		
		vincular();
		alimentarTable();
		
		btnAdicionar.setOnAction(e-> control.adicionar());
		btnPesquisar.setOnAction(e-> control.pesquisar());
		btnApagar.setOnAction(e-> control.apagar());
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Carros");
		stage.show();
	}
	
	public void alimentarTable() { 
		TableColumn<Carro, Long> col1 = new TableColumn<>("Id");
		col1.setCellValueFactory(
				new PropertyValueFactory<Carro, Long>("id"));
		
		TableColumn<Carro, String> col2 = new TableColumn<>("Marca");
		col2.setCellValueFactory(
				new PropertyValueFactory<Carro, String>("marca"));
		
		TableColumn<Carro, String> col3 = new TableColumn<>("Modelo");
		col3.setCellValueFactory(
				new PropertyValueFactory<Carro, String>("modelo"));	
		
		tableCarro.getColumns().addAll(col1, col2, col3);
		tableCarro.setItems(control.getLista());
		
		tableCarro.getSelectionModel()
		.selectedItemProperty()
		.addListener((obs, antigo, novo) -> {
			// System.out.println(novo.getModelo());
			control.entityToBoundary(novo);
			control.setCarroAtual(novo);
		});
		
	}
	
	public void vincular() { 
		Bindings.bindBidirectional(txtMarca.textProperty(), 
				control.marcaProperty());
		Bindings.bindBidirectional(txtModelo.textProperty(), 
				control.modeloProperty());
		StringConverter<? extends Number> converterNumber = 
				new LongStringConverter();

		Bindings.bindBidirectional(txtId.textProperty(), 
				control.idProperty(),
				(StringConverter<Number>) converterNumber);
	}
	
	public static void main(String[] args) {
		Application.launch(CarroBoundary.class, args);
	}

}

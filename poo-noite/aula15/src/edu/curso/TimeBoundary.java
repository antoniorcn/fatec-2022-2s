package edu.curso;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.NumberStringConverter;

public class TimeBoundary extends Application {
	private TextField txtNome = new TextField("");
	private TextField txtQtdJogadores = new TextField("");
	private TextField txtTecnico = new TextField("");
	private TextField txtEstadio = new TextField("");

	private TimeControl control = new TimeControl();

	private Button btnSalvar = new Button("Salvar");
	private Button btnPesquisar = new Button("Pesquisar");

	private TableView<Time> table = new TableView<>();

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane bp = new BorderPane();
		GridPane gp = new GridPane();

		Scene scn = new Scene(bp, 400, 300);
		bp.setTop(gp);
		bp.setCenter(table);

		prepararTable();

		gp.add(new Label("Nome"), 0, 0);
		gp.add(txtNome, 1, 0);
		gp.add(new Label("Qtd Jogadores"), 0, 1);
		gp.add(txtQtdJogadores, 1, 1);
		gp.add(new Label("Tecnico"), 0, 2);
		gp.add(txtTecnico, 1, 2);
		gp.add(new Label("Estadio"), 0, 3);
		gp.add(txtEstadio, 1, 3);

		gp.add(btnSalvar, 0, 4);
		gp.add(btnPesquisar, 1, 4);

		btnSalvar.setOnAction( e -> { 
			control.salvar();
			control.limpar();
			control.pesquisar();
		});

		btnPesquisar.setOnAction( e -> control.pesquisar() );

		vincular();

		stage.setScene(scn);
		stage.setTitle("Gestão de Times");
		stage.show();
	}

	private void prepararTable() {
		TableColumn<Time, String> col1 = new TableColumn<>("Nome");
		col1.setCellValueFactory(
				new PropertyValueFactory<Time, String>("nome") ); 

		TableColumn<Time, Integer> col2 = new TableColumn<>("Qtd Jogadores");
		col2.setCellValueFactory(
				new PropertyValueFactory<Time, Integer>("qtdJogadores") ); 

		TableColumn<Time, String> col3 = new TableColumn<>("Tecnico");
		col3.setCellValueFactory(
				new PropertyValueFactory<Time, String>("tecnico") ); 

		TableColumn<Time, String> col4 = new TableColumn<>("Estadio");
		col4.setCellValueFactory(
				new PropertyValueFactory<Time, String>("estadio") ); 

		TableColumn<Time, String> col5 = new TableColumn<>("Ações");
//		col5.setCellValueFactory(
//				new PropertyValueFactory<Time, String>("DUMMY"));

		Callback<TableColumn<Time, String>, TableCell<Time, String>> cellFactory
		= //
		new Callback<TableColumn<Time, String>, TableCell<Time, String>>() {
			@Override
			public TableCell call(final TableColumn<Time, String> param) {
				final TableCell<Time, String> cell = new TableCell<Time, String>() {
					final Button btnApagar = new Button("Apagar");
					final Button btnEditar = new Button("Editar");
					
					@Override
					public void updateItem(String item, boolean empty) {
						super.updateItem(item, empty);
						if (empty) {
							setGraphic(null);
							setText(null);
						} else {
							btnApagar.setOnAction(event -> {
								Time t = getTableView().getItems().get(getIndex());
								control.apagar(t);
								control.limpar();
								control.pesquisar();
							});
							btnEditar.setOnAction(event -> {
								Time t = getTableView().getItems().get(getIndex());
								control.setEntity(t);
								control.editar();
							});
							FlowPane fpanel = new FlowPane();
							fpanel.getChildren().addAll(btnEditar, btnApagar);
							setGraphic(fpanel);
							setText(null);
						}
					}
				};
				return cell;
			}
		};
		col5.setCellFactory(cellFactory);

		table.getColumns().clear();
		table.getColumns().addAll(col1, col2, col3, col4, col5);

		table.setItems(control.getLista());

//		table.getSelectionModel()
//		.selectedItemProperty()
//		.addListener( (prop, antiga, novo) -> {
//			control.setEntity(novo);
//		});
	}

	public void vincular() { 
		Bindings.bindBidirectional(control.nomeProperty(), 
				txtNome.textProperty());
		Bindings.bindBidirectional(control.tecnicoProperty(), 
				txtTecnico.textProperty());
		Bindings.bindBidirectional(control.estadioProperty(), 
				txtEstadio.textProperty());
		StringConverter<? extends Number> converterNumber = 
				new IntegerStringConverter();
		Bindings.bindBidirectional(txtQtdJogadores.textProperty(),
				control.qtdJogadoresProperty(),
				(StringConverter)converterNumber);
	}

	public static void main(String[] args) {
		Application.launch(TimeBoundary.class, args);
	}
}

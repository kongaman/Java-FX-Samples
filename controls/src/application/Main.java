package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.web.HTMLEditor;


public class Main extends Application {
	
	private int grad = 0;
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox(10);
			
			
			//-------------------------------------------------------------------------
			
			//DatePicker dp = new DatePicker();
			//root.getChildren().addAll(dp);
			
			//--------------------------------------------------------------------------
			
			TextArea text = new TextArea();
			Button btn = new Button("Open File");
			Button btn2 = new Button("btn");
			Separator sp = new Separator(Orientation.HORIZONTAL);
			
			btn.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					FileChooser fc = new FileChooser();
					File f = fc.showOpenDialog(null);
					try {
						text.setText(readFirstLineFromFile(f));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				
			});
			
			root.getChildren().addAll(text, btn, sp, btn2);
			
			//------------------------------------------------------------------------
			
			HTMLEditor he = new HTMLEditor();
			String htmlInhalt = he.getHtmlText();
			
			
			//------------------------------------------------------------------------
			
			ColorPicker cp = new ColorPicker();
			Label bla = new Label("Schriftfarbe");
			
			cp.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					bla.setTextFill(cp.getValue());
					
				}
			});
			
			//-------------------------------------------------------------------------
			
			Tooltip tp = new Tooltip("Ich bin ein Tooltip mit anderer Farbe");
			tp.setStyle("-fx-background-color: green;");

			Label label = new Label("Testlabel");
			label.setTooltip(tp);
			
			//--------------------------------------------------------------------------
			
			TreeItem<String> treeRoot = new TreeItem<>("Ordner");
			TreeItem<String> favMovie = new TreeItem<>("Lieblingsfilme");
			TreeItem<String> film1 = new TreeItem<>("Bang boom Bang");
			TreeItem<String> film2 = new TreeItem<>("Matrix");
			TreeItem<String> film3 = new TreeItem<>("Postman");
			
			TreeView<String> tree = new TreeView<>(treeRoot);
			treeRoot.getChildren().add(favMovie);
			favMovie.getChildren().addAll(film1, film2, film3);
			
			//---------------------------------------------------------------------------
			
			TableView<Car> tv = new TableView<>();
			TableColumn<Car, String> colModelName = new TableColumn<>("Modellname");
			TableColumn<Car, String> colBrand = new TableColumn<>("Marke");
			TableColumn<Car, Integer> colHP = new TableColumn<>("PS");
			
			colModelName.setCellValueFactory(new PropertyValueFactory<>("modelName"));
			colBrand.setCellValueFactory(new PropertyValueFactory<>("brand"));
			colHP.setCellValueFactory(new PropertyValueFactory<>("horsePower"));
			
			tv.getColumns().addAll(colModelName, colBrand, colHP);
			tv.setItems(getAllCars());
			
			//****************************************************************************
			
			//root.getChildren().addAll(he, bla, cp, label);
			
			Scene scene = new Scene(root,400,400);
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public ObservableList<Car> getAllCars() {
		ObservableList<Car> carlist = FXCollections.observableArrayList();
		carlist.add(new Car("Ibiza", "Seat", 60,1));
		carlist.add(new Car("Golf", "VW", 120,2));
		carlist.add(new Car("Prius", "Toyota", 160,1));
		return carlist;
	}

	private String readFirstLineFromFile(File f) throws IOException {
		FileReader fr = new FileReader(f.getAbsolutePath());
		BufferedReader br = new BufferedReader(fr);
		String firstLine = br.readLine();
		return firstLine;
		
	}
}

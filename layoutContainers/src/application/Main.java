package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
//---------------------------------------------------------------
//			TabPane			
			
			TabPane root = new TabPane();
			Tab tab1 = new Tab("Editor");
			tab1.setContent(new HTMLEditor());
			Tab tab2 = new Tab("Ausgabe");
			
			VBox box = new VBox(10);
			Button btn= new Button("Bla");
			TextField tf = new TextField();
			
			box.getChildren().addAll(btn, tf);
			tab2.setContent(box);
			
			
			root.getTabs().addAll(tab1, tab2);
			
			
//---------------------------------------------------------------
//			TitledPane			
			
//			VBox root = new VBox(10);
//			VBox box1 = new VBox(10);
//			
//			Button button = new Button("Button 1");
//			Label label = new Label("Test");
//			
//			box1.getChildren().addAll(label, button);
//			root.getChildren().add(new TitledPane("Überschrift", box1));
//			root.getChildren().add(new TitledPane("Überschrift2", new Label("Hallo")));
			
//---------------------------------------------------------------
//			AnchorPane
			
//			AnchorPane root = new AnchorPane();
//			
//			Button button = new Button("Button 1");
//			Label label = new Label("Test");
//			
//			AnchorPane.setRightAnchor(button, 5.0);
//			AnchorPane.setBottomAnchor(button, 5.0);
//			
//			AnchorPane.setRightAnchor(label, 15.0);
//			
//			
//			root.getChildren().addAll(button, label);
			
			
//---------------------------------------------------------------
//			TilePane
	
//			TilePane root = new TilePane();
//			
//			root.setOrientation(Orientation.HORIZONTAL);
//			
//			for (int i = 0; i < 20; i++) {
//				root.getChildren().add(new Button("Button " + i));
//				
//			}
			
			
//---------------------------------------------------------------
//			FlowPane
			
//			FlowPane root = new FlowPane();
//			root.setOrientation(Orientation.VERTICAL);
//			
//			for (int i = 0; i < 20; i++) {
//				root.getChildren().add(new Button("Button " + i));
//				
//			}
			
			
//---------------------------------------------------------------
//			GridPane
			
//			GridPane root = new GridPane();
//			
//			root.setGridLinesVisible(true);
//			
//			root.setPadding(new Insets(10, 10, 10, 10));
//			
//			root.setHgap(10);
//			root.setVgap(10);
//			
//			root.add(new Label("Spalte1"), 0, 5);
//			
//			root.add(new Label("Username: "), 1, 0);
//			root.add(new TextField(), 2, 0);
//			
//			root.add(new Label("Passwort: "), 1, 1);
//			root.add(new PasswordField(), 2, 1);
//			
//			root.add(new Button("Jetzt einloggen"), 2, 3);
						
			
//---------------------------------------------------------------
//			StackPane
			
//			StackPane root = new StackPane();
//			Button btn1 = new Button("Button1");
//			Button btn2 = new Button("Button2");
//			
//			root.getChildren().addAll(btn1, btn2);
//			
//			btn2.toBack();
			
			
//---------------------------------------------------------------
//			BorderPane
						
//			BorderPane root = new BorderPane();
//			
//			root.setTop(new Label("TOP-Bereich"));
//			root.setBottom(new Label("BOTTOM-Bereich"));
//			root.setCenter(new HTMLEditor());
//			root.setLeft(new Label("LEFT-Bereich"));
//			root.setRight(new Label("RIGHT-Bereich"));
			
			
//---------------------------------------------------------------
//			HBox / VBox
			
//			VBox root = new VBox(10);
//			HBox box2 = new HBox(10);
//			
//			TextField text = new TextField();
//			Button btnx = new Button("Klick");
//			Label test = new Label("Testlabel");
//			Button btn1 = new Button("Klick");
//			Button btn2 = new Button("Klick");
//			Slider sl = new Slider();
//			Button btn3 = new Button("Klick");
//			
//			box2.setSpacing(40);
//			box2.setPadding(new Insets(10,10,10,10));
//			
//			box2.getChildren().addAll(text, btnx);
//			root.getChildren().addAll(test, btn1, btn2, box2, sl, btn3);
			
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
}

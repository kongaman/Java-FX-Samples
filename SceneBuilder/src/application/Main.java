package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//FMXL File erstellen
			//Rechtsklick "Open with SceneBuilder"
			// BorderPane... ersetzen durch:
			Parent root = FXMLLoader.load(getClass().getResource("file2.fxml"));
			
			
			Scene scene = new Scene(root); //Gr��e rausmachen bei Arbeiten mit SceneBuilder
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

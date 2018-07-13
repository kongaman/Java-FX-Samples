package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox(10);
			Label heading = new Label("Überschrift");
			Label labelUserName = new Label("Username");
			TextField textField = new TextField();
			Label labelPassword = new Label("Passwort");
			PasswordField passwordField = new PasswordField();
			
			heading.setId("button"); //in ourCSS
			
			labelUserName.getStyleClass().add("button"); //in application.css
			
			//labelPassword.setTextFill(Color.BLUE); lieber in Stylesheet machen
			labelPassword.setStyle("-fx-text-fill: blue"); //inline Styling
			
			Button login = new Button("Login");
			
			Label label = new Label();
			
			
			
			login.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					
				}
			});
			
			Button b1 = new Button("MODENA Stylesheet");
			Button b2 = new Button("CASPIAN Stylescheet");
			
			b1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					setUserAgentStylesheet(STYLESHEET_MODENA);
					
				}
			});
			
			b2.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					setUserAgentStylesheet(STYLESHEET_CASPIAN);
					
				}
			});
			
			root.getChildren().addAll(heading, labelUserName, textField, labelPassword, passwordField, login, label, b1 , b2);
			
			Scene scene = new Scene(root,400,400);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			scene.getStylesheets().add(getClass().getResource("ourCSS.css").toExternalForm());
			
			// CSS-Selektoren
			// Button {} --> TypSelector alles was tatsächlich ein Button ist
			//.button {} --> Klassenselector kann über xyz.getStyleClass().add("button") zugewiesen werden. Bezeichnung ist natürlich beliebig
			//#button {} --> IDSelektor xyz.setID("button") ganz normal wie in HTML auch
	
			
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

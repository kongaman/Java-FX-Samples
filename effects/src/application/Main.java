package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Blend;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.MotionBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

// --- Lighting Effekt
//
		Group root = new Group();

//		Rectangle rec = new Rectangle(10, 20, 200, 100);
//		rec.setFill(Color.AQUA);
	
		Text t = new Text(30, 80, "Toller Effekt!");
		t.setFont(new Font(60));
		t.setFill(Color.AQUAMARINE);
	 
		Light.Point lightsource = new Light.Point(300, 300, 300, Color.YELLOW);
		
		Lighting li = new Lighting(lightsource);
		
		t.setEffect(li);
	
		root.getChildren().add(t);			
			
// --- Reflections
//
//		Group root = new Group();
//
////		Rectangle rec = new Rectangle(10, 20, 200, 100);
////		rec.setFill(Color.AQUA);
////		
//		Text t = new Text(30, 80, "Toller Effekt!");
//		t.setFont(new Font(30));
//		t.setFill(Color.RED);
//		
//		Reflection ref = new Reflection();
//		ref.setTopOffset(5);
//		ref.setFraction(.5);
//		
//		t.setEffect(ref);
//	
//		root.getChildren().add(t);
					
			
// --- Drop Shadow & Inner Shadow
//		
//			Group root = new Group();
////			
//			Rectangle rec = new Rectangle(10, 20, 200, 100);
//			rec.setFill(Color.AQUA);
//			
////			Text t = new Text(30, 80, "Toller Effekt!");
////			t.setFont(new Font(30));
////			t.setFill(Color.RED);
//			
//			DropShadow ds = new DropShadow();
//			
//			InnerShadow is = new InnerShadow();
//			
//			rec.setEffect(is);
//			is.setOffsetX(10);
//			
////			rec.setEffect(ds);
////			ds.setOffsetX(10);
////			ds.setBlurType(BlurType.THREE_PASS_BOX);
//		
//			root.getChildren().add(rec);
			
// --- Blurr Effect
//
//			Group root = new Group();
//			
//			
//			Text t = new Text(30, 80, "Toller Effekt!");
//			t.setFont(new Font(30));
//			t.setFill(Color.RED);
//			
//			GaussianBlur b1 = new GaussianBlur(8); // wie stark
//			MotionBlur b2 = new MotionBlur(45, 10); // Richtung (Winkel), wie stark
//			BoxBlur b3 = new BoxBlur(10, 1, 5); // in Breite, in Höhe, wie stark
//			
//			//t.setEffect(b1);
//			//t.setEffect(b2);
//			t.setEffect(b3);
//						
//						
//						root.getChildren().add(t);

// --- Bloom Effect
//
//			Group root = new Group();
//			
//			Rectangle rec = new Rectangle(10, 20, 200, 100);
//			rec.setFill(Color.AQUA);
//			
//			Text t = new Text(30, 80, "Toller Effekt!");
//			t.setFont(new Font(30));
//			t.setFill(Color.RED);
//			
//			Bloom bloom = new Bloom();
//			bloom.setThreshold(.1);
//			
//			t.setEffect(bloom);
//			
//			root.getChildren().addAll(rec, t);
			
			
// --- Blend Effect
//
//			Group root = new Group();
//			
//			Rectangle rec = new Rectangle(10, 20, 200, 100);
//			rec.setFill(Color.RED);
//			
//			Circle c1 = new Circle(250, 150, 80);
//			c1.setFill(Color.rgb(0, 255, 0, 0.5));
//			
//			Circle c2 = new Circle(250, 250, 80);
//			c2.setFill(Color.BLUE);
//			
//			Blend blend = new Blend(BlendMode.ADD); //BlendMode. sehr sehr viele
//			
//			root.getChildren().addAll(rec, c1, c2);
//			root.setEffect(blend);
			
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

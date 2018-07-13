package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.VLineTo;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			
			Path path1 = new Path();
			path1.getElements().add(new MoveTo(100,100));
			path1.getElements().add(new LineTo(200,200));
			path1.getElements().add(new HLineTo(230));
			path1.getElements().add(new VLineTo(150));
			path1.getElements().add(new QuadCurveTo(200, 50, 300, 150));
			//path1.getElements().add(new CubicCurveTo());
			path1.getElements().add(new ClosePath());
			
			Text text = new Text(20, 70, "Ich bin ein Textshape");
			
			Polyline pl1 = new Polyline(new double[] {
					300.0, 170.0, 400.0, 170.0,
					270.0, 70.0, 120.0, 130.0,
					300, 170
			});
			
			
			double[] pointsForPolygon = { //x,y,x,y,x,y....
					100.0, 40.0, 210.0, 40.0,
					270.0, 70.0, 120.0, 130.0
			};
			Polygon pol1 = new Polygon(pointsForPolygon);
			pol1.setFill(Color.CORAL);
			
			
			Shape.union(pl1,  pol1); 
			
			
			
			double el1CenterX = 250.0;
			double el1CenterY = 250.0;
			double el1RadiusX = 25.0;
			double el1RadiusY = 60.0;
			Ellipse el1 = new Ellipse(el1CenterX, el1CenterY, el1RadiusX, el1RadiusY);
			
			double circleXPosition = 70.0;
			double circleYPosition = 70.0;
			double circleRadius = 40.0;
			Circle circle1 = new Circle(circleXPosition, circleYPosition, circleRadius);
			circle1.setFill(Color.AQUA);
			
			Shape newShape = Shape.subtract(circle1, text);
			newShape.relocate(20, 300);
			
			Rectangle rec1 = new Rectangle(20, 20, 80, 40);
			rec1.setFill(Color.BLUE);
			rec1.setStroke(Color.BLACK);
			rec1.setStrokeWidth(3.0);
			
			Rectangle rec2 = new Rectangle(100, 100, 200, 100);
			rec2.setFill(Color.GREEN);
			rec2.setStroke(Color.YELLOW);
			rec2.setStrokeWidth(3.0);
			rec2.setArcHeight(20.0);
			rec2.setArcWidth(20.0);
			
			Line line1 = new Line(50,50,350,350);
			line1.setStroke(Color.RED);
			line1.setStrokeWidth(5.0);
			
			Line line2 = new Line(350,50,50,350);
			line2.setStroke(Color.GREEN);
			line2.setStrokeWidth(15.0);
			line2.setStrokeLineCap(StrokeLineCap.ROUND);
			line2.getStrokeDashArray().addAll(50.0, 50.0);
			
			root.getChildren().addAll(line1, line2, rec1, rec2, circle1, el1, pol1,pl1,text,newShape,path1);
			
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

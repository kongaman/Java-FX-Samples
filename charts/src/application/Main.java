package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root = new VBox();
			
//------------------------------Bar Chart-------------------------------------------		
//
			CategoryAxis xAxis = new CategoryAxis();
			xAxis.setLabel("Monat");
			NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Betrag in TEuro");
			BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
			
			XYChart.Series<String, Number> seriesProfit = new XYChart.Series<>();
			seriesProfit.setName("Gewinn");
			seriesProfit.getData().add(new XYChart.Data<String, Number>("Januar", 20));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("Februar", 25));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("März", 22));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("April", 19));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("Mai", 40));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("Juni", -5));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("Juli", 2));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("August", 4));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("September", 7));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("Oktober", 3));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("November", -1));
			seriesProfit.getData().add(new XYChart.Data<String, Number>("Dezember", 12));
			
			chart.getData().add(seriesProfit);
			
//------------------------------Bubble Chart-------------------------------------------		
//
			
//			NumberAxis xAxis = new NumberAxis(1, 6, 1);
//			xAxis.setLabel("Nummer des Monats");
//			NumberAxis yAxis = new NumberAxis();
//			yAxis.setLabel("Wert der Aktie in €");
//			
//			BubbleChart<Number, Number> chart = new BubbleChart<>(xAxis, yAxis);
//			
//			//Serie
//			XYChart.Series series1 = new XYChart.Series();
//			series1.setName("Programmieren AG");
//			series1.getData().add(new XYChart.Data(1,23, 3));
//			series1.getData().add(new XYChart.Data(2,27, 2));
//			series1.getData().add(new XYChart.Data(3,22, 4));
//			series1.getData().add(new XYChart.Data(4,34, 5));
//			series1.getData().add(new XYChart.Data(5,38, 2));
//			series1.getData().add(new XYChart.Data(6,47, 1));
//			
//			yAxis.setTickLabelFormatter(new NumberAxis.DefaultFormatter(yAxis, " Euro", " xxx"));
//			yAxis.setTickLabelFill(Color.GREEN);
//			
//			chart.getData().add(series1);
			
//------------------------------Scatter Chart-------------------------------------------		
//
//			NumberAxis xAxis = new NumberAxis(1, 6, 1);
//			xAxis.setLabel("Nummer des Monats");
//			NumberAxis yAxis = new NumberAxis();
//			yAxis.setLabel("Wert der Aktie in €");
//			
//			ScatterChart<Number, Number> chart = new ScatterChart<>(xAxis, yAxis);
//			
//			//Serie
//			XYChart.Series series1 = new XYChart.Series();
//			series1.setName("Programmieren AG");
//			series1.getData().add(new XYChart.Data(1,23));
//			series1.getData().add(new XYChart.Data(2,27));
//			series1.getData().add(new XYChart.Data(3,22));
//			series1.getData().add(new XYChart.Data(4,34));
//			series1.getData().add(new XYChart.Data(5,38));
//			series1.getData().add(new XYChart.Data(6,47));
//			
//			chart.getData().add(series1);		
					
//------------------------------Area Chart-------------------------------------------		
//
//			NumberAxis xAxis = new NumberAxis(1, 6, 1);
//			xAxis.setLabel("Nummer des Monats");
//			NumberAxis yAxis = new NumberAxis();
//			yAxis.setLabel("Wert der Aktie in €");
//			
//			AreaChart<Number, Number> chart = new AreaChart<>(xAxis, yAxis);
//			
//			//Serie
//			XYChart.Series series1 = new XYChart.Series();
//			series1.setName("Programmieren AG");
//			series1.getData().add(new XYChart.Data(1,23));
//			series1.getData().add(new XYChart.Data(2,27));
//			series1.getData().add(new XYChart.Data(3,22));
//			series1.getData().add(new XYChart.Data(4,34));
//			series1.getData().add(new XYChart.Data(5,38));
//			series1.getData().add(new XYChart.Data(6,47));
//			
//			chart.getData().add(series1);	
			
//------------------------------Line Chart-------------------------------------------		
//			
//			NumberAxis xAxis = new NumberAxis();
//			xAxis.setLabel("Nummer des Monats");
//			NumberAxis yAxis = new NumberAxis();
//			yAxis.setLabel("Wert der Aktie in €");
//			
//			LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
//			
//			//Serie
//			XYChart.Series series1 = new XYChart.Series();
//			series1.setName("Programmieren AG");
//			series1.getData().add(new XYChart.Data(1,23));
//			series1.getData().add(new XYChart.Data(2,27));
//			series1.getData().add(new XYChart.Data(3,22));
//			series1.getData().add(new XYChart.Data(4,34));
//			series1.getData().add(new XYChart.Data(5,38));
//			series1.getData().add(new XYChart.Data(6,47));
//			
//			chart.getData().add(series1);
//	
//------------------------------PIE Chart-------------------------------------------		
//
//			PieChart chart = new PieChart();
//			
//			ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
//					new PieChart.Data("Bronze", 20),
//					new PieChart.Data("Silber", 17),
//					new PieChart.Data("Gold", 39));
//			
//			chart.setData(data);
//			
//			chart.setTitle("Münzenverteilung");
//			//chart.setLabelsVisible(false);
//			//chart.setLabelLineLength(100.0);
//			//chart.setLegendVisible(false);
//			chart.setLegendSide(Side.RIGHT);
//			chart.setStartAngle(180);
			
			
			
			root.getChildren().addAll(chart);
			
			
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

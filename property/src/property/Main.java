package property;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class Main {

	public static void main(String[] args) {
		
		StringProperty fileName = new SimpleStringProperty("readme");
		StringProperty fileSuffix = new SimpleStringProperty(".txt");
		StringProperty completeFileName = new SimpleStringProperty();

		completeFileName.bind(Bindings.concat(fileName, fileSuffix));
//		
//		completeFileName.addListener(new ChangeListener<String>() {
//
//			@Override
//			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//				System.out.println("alter Wert: " + oldValue + ", neuer Wert: " + newValue);
//			}
//			
//		});
		
		fileName.addListener(new InvalidationListener() {
			
			@Override
			public void invalidated(Observable observable) {
				System.out.println("Der Wert ist von valide auf invalide gesetzt worden.");
				
			}
		});
		
		
		System.out.println(completeFileName.getValue());
		
		fileName.set("hallo");
		
		//System.out.println(completeFileName.getValue());
		
		fileName.set("hallo2");
		
		System.out.println(completeFileName.getValue());
	}

}

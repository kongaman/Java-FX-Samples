package bindings;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Main {

	public static void main(String[] args) {
		IntegerProperty property1 = new SimpleIntegerProperty();
		IntegerProperty property2 = new SimpleIntegerProperty();
		
		property1.set(45);
		property2.set(60);
		
		//property2.bind(property1);
		NumberBinding nb = property1.add(property2);
		
		System.out.println(property1.get());
		System.out.println(property2.get());
		System.out.println(nb.getValue());
	}

}

package property;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Car {
	
	private IntegerProperty horsePower = new SimpleIntegerProperty();

	
	//Getter und Setter für den WERT der Property
	public final int getHorsePower() {
		return horsePower.get();
	}

	public final void setHorsePower(int value) {
		this.horsePower.set(value);;
	}

	//Getter für die Property an sich
	public IntegerProperty horsePowerProperty() {
		return this.horsePower;
	}
	
	
	
	
}

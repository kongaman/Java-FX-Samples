package application;

public class Car {
	
	private String modelName;
	private String brand;
	private int horsePower;
	private int anzahl;
	
	public Car(String modelName, String brand, int horsePower, int anzahl) {
		super();
		this.modelName = modelName;
		this.brand = brand;
		this.horsePower = horsePower;
		this.anzahl = anzahl;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
	
	

}

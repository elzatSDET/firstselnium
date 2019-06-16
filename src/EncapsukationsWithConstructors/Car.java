package EncapsukationsWithConstructors;

public class Car {

	private String brand;
	private String model;
	private int year;
	private boolean hasAccident;
	private int speed ;
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHasAccident() {
		return hasAccident;
	}

	public void setHasAccident(boolean hasAccident) {
		this.hasAccident = hasAccident;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

	
	public void Start() {
		System.out.println(brand+" is Starting ");
	}
	
	public void Stop() {
		System.out.println(brand+ "is stopping");
	}
	// this is car constructor
	public Car() {
		System.out.println("car constructor");
		brand="hi";
		model= "unknown";
		year= 2019;
		speed= 160;
		hasAccident= false;
		
	}
	
	public  void carInfo() {
		String result = "brand: "+ brand+ "| Model: " +model+ 
				"| Year: "+year+"| Accident Report: " +hasAccident+"| Horse Power: "+
				speed;
		
				System.out.println(result);
	
	}
	
	public Car(String brand, String model, int year, int speed) {
		System.out.println("hihihihi");
		this.brand= brand;
		this.model= model;
		this.year= year;
		this.speed=speed;
	
}
	
	
}

package EncapsukationsWithConstructors;

public class carRunner {

	public static void main(String[] args) {
		
		
		Car car1 = new Car();
		
//		car1.setBrand("Honda");
		System.out.println(car1.getBrand());
		
//		car1.setHasAccident(false);
		
//		car1.setSpeed(340);
		System.out.println(car1.getSpeed());
		
		
		System.out.println(car1.getYear());
		
		
		car1.carInfo();
		
		
		System.out.println(car1.getBrand());
		
		Car car3 = new Car("bmw", "suv", 2015, 370);
		car3.carInfo();
		
	}

}

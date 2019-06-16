package may5_10;

public class RunAnimal {

	public static void main(String[] args) {
		Animal n1 = new Animal();
		System.out.println(n1.age);
		System.out.println(n1.color);
//		n1.gender = "M";
//		n1.color = "black";
		System.out.println("gender "+n1.gender);
		System.out.println("color "+n1.color);
		
		
		n1.setName("Curry");
		System.out.println(n1.getName());
		
		System.out.println("*******");
		Animal a1 = new Animal();
		
		System.out.println(a1.color);
//		Animal a2 = new Animal();
//		a2.color = "brown";

		Animal a3 = new Animal();
		
		System.out.println(a3.color);
//		Animal a4= new Animal();
		//Animal a5= new Animal("brown",4,"bodak");
//		System.out.println(a4.color);
		
		
	}

}

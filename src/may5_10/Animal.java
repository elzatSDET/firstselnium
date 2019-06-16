package may5_10;

public class Animal {
	//return type
	//void
	//constroctor--> special method
	private     String name;
	public	    int age;
	protected	String color;
				String gender;
				
		//default constroctor
		public Animal() {
			//color ="black";
//			age = 0;
//			gender = "";
		System.out.println("empity constructor");
		}
		
		//overloading
		public Animal(String color, int age, String name) {
			
			this.color=color;
			this.age=age;
			this.name=name;
			System.out.println("overloaded cons..");
		}
		
		
		
	public void setName(String name) {
		this.name = name;
	
	}
	
	public String getName() {
		return name;
	}
	
	
	public void run() {
		System.out.println("running");
	}
	
	public void run(int mile) {
		System.out.println("running "+mile+" mile");
	}
	
}

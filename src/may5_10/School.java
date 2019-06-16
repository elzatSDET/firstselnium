package may5_10;

import java.util.Scanner;



public class School {

	public String name;
	String address;
	int classNumber;
	int studentPopulation;
	private int age;
	//Encapsulation--> OOP one princip
	
	// set method --> assign the value to instance variable
	public void setAge(int age) {
		this.age = age;
	}
	//get method--> return 
	public int getAge() {
		return age;
	}
	public void arrangeSchedule() {
		System.out.println("schedule is arranged");
	}

	public void teach() {
		System.out.println("teaching");
	}

	public String doHomework() {
		return "doing homework";
	}

}

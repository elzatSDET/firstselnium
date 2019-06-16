package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReview {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "Cybertek";
		String StudentName = "Elzat, dilnur, Aynigar, Meryem";
		// array--> is immutable
		
		//1st way
		String[] s= {"ab", "cd", "ef"};
		
		//2nd way
		String [] s1 = new String[] {"we", "rt"};
	
		//3rd way
		String[] StudentNames = new String[3];
		StudentNames[0] = "Elzat";
		StudentNames[1] = "Dilnur";
		StudentNames[2] = "Aynigar";
		
		for (int i = 0; i < StudentNames.length; i++) {
			System.out.println(StudentNames[i]);
		}
		System.out.println(StudentNames[1]);
		System.out.println(Arrays.toString(StudentNames));
		// FOR EACH LOOP
		for (String names : StudentNames) {
		
			System.out.print(names + " ");
		}
		System.out.println(StudentNames.length);
		//sort in memory
		Arrays.sort(StudentNames);
			System.out.println(Arrays.toString(StudentNames));
			
			System.out.println("=========ArrayList========");
			//arrayList ---
	
			//1st way--> did not mentioned specific data type
				// we can add any type
			ArrayList words = new ArrayList<>();
			words.add("abc");
			words.add(123); // primitive int
			words.add(false);
			words.add(234.23);
			words.add('@');
			words.add(new Integer(12)); // wrappper class Integer object
			words.add(new Character('~'));
			words.add(new Boolean(true));
			
			System.out.println(words.get(2));
			//for each
			
			ArrayList<String> cars = new ArrayList<>();
			cars.add("Nissan");
			cars.add("Toyota");
			cars.add("Honda");
			
			System.out.println(cars.get(1));
			
			System.out.println(cars);//print all element
			for(String car: cars) {
				System.out.println(car);
			}
			for(int i=0; i<cars.size(); i++ ) {
				System.out.println(cars.get(i));
			}
			
			ArrayList<String> cars2 = new ArrayList<>() ;
			cars2.addAll(cars);
				System.out.println(cars2);
			
	}

}

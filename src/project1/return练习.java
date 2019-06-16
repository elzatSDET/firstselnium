package project1;

import java.util.Scanner;

public class return练习 {

    public static void main(String[] args) {
		System.out.println( "java".length() );
		int i = "java".length();
		
		char ch = "java".charAt(0);
		
		//toCarArray -->'j'  'a'  'v'  'a' 
		char[]  c = "java".toCharArray();
		
		//split("@")--> java@hi@hello  --> "java"   "hi"  "hello"
		String[] w = "java@hi@hello".split("");
		
		System.out.println("Hi" + 3);//hi3
		System.out.println("Hi" + 3 + 3);//"hi3"+ 3
		System.out.println(4+4+"hi");//8Hi
		
		
		System.out.println("java".toUpperCase());
		
		String s = "java".toUpperCase();
		
		
		//method types --> 1.void , 2.return 
		
		//call our return method
		System.out.println( Hi() );
		
		String str = Hi();
		System.out.println(str);
		
		//cal void method 
		Hi2();
		System.out.println(Hi1());
		System.out.println(Hello("subana"));
		hello2("elzat");
    System.out.println(play(8));
    
  System.out.println(getFood(2, "polo" ));
  
  	Hello("elzat");
  System.out.println(getSum(10, 12));
    
	}
    //Hi() --> String
    public static String Hi() {
    	return "Hi ...";
    }
    
    //void --> return nothing
    public static void Hi2() {
    	System.out.println(23445);
    	System.out.println("hi from void method");
    	System.out.println(true);
    }
    
    
    
    
    public static boolean Hi1() {
    	return false;
    }
    
    //parameter , argument
    public static String Hello(String name) {
    	return  "Hei " + name;
    }
    
    public static void hello2(String name) {
    	System.out.println("12345"+ name);
    }
    
   //return String, takes an int , Play() 
    
    public static String play( int num) {
    	return "I am playing "+num +" hours a day!";
    }
    
    //food , param: int String 
    //To cook xx takes xx minutes
    
    public static String getFood(int minute, String foodName) { 
    	return "To cook "+foodName+" takes "+minute+" minutes";
    }
    
    public static int getSum(int num1, int num2) {
    	return num1+num2;
    }
    
    
    

}



package may5_10;

public class RunSchool {

	public static void main(String[] args) {
		// variable type: local / instance / static
		
		//local : create inside method/ paramether
		//instamce : class level
		//static : static keyword
		

		School school1= new School();
		
		school1.name= "Cybertek";
		school1.address = "11200 DR";
		//school1.studentPopulation= 500;
		school1.classNumber= 6;
		
		school1.arrangeSchedule();
		school1.teach();
		System.out.println(school1.doHomework());
		System.out.println(school1.name);
		System.out.println(school1.classNumber);
		
		school1.setAge(3);
		System.out.println(school1.getAge());
		
		
		
		
		
		
	}

}

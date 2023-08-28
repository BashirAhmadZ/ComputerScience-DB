package mywork;

public class Sample {
	
	private String id;
	private String name;
	private String lastName;
	private int age;
	private double salary;
	private boolean isWorking;
	
	Sample(){
		System.out.println("Sample() Constructor is called!\n");
	}
	
	Sample(String id){
		this.id = id;
		System.out.println("Sample(String id) Constructor is called!\n");
	}
	
	Sample(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
		System.out.println("Sample(String name, String lastName) Constructor is called!\n");
	}
	
	Sample(int age){
		this.age = age;
		System.out.println("Sample(int age) Constructor is called!\n");
	}
	
	Sample(double salary){
		this.salary = salary;
		System.out.println("Sample(double salary) Constructor is called!\n");
	}
	
	Sample(boolean isWorking){
		this.isWorking = isWorking;
		System.out.println("Sample(boolean isWorking) Constructor is called!\n");
	}

	Sample(String id, String name, String lastName, int age, double salary, boolean isWorking) {
		System.out.println("Sample(String id, String name, String lastName, int age, double salary, boolean isWorking)\n");
	}
	
	Sample(String id, String name, String lastName, int age, boolean isWorking, double salary){
		System.out.println("Sample(String id, String name, String lastName, int age, boolean isWorking, double salary)\n");	
	}
	
	Sample(String id, String name, String lastName){
		System.out.println("Sample(String id, String name, String lastName)");
	}
	
	Sample(String id, String name, String lastName, int age){
		System.out.println("Sample(String id, String name, String lastName, int age)");
	}
	
	@Override
	public String toString() {
		
		return "My Object created!";
	}
	
	
}

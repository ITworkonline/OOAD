package hw1;

public class Animal {
	
	//Encapsulation: protected type makes it only visible to this class and it subclasses. 
	//So following varibles are only visible to Animal and it's subclasses, not visible to non-related class, like ZooEmployee.
	protected String type;
	protected String name;
	
	protected Animal( ) {
		
	}
	
	protected Animal(String type,String name ) {
		this.type = type;	
		this.name = name;
	}
	
	
	protected void dig() {

		System.out.println(("Animal digs"));
	}
	
	protected void roam() {

		System.out.println(("Animal roams"));
	}
	
	protected void makeNoise() {

		System.out.println(("Animal makes noise"));
	}
	
	protected void charge() {

		System.out.println(("Animal charges"));
	}
	
	
	
	protected void wakeUp() {

		System.out.println((name+" the "+type+" wakes up"));
	}
	
	
	
	protected void eat() {

		System.out.println((name+" the "+type+" eats"));
	}
	

	protected void sleep() {

		System.out.println((name+" the "+type+" sleeps"));
	}
	
}

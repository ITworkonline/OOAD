package hw2;
//package hw2;

public class Animal {
	
	
	protected String type;
	protected String name;
	
	
	
	protected Animal( ) {
		
	}
	

	
	protected Animal(String type,String name ) {
		this.type = type;	
		this.name = name;
	}
	
	//strategy pattern;
	RoamBehavior roamBehavior;
		
	public void setRoamBehavior(RoamBehavior fb) {
		roamBehavior = fb;
	}
	
	public void performRoam() {
		roamBehavior.roam();
	}
	
	protected void dig() {

		System.out.println(("Animal digs"));
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

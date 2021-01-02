package hw1;

// Abstract class ZooEmployee contains abstract methods wakeUp(), rollCall() and so on. 
abstract class ZooEmployee {
	
	public Animal a;
	
	public ZooEmployee(Animal a){
		this.a = a;
		
	}
	
	public abstract void wakeUp();
	
	public abstract void rollCall();
	
	public abstract void feed();
	
	public abstract void exercise();
	
	public abstract void toSleep();
		

}

//Abstract Class: Class Zookeeper inherits from abstract class ZooEmployee, and overrides following methods.
class ZooKeeper extends ZooEmployee{
	public ZooKeeper(Animal a) {
		super(a);
	} 
	
//To respond to the Zookeeper object methods, each Animal instance in the Zoo must have a method that corresponds to the Zookeeper’s tasks:
//	wake up, make noise, eat, roam, and sleep.
	
	
// Polymorphism: a is a Animal type object, for example: Animal a = new Dog()
//				 a.sleep() invokes Animal.sleep(), a.roam() invokes Canine.roam()
//               and a.eat() invokes Dog.eat()
	public void wakeUp() {
		System.out.println("Zookeeper wakes "+a.name+ " the "+ a.type + " up"  );
		a.wakeUp();
	}
	
	public void rollCall() {
		System.out.println("Zookeeper calls "+a.name+ " the "+ a.type);
		a.makeNoise();
	}
	
	public void feed() {
		System.out.println("Zookeeper feeds "+a.name+ " the "+ a.type);
		a.eat();
	}
	
	public void exercise() {
		System.out.println("Zookeeper exercises "+a.name+ " the "+ a.type);
		a.roam();
	}
	
	public void toSleep() {
		System.out.println("Zookeeper tells "+a.name+ " the "+ a.type +" to sleep");
		a.sleep();
	}
}

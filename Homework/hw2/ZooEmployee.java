package hw2;

//package hw1;

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



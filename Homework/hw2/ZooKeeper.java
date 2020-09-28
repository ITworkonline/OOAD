package hw2;
import java.util.*;


class ZooKeeper extends ZooEmployee implements Subject {
	public List<Observer> observers;
	public String action;
	
	public ZooKeeper(Animal a) {
		super(a);
		observers = new ArrayList<Observer>();
	} 
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
		System.out.println("Zoo Announcer stops observing");
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(action);
		}
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public void wakeUp() {
		
		setAction("wake up");
		notifyObservers();
		System.out.println("Zookeeper wakes "+a.name+ " the "+ a.type + " up"  );
		a.wakeUp();
	}
	
	public void rollCall() {
		setAction("roll call");
		notifyObservers();
		System.out.println("Zookeeper calls "+a.name+ " the "+ a.type);
		a.makeNoise();
	}
	
	public void feed() {
		setAction("feed");
		notifyObservers();
		System.out.println("Zookeeper feeds "+a.name+ " the "+ a.type);
		a.eat();
	}
	
	public void exercise() {
		setAction("exercise");
		notifyObservers();
		System.out.println("Zookeeper exercises "+a.name+ " the "+ a.type);
		//Use strategy pattern to call roamBehavior
		a.performRoam();
	}
	
	public void toSleep() {
		setAction("sleep");
		notifyObservers();
		System.out.println("Zookeeper tells "+a.name+ " the "+ a.type +" to sleep");
		a.sleep();
		
	}
}
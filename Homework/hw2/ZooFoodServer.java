package hw2;
import java.util.*;

import hw2.Observer;

public class ZooFoodServer extends ZooEmployee implements Subject {
	public List<Observer> observers;
	public String action;
	
	public ZooFoodServer(Animal a) {
		super(a);
		observers = new ArrayList<Observer>();
	} 
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(action);
		}
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public void makeFood() {
		setAction("make food");
		notifyObservers();
		System.out.println("ZooFoodServer is making food");
	}
	
	public void serveFood() {
		setAction("serve");
		notifyObservers();
		System.out.println("ZooFoodServer is serving food");
	}
	
	public void cleanFood() {
		setAction("clean food");
		notifyObservers();
		System.out.println("ZooFoodServer is cleaning food");
	}
	
	
	public void  wakeUp() {
		System.out.println("Hi, this is the Zoo Food Server");
	}
	
	public void rollCall() {
		System.out.println("Hi, this is the Zoo Food Server");
	}
	
	public void feed() {
		System.out.println("Hi, this is the Zoo Food Server");
	}
	
	public void exercise() {
		System.out.println("Hi, this is the Zoo Food Server");
	}
	
	public void toSleep() {
		System.out.println("Hi, this is the Zoo Food Server");
	}

}

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
	
	//Observer Pattern
	//implement Subject registerObserver() , removeObserver,  notifyObservers
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
		System.out.println("ZooAnnouncer stops observing and leaves the zoo");
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(action);
		}
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	//Observer Pattern
	//ZooKeeper(Subject) notifies ZooAnnouncer(Observer) for every task
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

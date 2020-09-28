package hw2;

public class ZooAnnouncer extends ZooEmployee implements Observer{
	

	private ZooKeeper zooKeeper;
	private ZooFoodServer zooFoodServer;
	String action;
	
	
	public ZooAnnouncer(Animal a, ZooKeeper zooKeeper, ZooFoodServer zooFoodServer) {
		
		super(a);
		this.zooKeeper = zooKeeper;
		this.zooFoodServer = zooFoodServer;
		zooKeeper.registerObserver(this);
		zooFoodServer.registerObserver(this);
	} 
	
	public void update(String action) {
		
		this.action = action;
		display();
		
	}
	
	public void display() {
		if(action == "sleep") {
			System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to make the animals " + action);
		}else if(action == "serve") {
			System.out.println("Hi, this is the Zoo Announcer. The ZooFoodServer is about to "+action+" the animals food");
		}else if(action == "make food" || action == "clean food" ){
			System.out.println();
		}else{
			System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to "+action+" the animals");
		}
	}
	
	//实现ZooEmployee Abstract Class, 好像不需要具体的实现；
	public void  wakeUp() {
		System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to wake the animals");
	}
	
	public void rollCall() {
		System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to roll call the animals");
	}
	
	public void feed() {
		System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to feed the animals");
	}
	
	public void exercise() {
		System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to exercise the animals");
	}
	
	public void toSleep() {
		System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to make the animals sleep");
	}
	
	
	

}



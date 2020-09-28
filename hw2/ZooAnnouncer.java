package hw2;

public class ZooAnnouncer extends ZooEmployee implements Observer{
	

	private ZooKeeper zooKeeper;
	private ZooFoodServer zooFoodServer;
	String action;
	
	
	public ZooAnnouncer(Animal a, ZooKeeper zooKeeper, ZooFoodServer zooFoodServer) {
		//Observer Pattern
		//Register zooAnnouncer as observer of both zooKeepr and zooFoodServer
		super(a);
		this.zooKeeper = zooKeeper;
		this.zooFoodServer = zooFoodServer;
		zooKeeper.registerObserver(this);
		zooFoodServer.registerObserver(this);
	} 
	
	public void update(String action) {
		//Observer Pattern
		//update messages from Subject and display
		this.action = action;
		display();
		
	}
	
	//announce actions according to requests.
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
	
	public void  wakeUp() {
		System.out.println("Hi, this is the Zoo Announcer");
	}
	
	public void rollCall() {
		System.out.println("Hi, this is the Zoo Announcer");
	}
	
	public void feed() {
		System.out.println("Hi, this is the Zoo Announcer");
	}
	
	public void exercise() {
		System.out.println("Hi, this is the Zoo Announcer");
	}
	
	public void toSleep() {
		System.out.println("Hi, this is the Zoo Announcer");
	}
	
	
	

}



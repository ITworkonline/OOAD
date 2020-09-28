package hw2;
import java.util.*;

public class ZooClock {
	
	public String time;
	public Animal[] arrs;
	
	public ZooClock(Animal[] animal) {
		this.arrs = animal;
	}
	
	public void clock(Animal[] arrs) {
		
		for(int i=8;i<=20;i++) {
			if(i<=11) {
				System.out.println();
				System.out.println("It's " + i + " AM Clock");
				if(i==8) {
					System.out.println(" Wake animals up");
					wakeUp_all(arrs);
				}
				if(i==9) {
					System.out.println(" Roll call animals");
					rollCall_all(arrs);
				}
				if(i==10) {
					makeFood_all(arrs);
				}
				
			}else if(i==12) {
				System.out.println();
				System.out.println("It's " + i + " PM Clock");
				serveFood_all(arrs);
				System.out.println(" Feed animals");
				feed_all(arrs);
			}else if(i>12) {
				System.out.println();
				System.out.println("It's " + (i-12) + " PM Clock");
				
				if(i==13) {
					cleanFood_all(arrs);
				}
				
				if(i==14) {
					System.out.println(" Exercise animals");
					exercise_all(arrs);
				}
				
				if(i==17) {
					serveFood_all(arrs);
					System.out.println("ZooFoodServer leaves the zoo");
					System.out.println(" Feed animals");
					feed_all(arrs);
				}
				
				if(i==19) {
					System.out.println(" Let animals sleep");
					makeSleep_all(arrs);
				}
				
				if(i==20) {
					System.out.println("Close the zoo");
				}
				
			}
		}
		
		
		
	}
	
	public static void makeFood_all(Animal[] arr) {
		ZooKeeper worker = new ZooKeeper(arr[0]);
		ZooFoodServer zooFoodServer = new ZooFoodServer(arr[0]);
		ZooAnnouncer zooAnnouncer = new ZooAnnouncer(arr[0], worker, zooFoodServer);
		zooFoodServer.makeFood();
	}
	
	public static void serveFood_all(Animal[] arr) {
		ZooKeeper worker = new ZooKeeper(arr[0]);
		ZooFoodServer zooFoodServer = new ZooFoodServer(arr[0]);
		ZooAnnouncer zooAnnouncer = new ZooAnnouncer(arr[0], worker, zooFoodServer);
		zooFoodServer.serveFood();
	}
	
	public static void cleanFood_all(Animal[] arr) {
		ZooKeeper worker = new ZooKeeper(arr[0]);
		ZooFoodServer zooFoodServer = new ZooFoodServer(arr[0]);
		ZooAnnouncer zooAnnouncer = new ZooAnnouncer(arr[0], worker, zooFoodServer);
		zooFoodServer.cleanFood();
	}
	
	public static void  wakeUp_all(Animal[] arr) {
		
		for(Animal instance: arr) {
			
			ZooKeeper worker = new ZooKeeper(instance);
			if(instance == arr[0]) {
				ZooFoodServer zooFoodServer = new ZooFoodServer(instance);
				ZooAnnouncer zooAnnouncer = new ZooAnnouncer(instance, worker, zooFoodServer);
			}
			worker.wakeUp();
		}
	}
	
	public static void rollCall_all(Animal[] arr) {
		for(Animal instance: arr) {
			ZooKeeper worker = new ZooKeeper(instance);
			if(instance == arr[0]) {
				ZooFoodServer zooFoodServer = new ZooFoodServer(instance);
				ZooAnnouncer zooAnnouncer = new ZooAnnouncer(instance, worker, zooFoodServer);
			}
			worker.rollCall();
		}
	}
	
	public static void feed_all(Animal[] arr) {
		for(Animal instance: arr) {
			ZooKeeper worker = new ZooKeeper(instance);
			if(instance == arr[0]) {
				ZooFoodServer zooFoodServer = new ZooFoodServer(instance);
				ZooAnnouncer zooAnnouncer = new ZooAnnouncer(instance, worker, zooFoodServer);
			}
			worker.feed();
		}
	}
	
	
	public static void exercise_all(Animal[] arr) {
		
		for(Animal instance: arr) {
			ZooKeeper worker = new ZooKeeper(instance);
			if(instance == arr[0]) {
				ZooFoodServer zooFoodServer = new ZooFoodServer(instance);
				ZooAnnouncer zooAnnouncer = new ZooAnnouncer(instance, worker, zooFoodServer);
			}
			Random rand = new Random();
			double c = rand.nextDouble();
			//When a Dog is given the exercise command by the Zookeeper, there is a 25% chance the dog will dig instead of roaming.
			if(instance.getClass().getName() == "hw2.Dog" ) {
				if(c>0.25) {
				worker.exercise();
				}else {
					instance.dig();
				}
				
			//When a Pachyderm is given an exercise command, there is a 25% chance it will charge instead of roam.	
			}else if(instance.getClass().getSuperclass().getName() == "hw2.Pachyderm"){
				if(c>0.25) {
					worker.exercise();
				}else {
					instance.charge();
				}
			
			}else {
				worker.exercise();
			}
		}
	}
	
	public static void makeSleep_all(Animal[] arr) {
		
		ZooKeeper worker0 = new ZooKeeper(arr[0]);
		ZooFoodServer zooFoodServer = new ZooFoodServer(arr[0]);
		ZooAnnouncer zooAnnouncer = new ZooAnnouncer(arr[0], worker0, zooFoodServer);
		
		for(Animal instance: arr) {
			if(instance == arr[0]) {
				Random rand = new Random();
				double c = rand.nextDouble();
				//When a Feline is given a sleep command, there is a 30% chance it will roam instead, a 30% chance it will make noise, and a 40% chance it will sleep.
				if(instance.getClass().getSuperclass().getName() == "hw2.Feline") {
					if(c<0.4) {
						worker0.toSleep();
						
					}else if(0.3<c && c<0.7) {
						instance.makeNoise();
					}else {
						instance.performRoam();
					}
				}else {
					worker0.toSleep();
				}
				//Remove from the observers.
				
			}else {
				
				ZooKeeper worker = new ZooKeeper(instance);
				//ZooAnnouncer zooAnnouncer = new ZooAnnouncer(instance, worker);
			
				Random rand = new Random();
				double c = rand.nextDouble();
				//When a Feline is given a sleep command, there is a 30% chance it will roam instead, a 30% chance it will make noise, and a 40% chance it will sleep.
				if(instance.getClass().getSuperclass().getName() == "hw2.Feline") {
					if(c<0.4) {
						worker.toSleep();
						
					}else if(0.3<c && c<0.7) {
						instance.makeNoise();
					}else {
						instance.performRoam();
					}
				}else {
					worker.toSleep();
				}
				
			}
				
		}
		worker0.removeObserver(zooAnnouncer);
				
	}

}

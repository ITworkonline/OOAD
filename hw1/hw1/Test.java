
package hw1;

import java.util.Random;

public class Test {
	
	public static void main (String args[]){
		//Indentity: Each object here has a unique id.
		Cat charlie = new Cat("Cat","Charlie");
		Cat chloe = new Cat("Cat","Chloe");
		
		Lion lucan = new Lion("Lion","Lucan");
		Lion lescar = new Lion("Lion","Lescar");
		
		Tiger ted = new Tiger("Tiger","Ted");
		Tiger tammie = new Tiger("Tiger","Tammie");
		
		Hippo helam = new Hippo("Hippo","Helam");
		Hippo hene = new Hippo("Hippo","Hene");
		
		Elephant elizabet = new Elephant("Elephant","Elizabet");
		Elephant eddey = new Elephant("Elephant","Eddey");
		
		Rhino roly = new Rhino("Rhino","Roly");
		Rhino ruru = new Rhino("Rhino","Ruru");
		
		Dog doli = new Dog("Dog","Doly");
		Dog deepa = new Dog("Dog","Deepa");
		
		Wolf winfried = new Wolf("Wolf","Winfried");
		Wolf wylye = new Wolf("Wolf","Wylye");
		
		PolarBear posy = new PolarBear("PolarBear","Posy");
		PolarBear pep = new PolarBear("PolarBear","Pep");
		
		Panda poya = new Panda("Panda","Poya");
		Panda perth = new Panda("Panda","Perth");

		
		Animal[] arrs = {charlie, chloe,lucan, lescar, ted, tammie, helam, hene, elizabet, eddey, roly, 
						ruru, doli, deepa, winfried, wylye, posy, pep, poya, perth};
		
		// From day 1 to day 8, ZooKeeper comes and wakes up animals, roll call the animals, feed the animals, exercise the animals, and tell the animals to sleep
		for(int i=1; i<8; i++) {
			System.out.println("Zookeeper arrives at Zoo on Day "+ i);
			
			System.out.println("Day "+ i+ " Wake animals up");
			wakeUp_all(arrs);
			System.out.println();
			System.out.println("Day "+ i+ " Roll call animals");
			rollCall_all(arrs);
			System.out.println();
			System.out.println("Day "+ i+ " Feed animals");
			feed_all(arrs);
			System.out.println();
			System.out.println("Day "+ i+ " Exercise animals");
			exercise_all(arrs);
			System.out.println();
			System.out.println("Day "+ i+ " Let animals sleep");
			makeSleep_all(arrs);
			System.out.println();
		}	
	  }

// Abstraction: it indicates that a function is provided without the users being aware of the inside implementation details.
//              Here Zookeeper could just issue commands like wakeup, rollcall without knowing how do those functions implemented.
	public static void  wakeUp_all(Animal[] arr) {
		
		for(Animal instance: arr) {
			
			ZooEmployee worker = new ZooKeeper(instance);
			worker.wakeUp();
		}
	}
	
	public static void rollCall_all(Animal[] arr) {
		for(Animal instance: arr) {
			ZooEmployee worker = new ZooKeeper(instance);
			worker.rollCall();
		}
	}
	
	public static void feed_all(Animal[] arr) {
		for(Animal instance: arr) {
			ZooEmployee worker = new ZooKeeper(instance);
			worker.feed();
		}
	}
	
	
	public static void exercise_all(Animal[] arr) {
		
		for(Animal instance: arr) {
			ZooEmployee worker = new ZooKeeper(instance);
			Random rand = new Random();
			double c = rand.nextDouble();
			//When a Dog is given the exercise command by the Zookeeper, there is a 25% chance the dog will dig instead of roaming.
			if(instance.getClass().getName() == "hw1.Dog" ) {
				if(c>0.25) {
				worker.exercise();
				}else {
					instance.dig();
				}
				
			//When a Pachyderm is given an exercise command, there is a 25% chance it will charge instead of roam.	
			}else if(instance.getClass().getSuperclass().getName() == "hw1.Pachyderm"){
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
		for(Animal instance: arr) {
			ZooEmployee worker = new ZooKeeper(instance);
			Random rand = new Random();
			double c = rand.nextDouble();
			//When a Feline is given a sleep command, there is a 30% chance it will roam instead, a 30% chance it will make noise, and a 40% chance it will sleep.
			if(instance.getClass().getSuperclass().getName() == "hw1.Feline") {
				if(c<0.4) {
					worker.toSleep();
					
				}else if(0.3<c && c<0.7) {
					instance.makeNoise();
				}else {
					instance.roam();
				}
			}else {
				worker.toSleep();
			}

		}
	}
	
	
}


//Animal name:
//Feline: Cat: Charlie, Chloe
//		  Lion: Lucan, Lescar
//        Tiger: Ted, Tammie
//Pachyderm: Hippo: Helam, Hene
//           Elephant: Elizabet, Eddey
//           Rhino: Roly, Ruru
//Canine: Dog: Doli, Deepa
//        Wolf: Winfried, Wylye
//Ursidae: Polar bear: Posy, Pep
//         Panda: Poya, Perth
package hw2;

//package hw1;

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
			System.out.println();
			System.out.println();
			System.out.println("Zookeeper arrives at Zoo on Day "+ i);
			ZooClock zooclock = new ZooClock(arrs);
			zooclock.clock(arrs);
					
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
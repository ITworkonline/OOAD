package hw2;

//package hw1;


 
class Canine extends Animal {
		
	public Canine( String type, String name) {
		
		super(type, name);
		roamBehavior = new CanineRoam();
	
	}

		
}


class Wolf extends Canine {
		
	public Wolf( String type, String name) {
		
		super(type, name);
	
	}
	
	public void makeNoise() {
		
		System.out.println((name+" the "+type+" makes noise WOLF"));
		
	}
	
//Override: Override Animal methods
	public void eat() {
		
		System.out.println((name+" the "+type+" eats meat"));
			
	}
}


	
class Dog extends Canine {
			
	public Dog( String type, String name) {
			 
			super(type, name);
		
		}
	
// Class Dog inherits from Canine Class and overrides eat() method.
	public void eat() {
		
		System.out.println((name+" the "+type+" eats bone"));
			
	}
		
	public void makeNoise() {
			
		System.out.println((name+" the "+type+" makes noise barking"));
			
	}
	
	public void dig() {
		
		System.out.println((name+" the "+type+" 25% digs instead of roaming"));
			
	}
}







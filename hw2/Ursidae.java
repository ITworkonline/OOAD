package hw2;

class Ursidae extends Animal {
	
	public Ursidae( String type, String name) {
		//strategy pattern
		//set roamBehavior in constructing function
		super(type, name);
		roamBehavior = new UrsidaeRoam();
	
	}
		
		
}

class PolarBear extends Ursidae {
	
	public PolarBear( String type, String name) {
		
		super(type, name);
	
	}
	
	public void makeNoise() {
		
		System.out.println((name+" the "+type+" makes noise POLAR BEAR "));
		
	}
}

class Panda extends Ursidae {
	
	public Panda( String type, String name) {
		
		super(type, name);
	
	}
	
	public void makeNoise() {
		
		System.out.println((name+" the "+type+" makes noise PANDA "));
		
	}
}


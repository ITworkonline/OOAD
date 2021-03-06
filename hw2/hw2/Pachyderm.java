package hw2;


class Pachyderm extends Animal{
	public Pachyderm(String type, String name) {
		//strategy pattern
		//set roamBehavior in constructing function
		super(type, name);
		roamBehavior = new PachydermRoam();
	}
	
	public void charge() {
		System.out.println((this.name+" the "+this.type+" 25% charges instead of roaming"));
	}
}

class Hippo extends Pachyderm {

	public Hippo(String type, String name) {
		super(type, name);
	}

	public void makeNoise() {
		System.out.println(this.name+" the "+this.type+" makes noise HIPPO!");
	}
}


class Elephant extends Pachyderm {

	public Elephant(String type, String name) {
		super(type, name);
	}

	public void makeNoise() {
		System.out.println(this.name+" the "+this.type+" makes noise ELE!");
	}
}


class Rhino extends Pachyderm {

	public Rhino(String type, String name) {
		super(type, name);
	}

	public void makeNoise() {
		System.out.println(this.name+" the "+this.type+" makes noise Rhino!");
	}
}
package hw1;

class Feline extends Animal{
	public Feline(String type, String name) {
		super(type, name);
	}

	public void roam() {
		System.out.println((this.name+" the "+this.type+" roams lazily"));
	}
}

class Tiger extends Feline {

	public Tiger(String type, String name) {
		super(type, name);
	}

	public void makeNoise() {
		System.out.println(this.name+" the "+this.type+" makes noise TIGER!");
	}
}


class Lion extends Feline {

	public Lion(String type, String name) {
		super(type, name);
	}

	public void makeNoise() {
		System.out.println(this.name+" the "+this.type+" makes noise LION!");
	}
}


class Cat extends Feline {

	public Cat(String type, String name) {
		super(type, name);
	}

	public void makeNoise() {
		System.out.println(this.name+" the "+this.type+" makes noise Miao!");
	}
}
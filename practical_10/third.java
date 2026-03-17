//super keyword

class Device { 					// parent class
	int id;
	String category;
	Device(int id, String category) {
		this.id=id;
		this.category=category;
	}
	void display() { //parent class method
		System.out.println("id:" + id +"category:" + category);
	}
}

class Laptop extends Device {			 //child class
		
	String laptopName;
	Laptop() {
		super(001,"electronic"); 	// super keyword
		laptopName="lenovo";
	}
	void display() { // child class method 
		System.out.println("id:" + id  +",category:" + category +",laptopName:" + laptopName);
	}
	public static void main(String[] args) { // main method
		Device one= new Laptop();
		one.display();

		
	}
}
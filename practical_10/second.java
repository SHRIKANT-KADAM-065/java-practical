//multilevel inheritance

class Device { //parent class
	static int id;
	String category;
	Device() {
		id+=1;
		
		category="electronic";
	}
	void display() {
		System.out.println("id:" + id +"category:" + category);
	}
}
class Electronics extends Device{ //child class 1 //parent class 2
	String brandName;
	Electronics() {
		brandName="lenovo";	
	}
	void display() {
		System.out.println("id:" + id  +",category:" + category +",brandName:" + brandName);
	}
}
class Laptop extends Electronics { //child class 2
	String laptopName;
	Laptop() {
		laptopName="ThinkPad";
	}
	void display() {
		System.out.println("id:" + id  +",category:" + category +",brandName:" + brandName +",laptopName:" + laptopName);
	}
	public static void main(String[] args) { // main method
		Device one= new Laptop();
		one.display();
		Device two= new Electronics();
		two.display();
		Device three= new Device();
		three.display();
	}
}
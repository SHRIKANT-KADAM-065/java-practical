//single inheritance

class Device {
	String id;
	String category;
	Device() {
		id="001";
		category="electronic";
	}
	void display() {
		System.out.println("id:" + id +"category:" + category);
	}
}

class Laptop extends Device {
	String userName;
	Laptop() {
		userName="shri";
	}
	void display() {
		System.out.println("id:" + id  +",category:" + category +",userName:" + userName);
	}
	public static void main(String[] args) {
		Laptop one= new Laptop();
		one.display();
	}
}
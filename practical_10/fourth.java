//method overloading 

class Laptop  { 
	int laptopId;
	String laptopRam;
	String laptopMemory;	
	String laptopName;
	Laptop() {
		this.laptopId=001;
		this.laptopRam="8 GB";
		this.laptopMemory="128 GB";
		this.laptopName="lenovo";
	}
	String display(int laptpId,String laptopName) { //method 1
		System.out.println("id:" + laptopId  +",laptopName:" + laptopName);
		return"";
	}
	String display(int laptpId,String laptopRam, String laptopMemory,String laptopName) { // method 2
		System.out.println("laptopId:" + laptopId  +",Ram:" + laptopRam+",Memory:"+ laptopMemory+",laptopName:" + laptopName);
		return"";
	}
	public static void main(String[] args) { // main method
		Laptop L1= new Laptop();
		L1.display(1,"lenovo");
		L1.display(1,"6GB","280 GB","lenovo");


		
	}
}
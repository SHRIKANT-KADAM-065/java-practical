import java.util.Scanner;

class student {
	String name; 
	String reg_No; 
	long contc;

	student(String name, String reg_No, long contc) {
		this.name=name;
		this.reg_No= reg_No;
		this.contc= contc;
	}


}

class studentManagementSystem {
	static int count=0;

	public static void main(String[] args) {

	student [] stud= new student[60];
	management m= new management(); 
	
		Scanner sc= new Scanner(System.in);
		char input;
		
		do {
		System.out.println("enter N for new student" + "enter D for display" + "enter E for exit");
		
		input= sc.next().charAt(0);

		switch(input) {

		case 'N':
		sc.nextLine();
		System.out.println("enter student Name");
		String name=sc.nextLine();
		System.out.println("enter student reg_No");
		String reg_No=sc.nextLine();
		System.out.println("enter student contc");
		long contc=sc.nextInt();
		stud [count]= new student(name,reg_No,contc) ;
		
		count++;
		break;

		case 'D':
		m.display(stud,count);
		break;

		case 'E':
		break;

		default:
		System.out.println("invalid choice");
		}
		}
		while(input !='E');


}
}
class management {

 	
	void display(student[]stud,int count) {
	for(int j=0;j<count;j++) {
		System.out.println("student:" + (j+1));
		System.out.println("name:" + stud[j].name);
		System.out.println("reg_No:" + stud[j].reg_No);
		System.out.println("contc:" + stud[j].contc);
}
}
}
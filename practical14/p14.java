import java.util.Scanner;
interface Account {
	void withdrawAmount(double amount) throws insuficiantBalanceException;
	void depositAmount(double amount);
	void showBalance();
	
	
}

class SavingAccount extends BaseAccount  {
	
	public void withdrawAmount(double amount)throws insuficiantBalanceException {
		if(amount> balance)
			throw new insuficiantBalanceException();
		else
			balance -= amount;
	}
	
	
}

class BaseAccount implements Account {
	static double balance= 50000;
	public void depositAmount(double amount){
		balance += amount;
	}
	public void withdrawAmount(double amount) throws  insuficiantBalanceException { }
	
	 public void showBalance() {
		System.out.println("current balance is:"+""+ balance);
	}
	
}

class Main  {
	 
	public static void main(String args[]) {
	 	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1 for withdraw amount");
		System.out.println("enter 2 for deposit amount");
		System.out.println("enter 3 for check balance");
		int option= sc.nextInt();
		switch(option) {
			case 1:
				try{
					System.out.println("enter amount");
					if(sc.hasNextDouble()) {
						double amount= sc.nextDouble();
						new SavingAccount().withdrawAmount(amount);
						new SavingAccount().showBalance();
						break;
					}
					else {
						System.out.println("invalid input enter numeric value");
						sc.next();
						break;
					}
				}
				catch(insuficiantBalanceException e) {
					System.out.println("your balance is insuficiant");
					 new SavingAccount().showBalance();
					 break;
				}
			case 2:
				System.out.println("enter amount");
				if(sc.hasNextDouble()) {
					double amount= sc.nextDouble();
					new SavingAccount().depositAmount(amount);
					new SavingAccount().showBalance();
					break;
				}
				else {
					System.out.println("invalid input enter numeric value");
					sc.next();
					break;
				}
				
			case 3:
			 	new SavingAccount().showBalance();
				break;
			default:
				System.out.println("invalid option");
				
			}
	
	
	}
}
class insuficiantBalanceException extends Exception {  }
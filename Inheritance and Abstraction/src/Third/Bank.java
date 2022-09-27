package Third;

public class Bank {

	private String bank_name;    
	private int a_no;
	private double a_bal;
	
	public Bank() {
		bank_name="SBI";
	}
	  	 
	public Bank(int a_no) {
		this.a_no = a_no;
	}
	
	public Bank(double a_bal) {
	this.a_bal = a_bal;
	}
	 
	public void bankName() {
		System.out.println("Bank Name: " + bank_name);
	    }
	
	public void printAcBalance() {
		System.out.println("Balance: " + a_bal);
	    }
	 
	public void printAcNumber() {
	    System.out.println("Account Number: " + a_no);
	    }
	 
	public void depositMoney(int money) {
	    a_bal = a_bal + money;
	    }
	    
	public static void main(String args[]){
	    			Bank b1=new Bank(12345);
	    			Bank b2=new Bank(4000.90);
	    			Bank b3=new Bank(67890);
	    			Bank b4=new Bank(5000.00);
	    			Bank b5=new Bank();
	    			
	    			
	    			b1.printAcNumber();
	    			
	    			b2.printAcBalance();
	    			b2.depositMoney(2000);
	    			
	    			b3.printAcNumber();
	    			
	    			b4.printAcBalance();
	    			b4.depositMoney(5000);
	    			
	    			b5.bankName();
	    }
	
}

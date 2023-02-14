package BankAccount;

public class BankAccount {
	private double balance;
	private String name;
	public BankAccount(String name) {
		this.name=name;
		balance=0.0;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(name+" has $"+balance);
	}
	public void withdraw(double amount) {
		if(amount<balance) {
			balance-=amount;
			System.out.println(name+" has $"+balance);
		}
		else {
			System.out.println("not enough money!!");
		}
	}
	public void transfer(double amount, BankAccount account) {
		if(amount>this.balance) {
			System.out.println("Transfer fails");
		}
		else {
			System.out.println("$"+amount+" has been transfered to "+account.name+
					" from "+this.getName());
			account.deposit(amount);
			this.withdraw(amount);
		}
	}
	
	
	
	
}

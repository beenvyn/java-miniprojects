package BankAccount;

public class Driver {

	public static void main(String[] args) {
		BankAccount tom=new BankAccount("Tom");
		tom.deposit(500);
		BankAccount lam=new BankAccount("Lam");
		lam.deposit(800);
		lam.transfer(200,tom);

	}

}

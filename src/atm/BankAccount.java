package atm;
import java.util.*;

public class BankAccount {
	public String fullName;
	public String username;
	public String password;
	public double balance;
	public String lastOperation;
	
	public BankAccount(String fullName,String username, String password, double balance, String lastOperation) {
		
		setFullName(fullName);
		setUsername(username);
		setPassword(password);
		setBalance(balance);
		setLastOperation(lastOperation);
	}
	public void setFullName(String fullName) {
		this.fullName=fullName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setUsername(String username) {
		this.username=username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setLastOperation(String lastOperation) {
		this.lastOperation=lastOperation;
	}
	public String getLastOperation() {
		return lastOperation;
	}
	
	

}

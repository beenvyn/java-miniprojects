package atm;
import java.util.*;

public class ATM {
	Scanner scanner=new Scanner(System.in);
	
	public void CheckBalance(BankAccount account) {
		System.out.println("User: "+account.getUsername());
		System.out.println("Balance: "+account.getBalance());
		account.setLastOperation("Check balance");  //이거 놓침
	}
	
	public void WithdrawMoney(BankAccount account) {
		
		System.out.print("Enter amount: ");
		double amount=scanner.nextDouble();
		
		if(amount<=account.getBalance()) {
			account.setBalance(account.getBalance()-amount); }
		else {
			System.out.println("Withdrawl amount exceeded account balance");
		}
		account.setLastOperation("Withdraw");
		
		
	}
	public void DepositMoney(BankAccount account) {
		System.out.print("Enter amount: ");
		double amount=scanner.nextDouble();
		account.setBalance(account.getBalance()+amount);
	}
	
	public void LastOperation(BankAccount account) {
		System.out.println("Name: "+account.getFullName());
		System.out.println("Current Balance: "+account.getBalance());
		System.out.println("Last Operation: "+account.getLastOperation());
		
	}
	public void Operation(BankAccount account) {
		int op=5;
		
		
		while(op!=0) {
			System.out.println("1. Check balance");
			System.out.println("2. Withdraw money");
			System.out.println("3. Deposit money");
			System.out.println("4. Last Operation");
			System.out.println("0. Exit");
			
			op=scanner.nextInt();
			
			if(op==1) {
			    this.CheckBalance(account); //여기 this인거 놓침
			}
			else if(op==2) {
				this.WithdrawMoney(account);
			}
			else if(op==3) {
				this.DepositMoney(account);
			}
			else if(op==4) {
				this.LastOperation(account);
			}
			
		}
		
		
		System.out.println("Thank You!");
	}
	
	public void Login(BankAccount[] list) {
		System.out.println("Login");
		
		String un;
		String pw;
		BankAccount currentUser=null;  //
		int i;
		int result=-1;
	
		
		
		while(result!=0) {
			System.out.print("Username: ");
			un=scanner.next();
			System.out.print("Password: ");
			pw=scanner.next();
			
			for(i=0;i<list.length;i++) {
				
				if(list[i].getUsername().equals(un) && list[i].getPassword().equals(pw)) {
					result=0;
					break;
				}
				else {
					continue; //다음 반복으로 넘어가라는 뜻. 그니까 계속해서 list 배열에 있는 이름과 비번을 입력된 값과 비교해라~
				}
				
			}
			if (result==0) {
				currentUser= list[i]; //이래서 i를 for문 안에 선언하면 안됨
				break;
			}
		}
		
		if(currentUser!=null) {
			this.Operation(currentUser);
		}
		
		scanner.close();
		
	}
}
//중요한 발견!! scanner 객체는 프로그램에서 하나만 생성하고 이를 공유하도록 하는게 좋음. 그리고 scanner.close는 정말 더 이상
//입력 받을 값이 없을때 사용하기! 왜냐하면 System.in은 실행프로그램에서 하나만 생성이 되고 이를 여러개의 객체들이 공유하는 형태이기 때문에
//scanner.close()를 실행하게 되면 다른 객테들이 공유하고 있는 System.in도 닫히게 됨.
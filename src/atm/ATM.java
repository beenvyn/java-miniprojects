package atm;
import java.util.*;

public class ATM {
	Scanner scanner=new Scanner(System.in);
	
	public void CheckBalance(BankAccount account) {
		System.out.println("User: "+account.getUsername());
		System.out.println("Balance: "+account.getBalance());
		account.setLastOperation("Check balance");  //�̰� ��ħ
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
			    this.CheckBalance(account); //���� this�ΰ� ��ħ
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
					continue; //���� �ݺ����� �Ѿ��� ��. �״ϱ� ����ؼ� list �迭�� �ִ� �̸��� ����� �Էµ� ���� ���ض�~
				}
				
			}
			if (result==0) {
				currentUser= list[i]; //�̷��� i�� for�� �ȿ� �����ϸ� �ȵ�
				break;
			}
		}
		
		if(currentUser!=null) {
			this.Operation(currentUser);
		}
		
		scanner.close();
		
	}
}
//�߿��� �߰�!! scanner ��ü�� ���α׷����� �ϳ��� �����ϰ� �̸� �����ϵ��� �ϴ°� ����. �׸��� scanner.close�� ���� �� �̻�
//�Է� ���� ���� ������ ����ϱ�! �ֳ��ϸ� System.in�� �������α׷����� �ϳ��� ������ �ǰ� �̸� �������� ��ü���� �����ϴ� �����̱� ������
//scanner.close()�� �����ϰ� �Ǹ� �ٸ� ���׵��� �����ϰ� �ִ� System.in�� ������ ��.
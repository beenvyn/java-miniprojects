package atm;

public class main {

	public static void main(String[] args) {
		ATM atm=new ATM();
		
		BankAccount account1=new BankAccount("Firuz","firuz","ps1",20000.0,"");
		BankAccount account2=new BankAccount("Kang Seong","kang","ps2",34000.0,"");
		BankAccount account3=new BankAccount("Seo Ryu","ryu","ps3",10000.0,"");
		
		BankAccount[] BankAccountList= {account1, account2, account3};
		
		atm.Login(BankAccountList);
	}

}

package RestaurantBill;
import java.util.*;

public class Customer {
	public static void main(String[] args) {
		String menu[]= {"Sandwich","Coffee","Fries","Salad"};
		double price[]= {6.3,3.2,4.0,3.5};
		for(int i=0;i<menu.length;i++) {
			System.out.println("MENU: "+ menu[i]+ "\tPRICE: "+ price[i] );
			}
		System.out.print("Select menu & quantity: ");
		Bill myBill=new Bill();
		String choice;
		int quan;
		
		while(true) {
		Scanner scanner=new Scanner(System.in);
		choice=scanner.next();
		if(choice.equals("q")) break;
		quan=scanner.nextInt();
		myBill.addOrder(choice,quan,menu,price);
		}
		myBill.getOrder();
		
}

}

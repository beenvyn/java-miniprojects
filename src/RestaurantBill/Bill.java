package RestaurantBill;
import java.util.*;

public class Bill {
	ArrayList<String> orderedFood;
	ArrayList<Integer> orderedQuantity;
	double totalPrice=0.0;
	
	public Bill() {
		orderedFood=new ArrayList<String>();
		orderedQuantity=new ArrayList<Integer>();
	}
	public double getTotal() {
		return totalPrice;
	}
	public void addOrder(String meal,int quantity,String[] menu, double[] price) {
		orderedFood.add(meal);
		orderedQuantity.add(quantity);
		for(int i=0;i<menu.length;i++) {
			if(meal.equals(menu[i]))
				totalPrice+=price[i]*quantity;
		}
	}
	public void getOrder() {
		System.out.println("------------Bill-------------");
		for(int i=0;i<orderedFood.size();i++) {
			System.out.print(orderedFood.get(i)+" ");
			System.out.println(orderedQuantity.get(i));
		}
		System.out.println("Total Price= "+totalPrice);
	}
}

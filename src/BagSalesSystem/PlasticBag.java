package BagSalesSystem;

public class PlasticBag extends Bag {
	//variable specific to PlasticBag
	//Tax is charged to protect the environment :)
	private double tax;
	private double total;
	public void setTax(double tax) {
		this.tax=tax;
	}
	public double getTax() {
		return tax;
	}
	public double getPrice() {
		double area=getLength()*getWidth();
		if(area>250) {
			price=2000;
		}
		else 
			price=1000;
		
		total=price+(price*getTax());
		return total;
	}

}

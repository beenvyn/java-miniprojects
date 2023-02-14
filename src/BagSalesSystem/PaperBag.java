package BagSalesSystem;

public class PaperBag extends Bag {
	public double getPrice() {
		//length and width are private so we need getter methods to obtain them
		double area=getLength()*getWidth();
		if(area>300.0) {
			price=1000.0;
		}
		else
			price=700.0;
		return price;
	}

}

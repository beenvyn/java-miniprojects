package BagSalesSystem;

public class Customer {
	public static void main(String[] args) {
		PaperBag paperBag=new PaperBag();
		paperBag.setLength(10.0);
		paperBag.setWidth(10.0);
		System.out.println("Cost of paperbag: "+
		                      paperBag.getPrice());

		PlasticBag plasticBag=new PlasticBag();
		plasticBag.setLength(40.0);
		plasticBag.setWidth(10.0);
		plasticBag.setTax(0.2);
		System.out.println("Cost of plasticbag: "+
		                       plasticBag.getPrice());
		                    
	}

}

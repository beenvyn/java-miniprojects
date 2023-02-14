package BagSalesSystem;

public abstract class Bag {
	private double length, width; //Can't be accessed directly by subclass
	protected double price; //private is used so that "price" can be 
	                         //accessed by subclass
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public abstract double getPrice(); //overriding must be done in subclass!
}

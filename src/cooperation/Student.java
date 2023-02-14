package cooperation;

public class Student {
	String studentName;
	int money;
	
	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money-=1000;
	}
	
	public void takeSub(Subway sub) {
		sub.take(1500);
		money-=1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"¥‘¿« ≥≤¿∫ µ∑¿∫"+money+"¿‘¥œ¥Ÿ.");
	}

}

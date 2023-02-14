package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james=new Student("james",5000);
		Bus bus9300=new Bus(9300);
		
		james.takeBus(bus9300);
		james.showInfo();
		bus9300.showInfo();
		
		Student tomas=new Student("tomas",7000);
		Subway line2=new Subway(2);
		
		tomas.takeSub(line2);
		tomas.showInfo();
		line2.showInfo();
	}
}

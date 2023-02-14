package compareScores;

public class Driver {

	public static void main(String[] args) {
		Student bob=new Student("Bob");
		bob.addMarks("English",63);
		bob.addMarks("Math", 99);
		bob.addMarks("Science", 79);
		Student lexy=new Student("Lexy");
		lexy.addMarks("English", 57);
		lexy.addMarks("Math", 87);
		lexy.addMarks("Science",34);
		
		int res=bob.compareTo(lexy);
		if(res>0)
			System.out.println(bob.getName()+" has higher marks than Lexy");
		else if(res<0)
			System.out.println("same marks");
		else
			System.out.println(lexy.getName()+" has higher marks than Bob");

	}

}

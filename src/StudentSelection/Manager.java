package StudentSelection;
import java.util.*;

public class Manager {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter number of students:");
		int studentNum=scanner.nextInt();
		String nameArr[]=new String[studentNum];
		int ageArr[]=new int[studentNum];
		
		for(int i=0;i<studentNum;i++) {
			System.out.print("Enter name & age of student: ");
			nameArr[i]=scanner.next();
			ageArr[i]=scanner.nextInt();
		}
		for(int i=0;i<studentNum;i++) {
			if(ageArr[i]>=15) {
				System.out.println(nameArr[i]+" can receive a vaccine.");
				System.out.println(nameArr[i]+" is now "+ ageArr[i]);
		}
		}
	}
}

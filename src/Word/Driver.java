package Word;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter your line: ");
		String content=scanner.nextLine();
		Content myContent=new Content(content);
		String word="the";
		System.out.println(word+": "+myContent.getCount(word));
	}

}

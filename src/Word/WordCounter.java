package Word;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		System.out.print("Enter your sentence: ");
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		line=line.trim(); //trim()은 문장의 앞 뒤 공백을 제거해주는 메서드임. 중간 공백은 제거해주지 않음. 
		                  //문장을 입력받을때 사용자가 앞뒤 공백 없이 입력을 하면 이걸 쓰든 안쓰든 똑같은 결과가 나오겠지만 그렇지 않으면 오류가 발생하므로 예방차원에서 사용해주는게 좋다.
		int cnt=0;
		
		if(line.length()==0) { //length()는 문자열의 문자의 개수를 리턴해줌(공백, 특수문자도 포함!!)
			cnt=0;
		}
		else {
			cnt++; //for counting the first word!!첫 단어 앞에는 공백이 없기 때문에 아래의 for문 조건에 해당이 안된다. 
			       //그래서 첫번째 단어는 먼저 카운팅 해주고 나머지 단어들은 for문을 이용해서 따로 카운팅 해주는 것! 만약 이걸 해주지 않으면 한 단어가 계속 적게 카운팅 됨.
			for(int i=0;i<line.length();i++) {
				if(line.charAt(i)==' '&&line.charAt(i+1)!=' ') { //앞부분이 공백, 거기서 한칸 더 간곳은 공백이 아니면(문자가 있으면) 그걸 한 단어로 세는것임.
					cnt++;                                       //charAt()는 String으로 저장된 문자열 중 한 글자만 선택해서 char로 바꿔주는 메서드이다.charAt(0)부터 시작함.
				}
			}
		}
		System.out.println("The number of words: "+cnt);
	}
}
//단어를 세는 원리에 대해 알게 됨. 앞부분 공백&&뒷 부분 문자=> 단어, 첫번째 단어는 따로.
//trim()-앞, 뒤 공백만 제거. 중간은 제거 x
//length()- 공백, 특수문자도 다 셈
//charAt()- string에서 특정 문자만 추출

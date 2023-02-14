package Word;
import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		System.out.print("Enter your sentence: ");
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		line=line.trim(); //trim()�� ������ �� �� ������ �������ִ� �޼�����. �߰� ������ ���������� ����. 
		                  //������ �Է¹����� ����ڰ� �յ� ���� ���� �Է��� �ϸ� �̰� ���� �Ⱦ��� �Ȱ��� ����� ���������� �׷��� ������ ������ �߻��ϹǷ� ������������ ������ִ°� ����.
		int cnt=0;
		
		if(line.length()==0) { //length()�� ���ڿ��� ������ ������ ��������(����, Ư�����ڵ� ����!!)
			cnt=0;
		}
		else {
			cnt++; //for counting the first word!!ù �ܾ� �տ��� ������ ���� ������ �Ʒ��� for�� ���ǿ� �ش��� �ȵȴ�. 
			       //�׷��� ù��° �ܾ�� ���� ī���� ���ְ� ������ �ܾ���� for���� �̿��ؼ� ���� ī���� ���ִ� ��! ���� �̰� ������ ������ �� �ܾ ��� ���� ī���� ��.
			for(int i=0;i<line.length();i++) {
				if(line.charAt(i)==' '&&line.charAt(i+1)!=' ') { //�պκ��� ����, �ű⼭ ��ĭ �� ������ ������ �ƴϸ�(���ڰ� ������) �װ� �� �ܾ�� ���°���.
					cnt++;                                       //charAt()�� String���� ����� ���ڿ� �� �� ���ڸ� �����ؼ� char�� �ٲ��ִ� �޼����̴�.charAt(0)���� ������.
				}
			}
		}
		System.out.println("The number of words: "+cnt);
	}
}
//�ܾ ���� ������ ���� �˰� ��. �պκ� ����&&�� �κ� ����=> �ܾ�, ù��° �ܾ�� ����.
//trim()-��, �� ���鸸 ����. �߰��� ���� x
//length()- ����, Ư�����ڵ� �� ��
//charAt()- string���� Ư�� ���ڸ� ����

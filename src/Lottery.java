import java.util.Random;
import java.util.Arrays;

public class Lottery {

	public static void main(String[] args) {
		Random rand=new Random();
		int min=1, max=49, slot=6;
		
		int[] lotteryArray=new int[slot];
		boolean isRepeated;
		int randNum=0;
		
		for(int indexDrawn=0;indexDrawn<slot;indexDrawn++) {
			do {
				isRepeated=false;
				randNum=rand.nextInt(max+1)+min;
				//1���� 49������ ���� ����. nextInt(10)�� 0���� 9������ ���� ����
				
				for(int i=0;i<indexDrawn;i++) {
					if(randNum==lotteryArray[i]) {
						isRepeated=true;
						break; //while(isRepeated)�� �̵���-> isRepeated�� true�̹Ƿ� do{ �κ����� �̊E�ؼ� ������ �� �ٽ� ����.
					}
				} //�� �����̴� ���� ���ڵ� �� ��ġ�°� �ִ��� Ȯ���ϴ� �뵵
				
			}while(isRepeated);
			lotteryArray[indexDrawn]=randNum; //isReapeated�� false����(�Ȱ��ľ�) ���� ������ �ڵ�
				
		}
		System.out.println("The result of the lottery: ");
		Arrays.sort(lotteryArray); //������������ ��������
		for(int j=0;j<slot;j++) {
			System.out.print(lotteryArray[j]+" ");
		}
	}
}
//boolean ����ؼ� �ߺ��Ȱ� �Ÿ��� ����� ���

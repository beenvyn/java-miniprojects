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
				//1부터 49까지의 난수 생성. nextInt(10)은 0부터 9까지의 난수 생성
				
				for(int i=0;i<indexDrawn;i++) {
					if(randNum==lotteryArray[i]) {
						isRepeated=true;
						break; //while(isRepeated)로 이동함-> isRepeated가 true이므로 do{ 부분으로 이둉해서 무작위 수 다시 생성.
					}
				} //이 뭉텅이는 뽑힌 숫자들 중 겹치는게 있는지 확인하는 용도
				
			}while(isRepeated);
			lotteryArray[indexDrawn]=randNum; //isReapeated가 false여야(안겹쳐야) 실행 가능한 코드
				
		}
		System.out.println("The result of the lottery: ");
		Arrays.sort(lotteryArray); //오름차순으로 정렬해줌
		for(int j=0;j<slot;j++) {
			System.out.print(lotteryArray[j]+" ");
		}
	}
}
//boolean 사용해서 중복된거 거르는 방법을 배움

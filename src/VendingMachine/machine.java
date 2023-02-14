package VendingMachine;
import java.util.*;

public class machine {
	static int admin=1004;
	static int profit=0;
	static int count=3;
	static ArrayList<String> box=new ArrayList<String>(Arrays.asList("신라면","새우탕","열라면"));
	static ArrayList<Integer> price=new ArrayList<Integer>(Arrays.asList(1000,1500,2000));
	static ArrayList<Integer> stock=new ArrayList<Integer>(Arrays.asList(2,4,5));
	//단순 배열로 선언하면 길이를 바꿀 수가 없으니까 arrayList 사용. ()안에 Arrays.asList()쓰면 생성과 동시에 초기화도 가능!
	
	static Scanner scanner=new Scanner(System.in);
		
	public static void admin() {
			while(true) {
				System.out.println("------------------------------------------------");
				System.out.println("관리자 페이지입니다.");
				System.out.println("1.메뉴 변경 2.가격 변경 3.재고 추가 4.메뉴 추가 5.수익 확인 (종료는 -1)");
				System.out.println("번호를 입력하세요:");
				System.out.println("------------------------------------------------");
				
				int choice3=scanner.nextInt();
				if(choice3==1) {
					System.out.print("변경하실 메뉴의 번호를 입력하세요(1~3) :");
					int newNum=scanner.nextInt();
					System.out.print(box.get(newNum-1)+"를 무엇으로 바꾸시겠습니까?");
					String newName=scanner.next();
					box.set(newNum-1,newName);
					System.out.print(newName+"의 가격은 얼마입니까?: ");
					price.set(newNum-1, scanner.nextInt());
					System.out.print(newName+"의 재고를 몇개 등록하시겠습니까?: ");
					stock.set(newNum-1,scanner.nextInt());
					System.out.println("메누 변경이 완료되었습니다!");
					System.out.println("------------------------------------------------");
				
				}
				else if(choice3==2) {
					System.out.print("가격을 변경할 메뉴의 번호를 입력하세요(1~3) :");
					int newNum2=scanner.nextInt();
					System.out.print(box.get(newNum2-1)+"의 가격을 얼마로 변경하시겠습니까?");
					price.set(newNum2-1,scanner.nextInt());
					System.out.println("가격 변경이 완료되었습니다!");
				}
				else if(choice3==3) {
					System.out.print("재고를 추가할 메뉴의 번호를 입력하세요: ");
					int addNum=scanner.nextInt();
					System.out.print("재고를 얼마나 추가하시겠습니까?: ");
					stock.set(addNum-1,stock.get(addNum-1)+scanner.nextInt());
					System.out.println("재고가 추가 되었습니다!");
				}
				else if(choice3==4) {
					System.out.print("추가하실 메뉴의 이름을 입력하세요: ");
					box.add(scanner.next());
					System.out.print("추가하실 메뉴의 가격을 입력하세요: ");
					price.add(scanner.nextInt());
					System.out.print("추가하실 메뉴의 재고는 몇개 입니까?: ");
					stock.add(scanner.nextInt());
					count++;
					System.out.println("메뉴 추가가 완료 되었습니다!");
				}
				else if(choice3==5) {
					System.out.println("총 수익은 "+profit+"원 입니다");
				}
				else if(choice3==-1) {
					user(); //
					return;
				}
			}
		}

	public static void user() {
		
		Boolean first=true;
		int money=0;
		int i;
		
		while(true) {
		System.out.println("------------------------------------------");
	    System.out.println("라면 자판기 입니다.(상품(재고))");
	    for(i=0;i<count;i++) {
	    	System.out.print((i+1)+":"+box.get(i)+"("+price.get(i)+"W)-"+stock.get(i)+"개 ");
	    }
	    System.out.println();
	    System.out.println("------------------------------------------");
	if(first) {
		System.out.print("돈을 넣어주세요: ");
		money=scanner.nextInt();
		first=false; //이렇게 무언가를 한번만 반복하고 싶을떄 boolean 플래그 사용!
	}
	if(money==1004) {
		admin(); //같은 패키지더라도 다른 클래스에 있는 메서드를 사용하려면 그 클래스의 객체를 만들어서 메서드를 호출해야됨.
	}
	System.out.print("메뉴 입력: ");
	int choice=scanner.nextInt();
	if(money>price.get(choice-1)) {
		if(stock.get(choice-1)>0) {
			money-=price.get(choice-1);
			stock.set(choice-1,stock.get(choice-1)-1);
			profit+=price.get(choice-1);
			System.out.println(box.get(choice-1)+"가 나왔다!");
		}
		else {
			System.out.println("재고가 없습니다!");
			continue; //???
			}
	}
	else {
		System.out.println("잔액이 부족합니다..");
	}
	
	System.out.println("잔액: "+money);
	if(money==0) {
		System.out.println("이용해주셔서 감사합니다.");
		first=true;
		continue;
	}
	
	System.out.println("1.계속 구매하기 2. 금액 추가하기 3. 잔돈 반환하기");
	System.out.print("번호를 입력하세요: ");
	int choice2=scanner.nextInt();
	
	if(choice2==1) {
		continue; //???
	}
	else if(choice2==2) {
		System.out.print("돈을 넣어주세요: ");
		money+=scanner.nextInt();
		System.out.println("금액이 추가 되었습니다! 잔액: "+money);
		continue;
	}
	else if(choice2==3) {
		System.out.println("거스름돈 "+money+"원이 반환됩니다.");
		System.out.println("감사합니다!");
		first=true; //이거 놓치지 말것
	}
	}
	}
	public static void main(String[] args) {
		user();
		return;

	}
}
//뭔가 그냥 배열보다 arraylist로 구현하는게 관리자 페이지에서 구현이 더 쉬울 것 같아서 써봤는데 배열이 더 쉬울둣,,, 담엔 배열로
//한번 더 해봐야지,,그리고 변수명들이 너무 복잡해...
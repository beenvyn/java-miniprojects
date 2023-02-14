package VendingMachine;
import java.util.*;

public class machine {
	static int admin=1004;
	static int profit=0;
	static int count=3;
	static ArrayList<String> box=new ArrayList<String>(Arrays.asList("�Ŷ��","������","�����"));
	static ArrayList<Integer> price=new ArrayList<Integer>(Arrays.asList(1000,1500,2000));
	static ArrayList<Integer> stock=new ArrayList<Integer>(Arrays.asList(2,4,5));
	//�ܼ� �迭�� �����ϸ� ���̸� �ٲ� ���� �����ϱ� arrayList ���. ()�ȿ� Arrays.asList()���� ������ ���ÿ� �ʱ�ȭ�� ����!
	
	static Scanner scanner=new Scanner(System.in);
		
	public static void admin() {
			while(true) {
				System.out.println("------------------------------------------------");
				System.out.println("������ �������Դϴ�.");
				System.out.println("1.�޴� ���� 2.���� ���� 3.��� �߰� 4.�޴� �߰� 5.���� Ȯ�� (����� -1)");
				System.out.println("��ȣ�� �Է��ϼ���:");
				System.out.println("------------------------------------------------");
				
				int choice3=scanner.nextInt();
				if(choice3==1) {
					System.out.print("�����Ͻ� �޴��� ��ȣ�� �Է��ϼ���(1~3) :");
					int newNum=scanner.nextInt();
					System.out.print(box.get(newNum-1)+"�� �������� �ٲٽðڽ��ϱ�?");
					String newName=scanner.next();
					box.set(newNum-1,newName);
					System.out.print(newName+"�� ������ ���Դϱ�?: ");
					price.set(newNum-1, scanner.nextInt());
					System.out.print(newName+"�� ��� � ����Ͻðڽ��ϱ�?: ");
					stock.set(newNum-1,scanner.nextInt());
					System.out.println("�޴� ������ �Ϸ�Ǿ����ϴ�!");
					System.out.println("------------------------------------------------");
				
				}
				else if(choice3==2) {
					System.out.print("������ ������ �޴��� ��ȣ�� �Է��ϼ���(1~3) :");
					int newNum2=scanner.nextInt();
					System.out.print(box.get(newNum2-1)+"�� ������ �󸶷� �����Ͻðڽ��ϱ�?");
					price.set(newNum2-1,scanner.nextInt());
					System.out.println("���� ������ �Ϸ�Ǿ����ϴ�!");
				}
				else if(choice3==3) {
					System.out.print("��� �߰��� �޴��� ��ȣ�� �Է��ϼ���: ");
					int addNum=scanner.nextInt();
					System.out.print("��� �󸶳� �߰��Ͻðڽ��ϱ�?: ");
					stock.set(addNum-1,stock.get(addNum-1)+scanner.nextInt());
					System.out.println("��� �߰� �Ǿ����ϴ�!");
				}
				else if(choice3==4) {
					System.out.print("�߰��Ͻ� �޴��� �̸��� �Է��ϼ���: ");
					box.add(scanner.next());
					System.out.print("�߰��Ͻ� �޴��� ������ �Է��ϼ���: ");
					price.add(scanner.nextInt());
					System.out.print("�߰��Ͻ� �޴��� ���� � �Դϱ�?: ");
					stock.add(scanner.nextInt());
					count++;
					System.out.println("�޴� �߰��� �Ϸ� �Ǿ����ϴ�!");
				}
				else if(choice3==5) {
					System.out.println("�� ������ "+profit+"�� �Դϴ�");
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
	    System.out.println("��� ���Ǳ� �Դϴ�.(��ǰ(���))");
	    for(i=0;i<count;i++) {
	    	System.out.print((i+1)+":"+box.get(i)+"("+price.get(i)+"W)-"+stock.get(i)+"�� ");
	    }
	    System.out.println();
	    System.out.println("------------------------------------------");
	if(first) {
		System.out.print("���� �־��ּ���: ");
		money=scanner.nextInt();
		first=false; //�̷��� ���𰡸� �ѹ��� �ݺ��ϰ� ������ boolean �÷��� ���!
	}
	if(money==1004) {
		admin(); //���� ��Ű������ �ٸ� Ŭ������ �ִ� �޼��带 ����Ϸ��� �� Ŭ������ ��ü�� ���� �޼��带 ȣ���ؾߵ�.
	}
	System.out.print("�޴� �Է�: ");
	int choice=scanner.nextInt();
	if(money>price.get(choice-1)) {
		if(stock.get(choice-1)>0) {
			money-=price.get(choice-1);
			stock.set(choice-1,stock.get(choice-1)-1);
			profit+=price.get(choice-1);
			System.out.println(box.get(choice-1)+"�� ���Դ�!");
		}
		else {
			System.out.println("��� �����ϴ�!");
			continue; //???
			}
	}
	else {
		System.out.println("�ܾ��� �����մϴ�..");
	}
	
	System.out.println("�ܾ�: "+money);
	if(money==0) {
		System.out.println("�̿����ּż� �����մϴ�.");
		first=true;
		continue;
	}
	
	System.out.println("1.��� �����ϱ� 2. �ݾ� �߰��ϱ� 3. �ܵ� ��ȯ�ϱ�");
	System.out.print("��ȣ�� �Է��ϼ���: ");
	int choice2=scanner.nextInt();
	
	if(choice2==1) {
		continue; //???
	}
	else if(choice2==2) {
		System.out.print("���� �־��ּ���: ");
		money+=scanner.nextInt();
		System.out.println("�ݾ��� �߰� �Ǿ����ϴ�! �ܾ�: "+money);
		continue;
	}
	else if(choice2==3) {
		System.out.println("�Ž����� "+money+"���� ��ȯ�˴ϴ�.");
		System.out.println("�����մϴ�!");
		first=true; //�̰� ��ġ�� ����
	}
	}
	}
	public static void main(String[] args) {
		user();
		return;

	}
}
//���� �׳� �迭���� arraylist�� �����ϴ°� ������ ���������� ������ �� ���� �� ���Ƽ� ��ôµ� �迭�� �� �����,,, �㿣 �迭��
//�ѹ� �� �غ�����,,�׸��� ��������� �ʹ� ������...
package Word;
import java.util.ArrayList;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<String>();
		name.add("Amy");
		name.add("Tom");
		name.add("Amy");
		name.add("Billy");
		name.add("Tom");
		name.add("Robert");
		name.add("Amy");
		name.add("Robert");
		System.out.println("names before checking duplicates: ");
		for(String str:name) {
			System.out.print(str+" ");
		}
		int current=0;
		while(current<name.size()) { //�׳� �� Ʋ�� �ܿ�!
			int j=0;
			boolean isRemoved=false;
			while(j<current) {
				if(name.get(current).equals(name.get(j))) {
					name.remove(current);
					isRemoved=true;
					break;
				}
				else
					j++;
			}
			if(!isRemoved) current++; //���� ��ġ�� �ߺ��Ȱ� ���� ���� �ʾ������� ����. ������ �Ǹ� �ڵ����� ���� ��ġ�� �� ���� �ܾ �з��� ������ ����.
		}
		System.out.println("names after checking duplicates: ");
		for(String str: name)
			System.out.print(str+" ");
	}
}

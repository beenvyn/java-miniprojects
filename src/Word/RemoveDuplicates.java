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
		while(current<name.size()) { //그냥 이 틀을 외워!
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
			if(!isRemoved) current++; //현재 위치는 중복된게 삭제 되지 않았을때만 증가. 삭제가 되면 자동으로 현재 위치에 그 다음 단어가 밀려서 들어오기 때문.
		}
		System.out.println("names after checking duplicates: ");
		for(String str: name)
			System.out.print(str+" ");
	}
}

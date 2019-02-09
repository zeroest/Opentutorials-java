package collection_framwork;

import java.util.ArrayList;
import java.util.List;

class SameSentence{
	String[] compare(List<String> list1, List<String> list2){

		List<String> list3 = new ArrayList();
		
		if(list1.size()>=list2.size()) {
			for(int i = 0 ; i <list2.size(); i++) {
				if(list1.get(i).equals(list2.get(i))) {
					list3.add(list1.get(i));
				}
			}
		}else System.out.println("비교불가");
		
		String[] result = new String[list3.size()];
		list3.toArray(result);
		
		return result;
		
	}//method end
}//class end

public class SameSentenceTest {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("자바는 객체지향 언어입니다");
		list1.add("우리는 키트리에서 자바를 배우는 중입니다");
		list1.add("오늘은 컬렉션 프레임워크를 배우죠! ");
		list1.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("자바는 객체지향 언어입니다");
		list2.add("우리는 kitri에서 자바를 배우는 중입니다");
		list2.add("오늘은 콜렉션 프레임워크를 배우죠! ");
		list2.add("내일은 입출력과 네트워크를 배울 예정입니다 ");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("자바는 객체지향 언어입니다");
		list3.add("우리는 kitri에서 자바를 배우는 중입니다");
		list3.add("오늘은 콜렉션 프레임워크를 배우죠! ");
		
		SameSentence ss = new SameSentence();
		
		String[] result1 = ss.compare(list1, list2);
		for(String s : result1) {
			System.out.println(s);
		}
		
		String[] result2 = ss.compare(list1, list3);
		for(String s : result2) {
			System.out.println(s);
		}
		
	}//main end

}//class end

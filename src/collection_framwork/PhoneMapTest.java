package collection_framwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {

		Map<String, String[]> map = new HashMap<String, String[]>();

		String[] p1 = { "010-222-3333", "02-2222-3333", "java@mail.com" };
		String[] p2 = { "010-222-3544", "02-222-3353", "031-2636-4743 ", "jsp@mail.com" };
		String[] p3 = { "010-222-3425", "oracle@mail.com" };

		map.put("이자바", p1);
		map.put("홍길동", p2);
		map.put("김유진", p3);
		//map.put("이자바", p3);
		map.put("가가가", p3);
		map.remove("가가가");
		
		//System.out.println(map.size());
		
		Set<String> keys = map.keySet();
		Iterator iter = keys.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+"-");
			String[] result = map.get(iter.next());
			for(String s : result) {
				System.out.print(s+"/");
			}
			System.out.println();
		}
		
	}
}

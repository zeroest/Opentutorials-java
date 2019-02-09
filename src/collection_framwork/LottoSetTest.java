package collection_framwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoSetTest {
	
	public static void main(String[] args) {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		
		while(true) {
			int ran = (int)(Math.random()*45)+1;
			lotto.add(ran);
			if(lotto.size()==6) break;
		}
		
		
		Iterator<Integer> iter = lotto.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+"   ");
		}
		
		System.out.println();
		
		for(Integer i : lotto) {
			System.out.println(i);
		}
		
		
	}

}

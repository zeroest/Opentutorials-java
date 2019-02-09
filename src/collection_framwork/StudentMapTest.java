package collection_framwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student{
	private int id;
	private String name;
	private int kor, eng, mat, sum, avg;
	public Student(int id, String name, int kor, int eng, int mat) {
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public int getId() {
		return id;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		sum = kor+eng+mat;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg() {
		avg = sum/3;
	}
	@Override
	public String toString() {
		return id+name+sum;
	}
	
	
	
	
	
}


public class StudentMapTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(1000, "송혜교", 88, 67, 99);
		Student s2 = new Student(2000, "전지현", 100, 66, 99);
		Student s3 = new Student(3000, "김태리", 89, 67, 82);
		Student s4 = new Student(3000, "이자바", 56, 90, 82);
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		//set/get 메소드 호출 수정
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		
		Set<Integer> key = map.keySet();
		for(Integer k : key) {
			map.get(k).setSum();
			map.get(k).setAvg();
			
			System.out.println(map.get(k));
		}
		
		Collection<Student> col = map.values();
		List<Student> sort = new ArrayList(col);
		for(int i = 0 ; i<sort.size()-1 ; i++) {
			for(int j = i+1 ; j<sort.size() ; j++) {
				if(sort.get(i).getSum()<sort.get(j).getSum()) {
					Student temp = sort.get(i);
					sort.set(i, sort.get(j));
					sort.set(j, temp);
				}
			}
		}
		int cnt = 0 ;
		for(int i = 0 ; i<sort.size(); i++) {
			System.out.println(++cnt+"등" + sort.get(i));
		}
	}//main end
	
}// class end

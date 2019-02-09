package object_class;

class Student2{
	String name ;
	
	Student2(String name){
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		//Object obj = s2;
		Student2 s = (Student2) obj;
		return this.name == s.name;
	}
	
	
}

public class Equals {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2("egoing");
		Student2 s2 = new Student2("egoing");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.getClass());
		System.out.println(s2.getClass());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
	
}

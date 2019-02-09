package generic;

class EmployeeInfo{
	
	int rank;
	
	EmployeeInfo(int rank){
		this.rank = rank;
	}
	
}

class Person<T,S>{
	T info;
	S id;
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
	<U>void printInfo(U info) {
		System.out.println(info);
	}
	
	
	
}


public class Generic_Demo {

	
	public static void main(String[] args) {
		Integer i = new Integer(100);
		EmployeeInfo e1 = new EmployeeInfo(10);
		
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e1, i);
		System.out.println(p1.info.rank+" : "+p1.id);
		System.out.println(p1.id.intValue());
		
		Person p2 = new Person(e1,i);
		//System.out.println(p2.info.rank+" : "+p2.id);
		p2.printInfo(e1);
		System.out.println(e1.toString());
		
	}	
}

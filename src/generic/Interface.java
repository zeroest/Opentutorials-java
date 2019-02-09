package generic;

interface Info{
	int getInfo();
}

class EmployeeInfo2 implements Info{
	private int rank;
	EmployeeInfo2(int rank){
		this.rank = rank;
	}
	public int getInfo() {
		return rank;
	}
}

class Person2<T extends Info>{
	T info;
	Person2(T info){
		this.info = info;
	}
}


public class Interface {
	public static void main(String[] args) {
	Person2<EmployeeInfo2> p1 = new Person2<EmployeeInfo2> (new EmployeeInfo2(1));
	System.out.println(p1.info.getInfo());
	//Person<String> p2 = new Person<String>("∫Œ¿Â");

	}
}
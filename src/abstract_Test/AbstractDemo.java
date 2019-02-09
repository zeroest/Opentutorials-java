package abstract_Test;


abstract class A{
	
	abstract void a(); /*{
		System.out.println("abstract 메소드 a()");
	}*/
	//abstract method 본체를 가질 수 없다.
	void b() {
		System.out.println("일반 메소드 b()");
	}
	//abstract class 도 abstract method 가 아닌 일반 메소드가 존재할 수 있다.
	
}

class B extends A{
	int a = 1;
	void a() {
		System.out.println("abstract method a();");
	}
	void b(int a) {

		System.out.println(a);
	}
}


public class AbstractDemo {
	public static void main(String[] args) {
		//A intant_abstract = new A();
		//abstract class를 인스턴스화 하면 오류가 발생한다. 구체적인 메소드의 내용이 존재하지 않기 때문에
		
		B ins_b = new B();
		
		ins_b.a();
		ins_b.b();
		ins_b.b(3);
		
	}
}

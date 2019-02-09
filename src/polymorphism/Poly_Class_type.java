package polymorphism;
//상속과 오버라이딩 그리고 형변환을 이용한 다형성이다. (polymorphism)
class A{
	public String x() {
		return "A.x";
	}
}

class B extends A{
	public String y() {
		return "yyy";
	}
	public String x() {
		return "B.x";
	}
}

class B2 extends A{
	public String x() {
		return "B2.x";
	}
}

public class Poly_Class_type {
	public static void main(String[] args) {
		A obj = new B();  // 클래스 B의 데이터 형이 클래스 A
		obj.x();
		//obj.y();
		A obj2 = new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
		/*클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때 
		클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 된다. 
		동시에 클래스 B에서 오버라이딩한 맴버의 동작방식은 그대로 유지한다. */
	}
}
/*클래스 B의 데이터 형을 클래스 A로 하면 클래스 B는 마치 클래스 A인것처럼 동작하게 되는 것이다. 
클래스 B를 사용하는 입장에서는 클래스 B를 클래스 A인것처럼 사용하면 된다. */


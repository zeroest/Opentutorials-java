package polymorphism;

//같은 이름이지만 서로 다른 동작 방법을 가지고 있기 때문에 오버로딩은 다형성의 한 예라고 할 수 있다.
class O{
	public void a(int param) {
		System.out.println("숫자출력");
		System.out.println(param);
	}
	public void a(String param) {
		System.out.println("문자출력");
		System.out.println(param);
	}
	
}

public class PolyOverloading {

	public static void main(String[] args) {
	O o = new O();
	o.a(1);
	o.a("bam");
	}
	
}

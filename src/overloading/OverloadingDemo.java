package overloading;

public class OverloadingDemo {
	void A() {System.out.println("void A()");}
	void A(int arg1) {System.out.println("void A(int arg1)");}
	void A(String arg1) {System.out.println("void A(String arg1)");}
	//int A() {System.out.println("void A()");}
	
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A();
		od.A(1);
		od.A("ddd");
	}
}
/*오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 
매개변수의 유형과 개수가 다르도록 하는 기술

오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메소드를 
하위 클래스가 재정의 해서 상요한다.*/


/*오버로딩(Overloading)과 오버라이딩(Overriding) 성립조건

구분	오버로딩	오버라이딩 

메소드 이름 	동일	동일 

매겨변수, 타입 	다름	동일 

리턴 타입 	상관없음	동일 */


package interface_Test;

interface I3{
	public void x();
}

interface I4 extends I3{
	public void z();
}
//인터페이스도 상속이 된다.
interface I5 extends I4{
	//private void y();
	/* 인터페이스는 그 인터페이스를 구현한 클래스를 어떻게 조작할 것인가를 규정한다. 
	그렇기 때문에 외부에서 제어 할 수 있는 가장 개방적인 접근 제어자인 public만을 허용한다. 
	public을 생략하면 접근 제어자 default가 되는 것이 아니라 public이 된다. 
	왜냐하면 인터페이스의 맴버는 무조건 public이기 때문이다.*/
}



public class Interface_rule2 implements I4 {

	public void z(){
		System.out.println(123);
	}

	public void x() {
		System.out.println(456);
	}
	
	public static void main(String[] args) {
		Interface_rule2 dd = new Interface_rule2();
		dd.z();
		dd.x();
	}
}

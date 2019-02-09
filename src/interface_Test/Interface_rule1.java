package interface_Test;

interface I1{
	public void x();
}

interface I2{
	public void z();
}


class Interface_rule1 implements I1,I2{
	//하나의 클래스가 여러개의 인터페이스를 구현 할 수 있다
	public void x() {
		System.out.println(123);
	}
	public void z() {
		System.out.println(456);
	}
	public static void main(String[] args) {
		Interface_rule1 ad = new Interface_rule1();
		ad.x();
		ad.z();
	}
}
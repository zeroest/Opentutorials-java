package inheritanceExam1;

class Calculator{
	int left, right;
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

class SubstractCal extends Calculator{
	public SubstractCal(int left, int right) {
		super(left, right);
/*		super 키워드는 부모 클래스를 의미한다. 
		여기에 ()붙이면 부모 클래스의 생성자를 의미하게 된다.
		이렇게 하면 부모 클래스의 기본 생성자가 없어져도 오류가 발생하지 않는다.
		하위 클래스의 생성자에서 super를 사용할 때 주의할 점은
		super가 가장 먼저 나타나야 한다는 점이다. 
		즉 부모가 초기화되기 전에 자식이 초기화되는 일을 방지하기
		위한 정책이라고 생각하자.*/
		}
	public void substract() {
		System.out.println(this.left-this.right);
	}
}


public class CalculatorConstructorDemo5 {
	public static void main(String[] args) {
		SubstractCal c1 = new SubstractCal(40, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		c1.setOprands(60, 30);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}

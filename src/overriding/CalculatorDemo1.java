package overriding;

class Calcu{
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	
	public int avg() {
		return((this.left+this.right)/2);
	}
}

class Subst extends Calcu{
	
	public void sum() {
		System.out.println("출력 결과는 "+(this.left+this.right)+"입니다.");
	}
	
	public int avg() {
		return super.avg();
	}
	
	public void sub() {
		System.out.println(this.left-this.right);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		Subst s = new Subst();
		s.setOprands(40,20);
		s.sum();
		System.out.println(s.avg());
		s.sub();
		
	}
}
/*오버라이딩을 하기 위해서는 아래의 조건을 충족시켜야 한다.
-메소드의 이름
-메소드 매개변수의 숫자와 데이터 타입 그리고 순서
-메소드의 리턴 타입
위와 같이 메소드의 형태를 정의하는 사항들을 통털어서 
메소드의 서명(signature)라고 한다. 
즉 위의 에러는 메소드들 간의 서명이 달라서 발생한 문제다.*/

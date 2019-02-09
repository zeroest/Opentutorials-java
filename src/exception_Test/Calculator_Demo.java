package exception_Test;

class Calcu{
	
	int a;
	int b;
	
	public Calcu(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void divide() {
		
		try {
			System.out.println("계산결과 입니다.");
			System.out.println(a/b);
			System.out.println("완료되었습니다.");
		} catch (Exception e) {
			System.out.println("e.egtMessage()"+e.getMessage());
			/*e.getMessage();
			오류에 대한 기본적인 내용을 출력해준다. 상세하지 않다.*/
			
			System.out.println("e.toString()"+e.toString());
			/*e.toString()
			e.getMessage()보다 더 자세한 예외 정보를 제공한다.
			java.lang.ArithmeticException은 발생한 예외가 어떤 예외에 해당하는지에 
			대한 정보라고 생각하자.*/
			
			System.out.println("+e.printStackTrace();");
			e.printStackTrace();
			/*e.printStackTrace()
			메소드 getMessage, toString과는 다르게 printStackTrace는 리턴값이 없다. 
			이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다. 
			printStackTrace는 가장 자세한 예외 정보를 제공한다.
		*/
		}
	}
	
}


public class Calculator_Demo {
	public static void main(String[] args) {
		
		Calcu a = new Calcu(10,0);
		
		a.divide();
		
	}
	

}

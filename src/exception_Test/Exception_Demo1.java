package exception_Test;

class A{
	int arr[] = new int[3];
	
	void a() {
		arr[0] = 0;
		arr[1] = 10;
		arr[2] = 20;
	}
	
	void z(int fi , int se) {
		
		try {
		System.out.println(arr[fi]/arr[se]);
		/*} catch (Exception e) {
			System.out.println(e.toString());*/
		/*Exception이 ArrayIndexOutOfBoundsException, ArithemeticException 
		보다 포괄적인 예외를 의미하기 때문에 Exception 이후에 등장하는 catch 문은 실행될 수 없는 
		구문이기 때문이다. 자바 컴파일러가 불필요한 로직을 감지하고 이를 개발자에게 알려주는 것이다.*/
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("0으로 나눌 수 없습니다!!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
			System.out.println("배열의 범위를 초과하였습니다");
		} catch (Exception e) {
			System.out.println(e.toString());
		}finally {
			System.out.println("finally 문장");
		}
		/*예를 들어 데이터베이스를 사용한다면 데이터베이스 서버에 접속해야 한다. 
		이때 데이터베이스 서버와 여러분이 작성한 에플리케이션은 서로 접속상태를 유지하게 되는데 
		데이터베이스를 제어하는 과정에서 예외가 발생해서 더 이상 후속 작업을 수행하는 것이 불가능한 경우가 
		있을 수 있다. 예외가 발생했다고 데이터베이스 접속을 끊지 않으면 데이터베이스와 연결 상태를 유지하게 
		되고 급기야 데이터베이스는 더 이상 접속을 수용할 수 없는 상태에 빠질 수 있다. 
		접속을 끊는 작업은 예외 발생여부와 상관없기 때문에 finally에서 처리하기에 좋은 작업이라고 할 수 있다. 
		말하자면 finally는 작업의 뒷정리를 담당한다고 볼 수 있다.*/
	}
	
}


public class Exception_Demo1 {

	public static void main(String[] args) {
		
		A ins = new A();
		
		ins.a();
		
			ins.z(10, 0);
			ins.z(1, 0);
			ins.z(2, 1);
	
	}
	
}

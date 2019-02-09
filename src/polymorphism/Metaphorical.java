package polymorphism;

interface father{}
interface mother{}
interface programer{
	public void coding();
}
interface believer{}

class Steve implements father,programer,believer{
	public void coding() {
		System.out.println("fast");
	}
}
class Rachel implements mother,programer{
	public void coding() {
		System.out.println("elegance");
	}
}

public class Metaphorical { // workspace

	public static void main(String[] args) {
		
		programer employee_f = new Steve();
		programer employee_m = new Rachel();
		
		employee_f.coding();
		employee_m.coding();
	}
	
}
/*Steve와 Rachel의 사용자인 직장에서는 Steve와 Rachel의 인터페이스인 programmer를 통해서
두사람과 관계하게 된다. 두 사람이 어떤 종교나 가족관계를 가졌건 인터페이스 programmer을 가지고 있다면 
고용할 수 있다. 회사에서는 코딩을 할 수 있는 사람이 필요하고 어떤 사람이 programmer라는 
인터페이스를 구현하고 있다면 그 사람은 반드시 coding이라는 메소드를 구현하고 있을 것이기 때문이다.
또 두 사람에게 업무를 요청 할 때는 programmer라는 인터페이스의 메소드인 coding을 통해서 요청하면 된다.
하지만 두 사람의 성향이나 능력에 따라서 그 업무를 수행한 결과는 다른데 
Steve는 빠르게 코딩하고 Rachel은 우아하게 코딩하고 있다.*/

package abstract_Test;

abstract class Calculator{
	int left ;
	int right;
	final int third = 10;
	
	void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	abstract void sum();
	abstract void avg();
	
	void run() {
		sum();
		avg();
	
	}
	
}

class Cal_Plus extends Calculator{
	void sum(){
		System.out.println("+++"+(left+right));
	};
	
	void avg(){
			System.out.println("+++"+(left+right)/2);
		};
	
}

class Cal_Minus extends Calculator{
	void sum() {
		System.out.println("---"+(left+right));
	}
	final void avg() {
		System.out.println("---"+(left+right)/2);
	}
	
	
}


class ext extends Cal_Minus{
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	/*void avg() {
		System.out.println(123);
	}*/
}


public class CalculatorDemo {

	public static void main(String[] args) {
		
		
	Cal_Plus a = new Cal_Plus();
		
		a.setOprands(10,20);
		a.run();
		//a.third = 3;
	
		
	Calculator b = new Cal_Minus();
		b.setOprands(20, 40);
		b.run();
}
}

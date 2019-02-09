package polymorphism;

abstract class Calculator{
	int fi,se;
	
	public void set(int fi, int se) {
		this.fi = fi;
		this.se = se;
	
	}
	
	int _sum() {
		return fi+se;
	}
	
	abstract void sum();
	
	abstract void avg();
	
	public void run() {
		sum();
		avg();
	}
}

class Cal_DecoP extends Calculator{
	
	void sum() {
		System.out.println(_sum()+"+++");
	}
	void avg() {
		System.out.println(_sum()/2+"+++");
	}
	
}
class Cal_DecoM extends Calculator{
	void sum() {
		System.out.println(_sum()+"---");
	}
	void avg() {
		System.out.println(_sum()/2+"---");
	}
}



public class Calculator_Poly {

	public static void execute (Calculator cal) { //2.하나의 메소드로 두개의 인스턴스 처리
		System.out.println("실행 결과");
		cal.run();
	}
	
	/*public static void execute(Cal_DecoP cal_p) { //3.각각의 데이터 타입이었다면 동일한 문장이 두개나 생긴다.
		System.out.println("실행 결과");
		cal_p.run();
	}
	public static void execute(Cal_DecoM cal_m) {
		System.out.println("실행 결과");
		cal_m.run();
	}*/
	
	public static void main(String[] args) {
		Calculator cal_p = new Cal_DecoP(); 
		Calculator cal_m = new Cal_DecoM(); //1.같은 데이터 타입으로 선언함으로써
		
		execute(cal_p);
		execute(cal_m);

	}

}

/*클래스 CalculatorDemo의 execute 메소드는 CalculatorDecoPlus와 
CalculatorDecoMinus 클래스의 메소드 run을 호출하면서 그것이 '실행결과'라는 사실을 
화면에 표시하는 기능을 가지고 있다. 이 때 메소드 execute 내부에서는 매개변수로 전달된 
객체의 메소드 run을 호출하고 있다.

만약 메소드 execute의 매개변수 데이터 타입이 Calculator가 아니라면 어떻게 해야할까? 
위와 같은 로직을 처리 할 수 없을 것이다. 메소드 execute 입장에서는 매개변수로 전달된 값이 
Calculator이거나 그 자식이라면 메소드 run을 가지고 있다는 것을 보장 받을 수 있게 되는 것이다.

이 맥락에서의 다형성이란 하나의 클래스(Calculator)가 다양한 동작 방법
(ClaculatorDecoPlus, ClaculatorDecoMinus)을 가지고 있는데 이것을 다형성이라고 할 수 있겠다.*/ 

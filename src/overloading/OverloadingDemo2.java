package overloading;

public class OverloadingDemo2 extends OverloadingDemo {
	void A(String arg1,String arg2) {System.out.println("sub class : void A(String arg1,String arg2");}
	void A(String arg1) {System.out.println("void A(String arg1)");}
	void A() {System.out.println("sub class : void A()");}
	void A(int arg1) {System.out.println("void A(int arg1)");}

	
	
	public static void main(String[] args) {
		OverloadingDemo2 od2 = new OverloadingDemo2();
		od2.A();
		od2.A(1);
		od2.A("a");		
		od2.A("a","b");
		
	}
	
	
	
}

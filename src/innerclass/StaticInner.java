package innerclass;

class OutterSta{
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	static class InnerSta{
		static int d = 40;
		void print() {
			System.out.println(c);
		}
		static void printstatic() {
			System.out.println(d);
		}
		
	}
	
}


public class StaticInner {

	public static void main(String[] args) {
		
		OutterSta.InnerSta inner = new OutterSta.InnerSta();
		inner.print();
		inner.printstatic();
		System.out.println(inner.d);
		
		System.out.println(OutterSta.InnerSta.d);
		OutterSta.InnerSta.printstatic();
		
	}

}


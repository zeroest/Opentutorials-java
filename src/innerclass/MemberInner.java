package innerclass;

class OutterMem {
	int a = 10;
	private int b = 20;
	static int c = 30;

	class InnerMem {

		void print() {
			System.out.println(a + b + c);
		}

	}

}

public class MemberInner {

	public static void main(String[] args) {
		OutterMem outter = new OutterMem();
		OutterMem.InnerMem inner = outter.new InnerMem();

		inner.print();

	}

}

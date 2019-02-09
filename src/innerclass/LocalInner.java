package innerclass;

class OutterLoc {
	int a = 10;
	private int b = 20;
	static int c = 30;

	void outmethod() {
		class InnerLoc {
			int d = 40;

			void print() {
				System.out.println(a + b + c);
			}
		}
		/*
		 * InnerLoc in = new InnerLoc(); in.print();
		 */
	}
}

public class LocalInner {

	public static void main(String[] args) {

		OutterLoc outter = new OutterLoc();
		outter.outmethod();

	}

}

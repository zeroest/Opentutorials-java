package scope;

class Cal {
	int left, right;
	double PI = 3.14;
	//static double PI = 2.14;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}

}

public class Calculator {
	public static void main(String[] args) {

		Cal c1 = new Cal();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		System.out.println(c1.left+c1.PI);

		Cal c2 = new Cal();
		c2.setOprands(100, 200);
		c2.sum();
		c2.avg();
		c2.PI = 2.14;
		System.out.println(c2.PI);
		//System.out.println(Cal.PI); 
		
		System.out.println(c1.PI);
		
		

	}
}

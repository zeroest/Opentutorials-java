package once_test;

class Cal{
	int left, right;
	static double PI = 1.5;
	
	public Cal() {}
	
	public Cal(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	void sum() {
		System.out.println(this.left+this.right);
	}
	
	void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

public class Oncetest {
	public static void main(String[] args) {
		Cal c = new Cal();
		
		c.setOprands(20, 40);
		c.sum();
		c.avg();
		
		Cal c2 = new Cal(50, 20);
		c2.sum();
		c2.avg();
		
	}
	
	
}

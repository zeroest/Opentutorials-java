package inheritance;

class Calculator{
	int left, right;
	
	/*public Calculator(int left,int right) {
		this.left = left;
		this.right = right;
	}*/
	
	void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	void sum() {
		System.out.println(this.left + this.right);
	}
	void avg() {
		System.out.println((this.left+this.right)/2);
	}
}


class SubstractCal extends Calculator{
	
	public void substract() {
		System.out.println(this.left-this.right);
	}

}
public class CalculatorDemo1 {

	public static void main(String[] args) {
		SubstractCal c1 = new SubstractCal();
		c1.setOprands(10, 20);
		/*c1.sum();
		c1.avg();
		c1.substract();*/
		c1.left = 30;
		c1.right = 60;
		c1.sum();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 30);
		//c2.substract();
		
	}
}

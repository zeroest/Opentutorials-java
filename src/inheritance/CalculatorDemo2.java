package inheritance;


class MultipleCal extends Calculator{
	
	void multiple() {
		System.out.println(this.left*this.right);
	}
}


public class CalculatorDemo2 {

	public static void main(String[] args) {
		MultipleCal c1 = new MultipleCal();
		
		c1.setOprands(20, 40);
		c1.sum();
		c1.avg();
		c1.multiple();
		//c1.substract(); if extends SubstractCal
	}
	
	
}

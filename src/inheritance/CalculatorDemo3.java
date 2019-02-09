package inheritance;

class DivisionCal extends MultipleCal {
	public void division() {

		System.out.println(this.left / this.right);

	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		DivisionCal c1 = new DivisionCal();
		c1.setOprands(100, 20);
		c1.sum();
		c1.avg();
		c1.multiple();
		c1.division();
	}
}

package object_class;

class Calculator{
	
	private int left = 10;
	private int right = 20;
	
	void setno(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	String getno() {
		return "left : "+left+", right : "+right;
	}
	
	void sum() {
		System.out.println(left+right);
	}
	
	public String toString() {
		return super.toString()+ ", left : "+left+", right : "+right;
	}
	
}


public class Tostring {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		System.out.println(c1.toString());
		
		
	}

}

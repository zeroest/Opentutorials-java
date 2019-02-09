package once_test;

class Subt extends Cal{
	
	Subt(){}
	
	Subt(int left, int right){
		super(left,right);
	}
	
	void sub() {
		System.out.println(this.left-this.right);
	}
	
	public String toString() {
		return super.toString()+"hahaha";
	}

} 

public class Subtract {
	public static void main(String[] args) {
		Subt s = new Subt();
		
		s.setOprands(40, 10);
		s.sum();
		s.avg();
		s.sub();
		
		Subt s2 = new Subt(90,30);
		s2.sum();
		s2.avg();
		s2.sub();
		
		
		System.out.println(s.toString());
	}
}

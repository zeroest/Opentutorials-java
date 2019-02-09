package innerclass;

class OutterAno {

	int a = 10;
	private int b = 20;
	static int c = 30;

	void getb() {
		System.out.println(b);
	}

}

interface Anony{
	
	int getgrade();
}

class NotAnony implements Anony{
	public int getgrade() {
		return 1;
	}
}

public class AnonymousInner {
	public static void main(String[] args) {
		
		OutterAno outter = new OutterAno() {
			
			
			void getb() {
				System.out.println(this.a);
			}
		};
		
		outter.getb();
		
		Anony anony	= new Anony() {
			public int getgrade() {
				return 1;
			}
		};
		System.out.println(anony.getgrade());
	
	
	NotAnony co = new NotAnony();
	System.out.println(co.getgrade());
	}
}
//http://mommoo.tistory.com/16

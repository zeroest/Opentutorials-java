package enumtest;
/*
class Fruit{
	public final static Fruit APPLE = new Fruit();
	public final static Fruit PEACH = new Fruit();
	public final static Fruit BANANA = new Fruit();
}*/

enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	
	private String color;
	
	Fruit(String color) {
		this.color = color;
	}
	
	String getColor() {
		return color;
	}
}


public class EnumTest {
	public static void main(String[] args) {
		
		Fruit type = Fruit.PEACH;
		switch(type) {
		case APPLE : System.out.println("58kal, color : "+Fruit.APPLE.getColor());
			break;
		case PEACH : System.out.println("23kal, color : "+Fruit.PEACH.getColor());
			break;
		case BANANA : System.out.println("100kal, color : "+Fruit.BANANA.getColor());
		}
		
		for(Fruit f : Fruit.values()) {
			System.out.println(f+"  "+f.getColor());
		}
		
		
	}

}

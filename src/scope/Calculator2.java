package scope;


class Cal2{
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left , int right) {
		System.out.println((left+right)/2);
	}
}



public class Calculator2 {

	public static void main(String[] args) {
		Cal2.sum(10, 20);
		Cal2.avg(10, 20);
	}
}

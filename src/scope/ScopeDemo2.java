package scope;

public class ScopeDemo2 {

	static int i ;
	
	static void a() {
		i = 0; //전역변수(Grobal variable)값을 변경시켜 무한반복 된다
		//int i = 0; //지역변수(Local variable)로 무한반복 되지 않는다
	}
	public static void main(String[] args) {
		for(i=0 ; i<5 ; i++) { // i 에 int로 적용시 지역변수화
			a();
			System.out.println(i);
		}
	}
}
// 즉 어디서 변수를 선언하느냐에 따라 지역변수 전역변수를 나눈다  

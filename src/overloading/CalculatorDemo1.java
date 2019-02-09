package overloading;

class Calculator{
    int left, right, third;
      
    public void setOprands(int left, int right){
        //System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){
        //System.out.println("setOprands(int left, int right, int third)");
        this.setOprands(left, right);
        this.third = third;
    }
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

class Subbcal extends Calculator{
	
	public void sum() {
		System.out.println("결과값 입니다 : " + (this.left+this.right+this.third));
	}
	public void sub() {
		System.out.println(this.left-this.right-this.third);
		
	}
}
  
public class CalculatorDemo1 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
     
        Subbcal c2 = new Subbcal();
        c2.setOprands(60, 30);
        c2.sum();
        c2.avg();
        c2.sub();
        
        c2.setOprands(60, 30, 10);
        c2.sum();
        c2.avg();
        c2.sub();
    }
  
}

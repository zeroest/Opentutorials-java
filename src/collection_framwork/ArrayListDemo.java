package collection_framwork;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int id;
	String name;
	double pay;
	
	Employee(int id , String name, double pay){
		this.id = id;
		this.name = name;
		this.pay = pay;
	}
	
	public String toString() {
		return name + id;
	}
	
}


public class ArrayListDemo {
 
    public static void main(String[] args) {
         
    	Employee e1 = new Employee(100,"이사원",45000.77);
        Employee e2 = new Employee(200,"김대리",45000.99);
        Employee e3 = new Employee(300,"박과정",65000.77);
        Employee e4 = new Employee(400,"감과정",65000.77);

    	
        List<Employee> list = new ArrayList<Employee>();
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        list.set(1, e4);
        
        
        System.out.println(list.size());
        
        
        for(int i = 0; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }
        
        
        
    }
 
}
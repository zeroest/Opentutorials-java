package object_class;

class Student implements Cloneable {
	String name;

	Student(String name) {
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CloneTest {
	public static void main(String[] args) {
		try {
			Student s1 = new Student("egoing");
			Student s2 = (Student) s1.clone();
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

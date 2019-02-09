package object_class;

class Neosy{
	
	private String name;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Neosy other = (Neosy) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Hashcode {

	public static void main(String[] args) {
		
		Neosy n1 = new Neosy();
		Neosy n2 = new Neosy();
		
		n1.setName("neosy");
		n2.setName("neosy");
		
		System.out.println(n1.equals(n2));
		System.out.println(n1.hashCode());
		System.out.println(n2.hashCode());
		
	}
	
}

package Collection;

public class Employee implements Comparable<Employee>{

	private int age ; 
	private String name ;
	private int id ;
	
	public Employee() {
	}
	public Employee(int age, String name , int id) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
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
		
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(id > o.id) {
		return 1;
	}
		else if(id < o.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}

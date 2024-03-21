package Practice_2021;

import java.util.Comparator;

public class Employee 
{
//implements Comparable<Employee> {
//implements Comparator<Employee>{
	private int id;
    private String name;
    private String account;
    private Integer salary;
 
    public Employee(int id, String name, String account, Integer salary) {
        super();
        this.id = id;
        this.name = name;
        this.account = account;
        this.salary = salary;
    }
 

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", account=" + account + ", salary=" + salary + "]";
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAccount() {
        return account;
    }
 
    public void setAccount(String account) {
        this.account = account;
    }
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    
	/*@Override
	public int compareTo(Employee o) {
		if(this.id==o.getId())  
		return 0;  
		else if(this.id >o.getId())  
		return 1;  
		else  
		return -1;  
	}*/

    
    static Comparator<Employee> comparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getId() - o2.getId();
		}
	};

	
}

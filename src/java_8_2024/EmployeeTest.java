package java_8_2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import Practice.hello.sa;

public class EmployeeTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

	List<Employee> list = EmployeeTest.getEmployeeList();
	//System.out.println(list);
		
	 Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
	 //System.out.println(map);
	
	 
	 List<String> depList = list.stream().map(t -> t.getDepartment()).distinct().collect(Collectors.toList());
	// System.out.println(depList);
		

	 Map<String, Double> avmap = list.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingInt(Employee :: getAge)));
	 //System.out.println(avmap);
		
	Employee e = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary))).get();
	//System.out.println(e);

	
	List<String> nameList = list.stream().filter(s -> s.getYearOfJoining() > 2015).map(Employee :: getName).collect(Collectors.toList());
	//System.out.println(nameList);
		
	 Map<String, Long> mapDep = list.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
	//System.out.println(mapDep);
	
	 
	 Map<String, Double> deSalmap = list.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.averagingDouble(Employee :: getSalary)));
	 //System.out.println(deSalmap);
		
	 Employee yogEm = list.stream().filter(s -> s.getDepartment().equals("Product Development") && s.getGender().equals("Male")).min(Comparator.comparing(Employee :: getAge)).get();
	//System.out.println(yogEm);
		
	 Employee oldEmp = list.stream().min(Comparator.comparing(Employee :: getYearOfJoining)).get();
	 //System.out.println(oldEmp);
		
	 Map<String, Long> malefemal = list.stream().filter(s -> s.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
	// System.out.println(malefemal);
	 
	 Map<String, Double> avgsalmalefemal = list.stream().collect(Collectors.groupingBy(Employee :: getGender, Collectors.averagingDouble(Employee :: getSalary)));
	 //System.out.println(avgsalmalefemal);
	
	 Employee oldEmployee   = list.stream().max(Comparator.comparingInt(Employee :: getAge)).get();
	// System.out.println(oldEmployee);

	 
	 //Map<String , Double> depMaSal = list.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary, Optional :: get))));
	 
	 List<String> salhifg = list.stream().filter(s -> s.getSalary() > 100000).map(Employee :: getName).collect(Collectors.toList());
	// System.out.println(salhifg);
	 
	 Map<String, Long> depMapCound = list.stream().collect(Collectors.groupingBy(Employee :: getDepartment , Collectors.counting()));
	 System.out.println(depMapCound);
	 
	}

	public static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 250000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		return employeeList;

	}

}

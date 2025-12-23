package in03.interface1.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class No07MyInterface {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Anil", "Chennai", "DevOps");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Ashok", "Hyd", "DB");
		Employee e4 = new Employee("Ganesh", "Chennai", "DB");
		
		List<Employee>  empList= Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1=e->e.location.equals("Chennai");
		Predicate<Employee> p2=e->e.dept.equals("DevOps");
		
//		Predicate<Employee> p = p1.and(p2);
		
		for (Employee employee : empList) {
			
//			if(p.test(employee))
//			{
//				System.out.println(employee.name);
//			}
			
			if(p1.and(p2).test(employee))
			{
				System.out.println(employee);
			}
			
		}
		
		

		

		

	}

}

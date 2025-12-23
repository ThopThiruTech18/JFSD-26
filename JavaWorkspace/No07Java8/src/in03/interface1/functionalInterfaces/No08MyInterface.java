package in03.interface1.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class No08MyInterface {

	public static void main(String[] args) {

		Employee e1 = new Employee("Anil", "Chennai", "DB");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Ashok", "Hyd", "DB");
		Employee e4 = new Employee("Ganesh", "Hyd", "DB");

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> p1 = e -> e.location.equals("Hyd");
		Predicate<Employee> p2 = e -> e.dept.equals("DB");
		Predicate<Employee> p3 = e -> e.name.startsWith("G");

		for (Employee employee : empList) {

			if (p1.or(p2).or(p3).test(employee)) {
				System.out.println(employee);
			}

		}

	}

}

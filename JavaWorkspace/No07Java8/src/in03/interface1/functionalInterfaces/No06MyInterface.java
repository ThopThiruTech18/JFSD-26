package in03.interface1.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class No06MyInterface {

	public static void main(String[] args) {
		
		
		Person p1=new Person("hari", 17);
		Person p2=new Person("charan", 19);
		Person p3=new Person("vinay", 22);
		Person p4=new Person("chandu", 13);
		Person p5=new Person("ram", 30);
		
		List<Person> personsList = Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<Person> p=person-> person.age >= 18;
		
		for (Person person : personsList) {
			
			if(p.test(person))
			{
				System.out.println(person);
			}
			
		}
		
		
		

		

		

	}

}

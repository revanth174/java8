package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateToFilter {

	public static void main(String args[]) {
		List<Person> person = Arrays.asList(
				new Person("revanth",20),
				new Person("john",23),
				new Person("ram",34),
				new Person("jag",34),
				new Person("rony",45),
				new Person("krish",34));
		
		System.out.println("names starts with r");
		filter(person, p -> p.getName().startsWith("r"));
		
		System.out.println("streams to filter persons");
		person.stream().filter(p->p.getName().startsWith("r"))
		.filter(p->p.getAge() > 30)
		.forEach((System.out::println));
		
		
		System.out.println("names whose length = 5");
		filter(person, p -> p.getName().length() == 5);
		
		System.out.println("print all persons");
		filter(person,p->true);
		
		

		
	}
	
	public static void filter(List<Person> person,Predicate<Person> predicate) {
		for(Person p : person) {
			if(predicate.test(p))
				System.out.println(p);
		}
		
	}
}

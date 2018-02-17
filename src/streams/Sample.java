package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Sample {
	
	
	private static List<Person> getPersonsList() {
		return Arrays.asList(new Person("John",23,Gender.MALE),
				new Person("Sara",32,Gender.FEMALE),
				new Person("Sara",21,Gender.FEMALE),
				new Person("Jack",23,Gender.MALE),
				new Person("Jack",74,Gender.MALE),
				new Person("paula",15,Gender.FEMALE));
		
	}
	
	public static void main(String arg[]) {
		List<Person> persons = getPersonsList();
		
		// get,in uppercase , the names of female older than 18'
		
		List<String> name = new ArrayList<>();
		
		for(Person p : persons) {
			if(p.getGender() == Gender.FEMALE && p.getAge() >18) {
				
				name.add(p.getName().toUpperCase());
			}
				
				
		}
		
		
		
		for( String s : name) 
			System.out.println(s);
		
		List<String> personsList=persons.stream()
					.filter( p -> p.getGender() == Gender.FEMALE)
					.filter(p -> p.getAge() > 18)
					.map(Person :: getName)
					.map(String :: toUpperCase)
					.collect(Collectors.toList());
					
		
		System.out.println(personsList);
		
	    // print all males
		persons.stream().filter(p -> p.gender == Gender.MALE)
						.forEach(System.out:: println);
	}

	

}

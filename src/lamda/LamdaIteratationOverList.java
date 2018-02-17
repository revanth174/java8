package lamda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class LamdaIteratationOverList {
	
	public static void main(String args[]) {
	
		List<Person> person = Arrays.asList(
				new Person("revanth",20),
				new Person("John",23),
				new Person("krish",34));
		
		
		Iterator<Person> i = person.iterator();
		System.out.println("using iterator");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("using for loop");
		for(int p=0;p<person.size();p++) {
			System.out.println(person.get(p));
		}
		
		System.out.println("using for-in loop");
		for(Person p : person)
			System.out.println(p);
		
		
		System.out.println("using lamda foreach loop");
		person.forEach(p->System.out.println(p));
		System.out.println("using method references");
		person.forEach(System.out::println);
	}

}


class Person {
	String name;
	int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
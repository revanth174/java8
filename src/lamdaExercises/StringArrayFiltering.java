package lamdaExercises;

import java.util.Arrays;
import java.util.Comparator;

public class StringArrayFiltering {
	
	public static void main(String args[]) {
		String[] name = {"revanth","vandu","poojitha","venki","sreenu","uma"};
		//Arrays.sort(name);
		Arrays.sort(name, (o1,o2) -> {
				if(o1.length()< o2.length())
					return -1;
				else if(o1.length() == o2.length())
					return 0;
				else
					return +1;
				
			});
		
		Arrays.sort(name, (o1,o2) -> {
			if(o1.contains("e"))
				return -1;
			else if(o1.contains("e") && o2.contains("e"))
				return 0;
			else
				return +1;
			
		});
		System.out.println(Arrays.toString(name));
	}

}

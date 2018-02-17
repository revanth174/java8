package consumerInterfaceExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String args[]) {
		List<String> list = Arrays.asList("vendi","baby","kanna","sweety");
		/*for(String str : list)
			System.out.println(str);*/
		
		Consumer<String> con = new Consumer<String>()	{

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		};
		
		Consumer<String> c = (t) -> System.out.println(t);
		list.forEach(t -> System.out.println(t));
		
		
	}

	
}

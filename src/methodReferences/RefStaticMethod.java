package methodReferences;

public class RefStaticMethod {
	
	public static void main(String args[]) {
		
		// using inner class
		Sayable innerSay = new Sayable() {
			public void say() {
				MethodRef.print();
			}
		};
		
		innerSay.say();

		// using lamda expression
		Sayable lamdaSay = () -> MethodRef.print() ;
		lamdaSay.say();
		
		// using method reference
		Sayable methodRefSay =  MethodRef:: print;
		methodRefSay.say();
		
	}

}

interface Sayable{
	void say();
	
}



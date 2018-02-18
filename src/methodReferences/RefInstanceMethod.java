package methodReferences;

public class RefInstanceMethod {
	
	public static void main(String args[]) {
		
			RefInstanceMethod ref = new RefInstanceMethod();
			
			Sayable say = () -> ref.instanceMethod();
			say.say();
			
			// referring non static method through reference
			Sayable methodRefSay = ref :: instanceMethod;
			
			methodRefSay.say();
			
			//referring non static method using anonymous object
			Sayable anonymousObjectSay = new RefInstanceMethod() :: instanceMethod ;
			anonymousObjectSay.say();
			
			
			//Thread thread = new Thread(() -> new RefInstanceMethod().instanceMethod());
			Thread thread = new Thread(new RefInstanceMethod()::instanceMethod);
			thread.start();
			
			
		
	}
	
	
	void instanceMethod() {
		System.out.println("this is instance method called through method reference");
	}

}




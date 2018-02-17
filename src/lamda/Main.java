package lamda;

public class Main {
	public static void main(String args[]) {
		A a = new A() {
			
			public void show(int i) {
				System.out.println(i);
				
			}
		};
		
		a.show(10);
		A ab = (i) -> System.out.println(i);	
		a.show(10);
	}
}

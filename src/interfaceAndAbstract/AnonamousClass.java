package interfaceAndAbstract;

public class AnonamousClass {

	public static void main(String args[]) {
		A a = new A() {
		public void show () {
			System.out.println("anonamous class show....");
		}
		
		public void display() {
			System.out.println("anonamous class display");
		}
	};
	a.show();
	a.display();
	}
	
}

interface A {
	void show();
	void display();
}


class B implements A {

	@Override
	public void show() {
		System.out.println("show........");
		
	}

	@Override
	public void display() {
		System.out.println("display........");
		
	}
	
}
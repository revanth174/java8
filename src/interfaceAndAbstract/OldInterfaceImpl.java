package interfaceAndAbstract;

public class OldInterfaceImpl implements oldInterface {

	@Override
	public void existingMethod() {
		System.out.println("implemented ");
	}

	/*@Override
	public void newDefaultMethod(int i) {
		System.out.println("defalult method overriden");
	}*/

	public static void main(String args[]) {
		OldInterfaceImpl old = new OldInterfaceImpl();
		old.newDefaultMethod(10);
		old.existingMethod();
	}

}

interface news {
	default public void newDefaultMethod() {
		System.out.println("news defauld method");
	}
}

package interfaceAndAbstract;

public interface oldInterface {
	int k = 18;

	public void existingMethod();

	default void newDefaultMethod(int i) {
		System.out.println(k);
		System.out.println("New default method is added in interface" + i);
	}
}

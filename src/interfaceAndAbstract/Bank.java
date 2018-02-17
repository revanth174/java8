package interfaceAndAbstract;

public abstract class Bank {
	
	public void depoist() {
		System.out.println("deposit.....");
	}
	
	public void withdraw() {
		System.out.println("withdraw........");
	}
	
	abstract void EMIpayment();

}

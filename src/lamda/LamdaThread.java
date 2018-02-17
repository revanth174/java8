package lamda;

public class LamdaThread {
	
	public static void main(String args[]) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("thread is running");
			}
			
		});
		
		Thread lamdathread = new Thread(()->System.out.println("lamda thread is running"));
		t.start();
		lamdathread.start();
	}
	
	

}




package selfstudy.java.threadbasic;

public class ThreadDemo {

	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread1");
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread2");
				
				try {
					Thread.sleep(1000);
				} catch (Exception ex) {
				}
			}
		});
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		
		try {
			Thread.sleep(10);
		} catch (Exception ex) {
		}
		
		t2.start();
		
		
		t1.join(); // main thread will stop execution and wait for Thread1 to complete
		t2.join(); // main thread will stop execution and wait for Thread2 to complete
		
		System.out.println(t1.isAlive());
		System.out.println("Bye");

	}

}

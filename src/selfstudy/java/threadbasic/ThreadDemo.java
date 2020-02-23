package selfstudy.java.threadbasic;

public class ThreadDemo {

	public static void main(String[] args) {
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

		t1.start();
		
		try {
			Thread.sleep(10);
		} catch (Exception ex) {
		}
		
		t2.start();

	}

}

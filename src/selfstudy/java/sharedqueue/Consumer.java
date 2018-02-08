package selfstudy.java.sharedqueue;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {

	private final BlockingQueue<Car> sharedQueue;

	public Consumer(BlockingQueue<Car>  sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + sharedQueue.take().toString());
				
				Thread.sleep(2000);
			} catch (InterruptedException ex) {
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

}

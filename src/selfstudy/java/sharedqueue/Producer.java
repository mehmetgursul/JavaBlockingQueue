package selfstudy.java.sharedqueue;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {

	private final BlockingQueue<Car> sharedQueue;

	public Producer(BlockingQueue<Car> sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Car c = createCar(i);
				System.out.println("Produced: " + c.toString());
				sharedQueue.put(c);
			} catch (InterruptedException ex) {
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
	
	public Car createCar(Integer i) {
		Car car = new Car(i.toString(),"Toyota", "Corolla", "2011");
		return car;		
	}

}

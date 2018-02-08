/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package selfstudy.java.sharedqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {
	private static final int QUEUE_SIZE = 5;

	public static void main(String[] args) {
		
		
		// Creating shared object
		BlockingQueue<Car> sharedQueue = new LinkedBlockingQueue<Car>(QUEUE_SIZE);

		// Creating Producer and Consumer Thread
		Thread prodThread = new Thread(new Producer(sharedQueue));
		Thread consThread = new Thread(new Consumer(sharedQueue));

		// Starting producer and Consumer thread
		prodThread.start();
		consThread.start();
	}

}

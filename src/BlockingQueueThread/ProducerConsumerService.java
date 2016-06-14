package BlockingQueueThread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
 
 
/*java.util.concurrent.BlockingQueue is a Queue that 
supports operations that wait for the queue to become 
non-empty when retrieving and removing an element, 
and wait for space to become available in the queue when adding an element.*/

/*BlockingQueue implementations are thread-safe.

While implementing producer consumer problem, we will use ArrayBlockingQueue implementation 
and following methods are important to know.

put(E e): This method is used to insert elements to the queue, if the queue is full it waits for the space to be available.
E take(): This method retrieves and remove the element from the head of the queue, 
if queue is empty it waits for the element to be available.*/

public class ProducerConsumerService {
 
    public static void main(String[] args) {
        //Creating BlockingQueue of size 10
        BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //starting producer to produce messages in queue
        new Thread(producer).start();
        //starting consumer to consume messages from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }
 
}
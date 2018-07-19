package CircularArrayQueue;

public class CAQ_Runable {

	public static void main(String[] args)
	{
		CircularArrayQueue queue = new CircularArrayQueue(5);
		queue.deQueue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);

		queue.enQueue(4);
		queue.enQueue(5);
		queue.enQueue(1);
		queue.enQueue(3);
		System.out.println(queue.isFull());
		queue.shwo();
	}
	
	
}

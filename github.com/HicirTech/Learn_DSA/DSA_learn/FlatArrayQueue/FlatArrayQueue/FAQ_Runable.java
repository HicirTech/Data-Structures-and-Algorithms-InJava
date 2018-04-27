package FlatArrayQueue;

public class FAQ_Runable {

	public static void main(String[] args)
	{
	
		FlatArrayQueue queue = new FlatArrayQueue(3);//always not a good choose to use flat array queue
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
		queue.enQueue(5);
		queue.shwo();
	}
}

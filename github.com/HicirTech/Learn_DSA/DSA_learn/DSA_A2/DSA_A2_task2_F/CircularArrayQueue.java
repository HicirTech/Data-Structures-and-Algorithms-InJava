package DSA_A2_task2_F;
/**
 * a Queue data stucture
 * @author Luo Zeting ID:16938158
 *
 */
public class CircularArrayQueue {
	private Object[] datas;//the data of the queue
	private final int maxSize;//the maximum size of the queue
	private int size; // the element number of now have 
	private int front;// the front pointer point to the first element of queue
	private int rear;// the front pointer point to the last element of queue
	
	CircularArrayQueue(int size)//create a size of size queue
	{
		this.maxSize=size;//setup max size
		this.front=this.size=this.rear=0;
		datas=new Object[maxSize];
	}
	
	//pre:input a data object into the queue
	//post1: data inputed into the queue
	//post2: display queue is full
	public void enQueue(Object data)
	{
		if(!this.isFull())//if it is not full
		{
			this.datas[rear]=data;//put data into the end of the queue
			this.rear=(this.rear+1)%this.maxSize;//set the end in to a new place, looping in size of the queue
			this.size++;//increate the element counter
		}
		else
		{
			System.out.println("Queue is full");//if it is full, do not add element
		}
	}
	
	//post 1: a element remove from queue and return
	//post 2: display queue is empty and return null
	public Object deQueue()
	{	
		Object temp=this.datas[this.front];
	
		if(!this.isEmpty())//if the queue is not empty
		{
	
			this.front=(this.front+1)%this.maxSize;//move the front to next place,loop in the queue
			this.size--;//decease element counter
	
		}
		else
		{
			System.out.println("Queue is Empty");//if it is full, do not remove element
		}
		return temp;//return the removed element
		
	}
	
	//post:the max size of the queue
	public int getSize()//get the size of the queue
	{
		return this.maxSize;
	}
	
	//post: a boolean contain is the queue is empty or not
	public boolean isEmpty()
	{
		return this.size==0;
	}
	
	//post: a boolean contain is the queue is full or not
	public boolean isFull()
	{
		return size==this.maxSize;//if the element counter is equal to the the max size of the queue,return ture
	}
	
	public void shwo()//display all element in the queue
	{
		for(int index=0;index!=size;index++)
		{
			if(this.datas[index]!=null)
			System.out.println(this.datas[(this.front+index)%5]+" ");
		}
	}
}

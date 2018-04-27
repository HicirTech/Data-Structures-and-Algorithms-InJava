package CircularArrayQueue;

public class CircularArrayQueue {


	Object[] datas;
	int maxSize;
	int size;
	int front;
	int rear;
	CircularArrayQueue(int size)
	{
		this.maxSize=size;
		front=0;
		size=0;
		rear = 0;
		datas=new Object[maxSize];
	}
	public void enQueue(int data)
	{
		if(!this.isFull())
		{
		 datas[rear]=data;
		 rear=(rear+1)%this.maxSize;
		 size++;
		}
		else
		{
			System.out.println("Queue is full");
		}
	
	}
	public Object deQueue()
	{	Object temp=datas[front];
	
		if(!this.isEmpty())
		{
	
		front=(front+1)%this.maxSize;
		size--;
	
		}
		else
		{
			System.out.println("Queue is Empty");
		}
		return temp;
		
	}
	public int getSize()
	{
		return this.size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public boolean isFull()
	{
		return size==this.maxSize;
	}
	
	public void shwo()
	{
		for(int index=0;index!=size;index++)
		{
			if(datas[index]!=null)
			System.out.print(datas[(front+index)%5]+" ");
		}
		System.out.println();
	}
}

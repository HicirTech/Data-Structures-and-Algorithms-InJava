package FlatArrayQueue;

public class FlatArrayQueue {//Head fix

	Object[] datas;
	int maxSize;
	int size;
	int front;
	int rear;
	public FlatArrayQueue(int size)
	{
		this.maxSize=size;
		front=0;
		size=0;
		rear = 0;
		datas=new Object[maxSize];
	}
	public void enQueue(int data)
	{
		if(size!=this.maxSize)
		{
		 datas[rear]=data;
		 rear++;
		 size++;
		}
		 else
		 {
			 System.out.println("Full!");
		 }
	}
	public Object deQueue()
	{
		if(this.size!=0)
		{
		Object temp=datas[front];
		front++;
		size--;
		return temp;
		}
		else
		{
			System.out.println("Empty!");
			return null;
		}
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
			System.out.print(datas[front+index]+" ");
		}
		System.out.println();
	}
	
}

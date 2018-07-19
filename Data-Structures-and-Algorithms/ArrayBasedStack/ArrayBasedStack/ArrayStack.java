package ArrayBasedStack;

public class ArrayStack {

	Object[] datas;
	final int MaxSize;
	int top;
	public ArrayStack(int size)
	{
		this.MaxSize=size;
		this.datas=new Object[MaxSize];
		this.top=0;
	}
	
	public void push(Object data)
	{
		if(top!=this.MaxSize)
		{
		this.datas[top]=data;
		top++;
		}
		else
		{
			System.out.println("stack full");
		}
	}
	public Object pop()
	{
		if(top!=0)
		{
		Object temp;
		temp =  this.datas[top-1];
		top--;
		return temp;
		}
		else
		{
			System.out.println("Stack is empty");
			return null;
		}
		
	}
	public  Object peek()
	{
		if(top!=0)
		{
		Object temp;
		temp =  this.datas[top-1];
		return temp;
		}
		else
		{
			System.out.println("Stack is empty");
			return null;
		}
	}
	public int Size()
	{
		return this.top;
	}
	public boolean isEmpty()
	{
		if(top!=0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public void show()
	{
		for(int index = top-1; index>=0;index--)
		{
		System.out.print(this.datas[top-1-index]+" ");
		}
		System.out.println();
	}
	
}

package DynamicArrayStack;

public class DynamicArrayStack {
	
	Object[] datas;
	int MaxSize;
	int top;
	public DynamicArrayStack()
	{
		this.MaxSize=0;
		this.datas=new Object[MaxSize];
		this.top=0;
	}
	
	public void push(Object data)
	{
	
		if(top==this.MaxSize)
		{
			this.expand();
		}
		
		this.datas[top]=data;
		top++;
		
	}
	public Object pop()
	{
		if(top!=0)
		{
		Object temp;
		temp =  this.datas[top-1];
		resize();
		top--;
		return temp;
		}
		else
		{
			System.out.println("Stack is empty");
			return null;
		}
		
	}
	public void expand()
	{
		Object[] tempData = new Object[MaxSize+1];
		
		for(int index= 0;index<MaxSize;index++)
		{
			tempData[index]=datas[index];
		}
		this.MaxSize++;
		datas=tempData;
		//System.out.println(datas.length+"Enpanded!");

	}
	public void resize()
	{
		Object[] tempData = new Object[MaxSize-1];
		
		for(int index= 0;index<MaxSize-1;index++)
		{
			tempData[index]=datas[index];
		}
		this.MaxSize--;
		datas=tempData;
		
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
		for(int index = 0;index!=top;index++)
		{
		System.out.print(datas[top-index-1]+" ");
		}
		System.out.println();
	}
	
}

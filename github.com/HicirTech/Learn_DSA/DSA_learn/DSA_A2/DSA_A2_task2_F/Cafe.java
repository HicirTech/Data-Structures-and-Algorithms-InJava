package DSA_A2_task2_F;
/**
 * a cafe object have n terminals
 * @author Luo Zeting ID:16938158
 *
 */
public class Cafe {
	private final int TERMINALS_SIZE;//a final terminals number 
	private CircularArrayQueue[] terminals;//a array of queues
	
	Cafe(int terminalsSize)
	{
		this.TERMINALS_SIZE=terminalsSize;
		terminals = new CircularArrayQueue[TERMINALS_SIZE];
		for(int i=0;i!=TERMINALS_SIZE;i++)
		{
			terminals[i]= new CircularArrayQueue((int)(Math.random()*10)+3);
		}
	}
	
	
	//post: display all queue
	public void showAllTerminals()
	{
		for(int i=0;i!=TERMINALS_SIZE;i++)
		{
		System.out.println("Terminal "+i+" maximum size is: "+terminals[i].getSize());
		}
	}
	
	//post1: customer join in terminal
	//post2: displas customer left
	public void timePass()
	{
		if(!isAllQueueFull())
		{
			int ramEnqueue=(int)(Math.random()*this.TERMINALS_SIZE);
	
				while(this.terminals[ramEnqueue].isFull())
				{
					ramEnqueue=(int)(Math.random()*this.TERMINALS_SIZE);
				}
				this.customerEnqueue(ramEnqueue);			
		}
		else
		{
			System.out.println("All terminals are full!");
		}
		if(!isAllEmpty())
		{
			if(Math.random()>0.4)//random chance a customer left
			{
				int ramEnqueue=(int)(Math.random()*this.TERMINALS_SIZE);
				while(this.terminals[ramEnqueue].isEmpty())
				{
					ramEnqueue=(int)(Math.random()*this.TERMINALS_SIZE);
				}
				this.customerDequeue(ramEnqueue);	
			}
			else
			{
				System.out.println("No customer left");
			}
		}	
	}
	
	//post: return is all queue is empty
	private boolean isAllEmpty()
	{
		if(TERMINALS_SIZE==1)
		{
			return terminals[0].isEmpty();
		}
		else
		{
		int checker=0;
		for(int i=0;i!=TERMINALS_SIZE;i++)
		{
			if(terminals[i].isEmpty())
			{
				checker++;
			}
		}
		return checker==(TERMINALS_SIZE-1);
		}
	}
	
	//post: return is all queue is full
	private boolean isAllQueueFull()
	{
		
		if(TERMINALS_SIZE==1)
		{
			return terminals[0].isFull();
		}
		else
		{
		int checker=0;
		for(int i=0;i!=TERMINALS_SIZE;i++)
		{
			if(terminals[i].isFull())
			{
				checker++;
			}
		}
		return checker==(TERMINALS_SIZE-1);
		}		
	}
	
	//pre: a index of queue the custom join
	//post: a custom join in the queue
	private void customerEnqueue(int queueIndex)
	{
		Customers tempCustomer = new Customers();
		System.out.println("Terminal ["+queueIndex+"]: "+tempCustomer);
		this.terminals[queueIndex].enQueue(tempCustomer);
	}
	
	//pre: index queue is not empty
	//post: a custom dequeue
	private void customerDequeue(int queueIndex)
	{
		System.out.println("At terminal "+queueIndex+" "+this.terminals[queueIndex].deQueue()+" has left the terminal!");
	}
	
	//post:show cafe
	public void showCafe()
	{
		for(int i=0;i!=TERMINALS_SIZE;i++)
		{
			if(terminals[i].isEmpty())
			{
				System.out.println("Terminal "+i+" is empty");
			}
			else
			{
				System.out.println("Terminal "+i+" has customer:");
				terminals[i].shwo();
			}
		}
	}
}

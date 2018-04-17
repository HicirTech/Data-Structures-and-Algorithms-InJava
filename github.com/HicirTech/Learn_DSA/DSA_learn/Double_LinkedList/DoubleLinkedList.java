
public class DoubleLinkedList {

	DoubleLinkedListNode head;
	
	public void insert(Object data)
	{
		DoubleLinkedListNode temp = new DoubleLinkedListNode();
		temp.data= data;
		temp.next=null;
		if(this.head==null)
		{
			this.head=temp;
		}
		else {
			DoubleLinkedListNode n = head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=temp;
			temp.previous=n;			
		}
	}
	public void insertAt(int index,Object data)
	{
		DoubleLinkedListNode temp = new DoubleLinkedListNode();
		temp.data= data;
		temp.next=null;
		if(index==0)
		{
			temp.next=head;
			this.head.previous=temp;
			this.head=temp;
		}
		else
		{
			DoubleLinkedListNode n = head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			temp.next=n.next;
			n.next=temp;
			temp.previous=n;
		}
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			this.head=head.next;
			this.head.previous=null;
		}
		else
		{
			DoubleLinkedListNode temp = head;
			for(int i=0;i<index-1;i++)
			{
				temp = temp.next;
			}
			System.out.println(temp.next.data+" has been remove");
			temp.next=temp.next.next;	
		}
		
	}
	public void show()
	{
		DoubleLinkedListNode n = head;
		while(n!=null)
		{
			System.out.println(n.data.toString());
			n=n.next;
		}
	}
}

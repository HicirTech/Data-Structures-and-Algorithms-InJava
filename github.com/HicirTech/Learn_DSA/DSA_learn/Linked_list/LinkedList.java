
public class LinkedList {
	Node head;
	
	public void insert(Object data)
	{
		Node temp = new Node();
		temp.data=data;
		temp.next=null;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n =n.next;
			};
			n.next=temp;
		}
	}
	public void show()
	{
		Node temp = head;
		do
		{
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp!=null);
		
	}
	public void insertAtStart(Object data)
	{
		Node set = new Node();
		set.data=data;
		set.next=head;
		head =set;		
	}
	public void insertAt(int index,Object data)
	{
		Node temp = new Node();
		temp.data=data;
		temp.next=null;
		if(index==0)
		{
			this.insertAtStart(data);
		}
		else{
		Node n = head;
		for(int i=0;i<index-1;i++)
		{
			n = n.next;
		}
		
		temp.next=n.next;
		n.next=temp;		
		}
	}
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head=head.next;
		}
		else{
		Node temp = head;
		for(int i=1;i<index-1;i++)
		{
			temp = temp.next;
		}
		System.out.println(temp.next.data+" has been remove");
		temp.next=temp.next.next;	
		}
	}
}

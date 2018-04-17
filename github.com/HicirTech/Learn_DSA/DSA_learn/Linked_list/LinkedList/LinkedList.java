package LinkedList;

public class LinkedList {
	Linklist_Node head;
	
	public void insert(Object data)
	{
		Linklist_Node temp = new Linklist_Node();
		temp.data=data;
		temp.next=null;
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Linklist_Node n = head;
			while(n.next!=null)
			{
				n =n.next;
			};
			n.next=temp;
		}
	}
	public void show()
	{
		Linklist_Node temp = head;
		do
		{
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp!=null);
		
	}
	public void insertAtStart(Object data)
	{
		Linklist_Node set = new Linklist_Node();
		set.data=data;
		set.next=head;
		head =set;		
	}
	public void insertAt(int index,Object data)
	{
		Linklist_Node temp = new Linklist_Node();
		temp.data=data;
		temp.next=null;
		if(index==0)
		{
			this.insertAtStart(data);
		}
		else{
		Linklist_Node n = head;
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
		Linklist_Node temp = head;
		for(int i=0;i<index-1;i++)
		{
			temp = temp.next;
		}
		System.out.println(temp.next.data+" has been remove");
		temp.next=temp.next.next;	
		}
	}
}

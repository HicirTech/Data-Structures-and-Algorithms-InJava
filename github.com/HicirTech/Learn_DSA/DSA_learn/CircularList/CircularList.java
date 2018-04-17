
public class CircularList {

	CircularList_node head;
	public void insert(Object data)
	{
		CircularList_node temp = new CircularList_node();
		temp.data=data;
		temp.next=this.head;
		if(head==null)
		{
			head=temp;
			head.next=head;
		}
		else
		{
			CircularList_node n = head;
			while(n.next!=head)
			{
				n =n.next;
			};
			n.next=temp;
		}
	}
	public void show()
	{
		CircularList_node temp = head;
		do
		{
			System.out.println(temp.data);
			temp=temp.next;
		}while(temp!=head);
		
	}
	public void insertAtStart(Object data)
	{
		CircularList_node set = new CircularList_node();
		set.data=data;
		set.next=head;
		head =set;		
	}
	public void insertAt(int index,Object data)
	{
		CircularList_node temp = new CircularList_node();
		temp.data=data;
		temp.next=head;
		if(index==0)
		{
			this.insertAtStart(data);
		}
		else{
		CircularList_node n = head;
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
		CircularList_node temp = head;
		for(int i=0;i<index-1;i++)
		{
			temp = temp.next;
		}
		System.out.println(temp.next.data+" has been remove");
		temp.next=temp.next.next;	
		}
	}

}

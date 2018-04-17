
public class DL_Runable {

	public static void main(String[] args)
	{
		DoubleLinkedList list = new DoubleLinkedList();
		list.insert(5);
		list.insert(10);
		list.insertAt(1,15);
		list.deleteAt(1);
		list.show();
	}
}

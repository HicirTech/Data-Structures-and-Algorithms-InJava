
public class Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insertAtStart(100);
		list.insertAt(0, 95);
		
		list.deleteAt(3);
		list.show();
	}

}

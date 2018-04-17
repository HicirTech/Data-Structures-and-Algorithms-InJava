package CircularList;

public class CL_Runable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularList list = new CircularList();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.deleteAt(2);
		list.show();
	}

}

package ArrayBasedStack;

public class ABS_Runable {

	public static void main(String[] args) {

		ArrayStack stack = new ArrayStack(3);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.show();
		System.out.println(stack.Size());
		System.out.println(stack.isEmpty());
	}

}

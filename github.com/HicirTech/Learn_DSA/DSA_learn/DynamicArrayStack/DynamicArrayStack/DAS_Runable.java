package DynamicArrayStack;

public class DAS_Runable {
	public static void main(String[] args)
	{
	DynamicArrayStack stacks = new DynamicArrayStack();
	stacks.push(2);
	stacks.push(3);
	System.out.println(stacks.Size());
	System.out.println(stacks.peek());
	stacks.show();
	}
}

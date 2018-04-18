package DynamicArrayStack;

public class DAS_Runable {
	public static void main(String[] args)
	{
	DynamicArrayStack stacks = new DynamicArrayStack();
	stacks.push(2);
	stacks.push(15);
	System.out.println(stacks.Size());
	stacks.show();

	System.out.println(stacks.pop());
	System.out.println(stacks.Size());
	stacks.show();
	}
}

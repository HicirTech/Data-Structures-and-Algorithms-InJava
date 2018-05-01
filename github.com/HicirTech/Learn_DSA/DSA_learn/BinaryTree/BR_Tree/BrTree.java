package BR_Tree;

public class BrTree {
	BrNode root;
	
	public void addNode(Object data)
	{
		BrNode temp = new BrNode(data);
		if(root==null)
		{
			this.root=temp;
		}
		else
		{
		}
	}
}

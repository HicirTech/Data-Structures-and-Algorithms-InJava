package BR_Tree;

public class BR_Tree_Runable {

	public static void main(String[] args)
	{
		BrTree tree = new BrTree();
		tree.CreateBRTree();
		tree.PostOrderTravers_STACK(tree.getRoot());
		System.out.println();
		tree.postOrderRecursion(tree.getRoot());
		//tree.preOrderRecursion(tree.getRoot());
		//System.out.println(tree.getSize(tree.getRoot()));
	}
}

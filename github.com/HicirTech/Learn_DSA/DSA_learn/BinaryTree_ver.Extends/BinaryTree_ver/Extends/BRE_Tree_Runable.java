package BinaryTree_ver.Extends;

import java.util.ArrayList;


public class BRE_Tree_Runable {

	public static void main(String[] args)
	{
		BrETree tree = new BrETree();
	/*	tree.CreateBRTree();
		tree.PostOrderTravers_STACK(tree.getRoot());
		System.out.println();
		tree.postOrderRecursion(tree.getRoot());*/
		ArrayList<String> data = new ArrayList<>();
		String[] a = {"A","B","D","#","#","E","#","#","C","#","F","#","G"};
		for(String d : a)
		{
			data.add(d);
		}
		tree.reTreeByPreOrder(data);
		tree.preOrderRecursion(tree.getRoot());
	}
}

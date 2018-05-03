package BR_Tree;

import java.util.Stack;

public class BrTree {

	private BrNode root;
	//private int left,right;
	BrTree()
	{
		
		this.root=new BrNode();
	}
	public void CreateBRTree()
	{
		
		/**
		 * 				 A
		 *				/ \
		 *		       /   \	
		 * 			  B     C
		 *			 /\     /
		 *		    /  \   /
		 *		   D    E  F
		 *		  /
		 *		 /
		 *		G
		 */
		this.root.setData(new String("A"));
		this.root.setLeftChild(new BrNode("B"));
		this.root.setRightChild(new BrNode("C"));
		this.root.getLeftChild().setLeftChild(new BrNode("D"));
		this.root.getLeftChild().setRightChild(new BrNode("E"));
		this.root.getRightChild().setLeftChild(new BrNode("F"));
		this.root.getLeftChild().getLeftChild().setLeftChild(new BrNode("G"));	
	}
	public boolean isEmpty()
	{
		return (this.root==null);
	}
	public int getSize(BrNode tree)
	{
		if(tree==null)
		{
			return 0;
		}
		else
		{
			return 1+getSize(tree.getLeftChild())+getSize(tree.getRightChild());
		}
	}
	public int getHeight(BrNode tree)
	{
		if(tree==null)
		{
			return 0;
		}
		else
		{
			int left = getHeight(tree.getLeftChild());
			int right = getHeight(tree.getRightChild());
			if(left>right)
			{
				return left+1;
			}
			else
			{
				return right+1;
			}
		}
		
	}
	public void PreOrderTravers_STACK(BrNode tree)//Stack way to do pre order
	{
		if(tree==null)
		{
			return;
		}
		else
		{
		Stack<BrNode> stack = new Stack<BrNode>();
		stack.push(tree);
		while(!stack.isEmpty())
		{
			BrNode node = stack.pop();//pop root
			//push child
			
			System.out.println(node.getData().toString());
			
			if(node.getRightChild()!=null)
			{
				
				stack.push(node.getRightChild());
			}
			if(node.getLeftChild()!=null)
			{
				stack.push(node.getLeftChild());
			}
		}
	}
	}
	public void preOrderRecursion(BrNode node)
	{
		if(node==null)
		{
			return;
		}
		else
		{
			System.out.println(node.getData());
			preOrderRecursion(node.getLeftChild());
			preOrderRecursion(node.getRightChild());
		}
	}
	public void inOrderRecursion(BrNode node)
	{
		if(node==null)
		{
			return;
		}
		else
		{
			inOrderRecursion(node.getLeftChild());
			System.out.println(node.getData());
			inOrderRecursion(node.getRightChild());
		}
	}
	public void postOrderRecursion(BrNode node)
	{
		if(node==null)
		{
			return;
		}
		else
		{
			postOrderRecursion(node.getLeftChild());
			postOrderRecursion(node.getRightChild());
			System.out.println(node.getData());
		}
	}
	public void InOrderTravers_STACK(BrNode tree)
	{
	
		/*
		 *1.create an empty stack
		 *2.make current node as root
		 *3.keep current node to the stack
		 *4.move the node to left
		 *5.if current node is null and stak is not empty
		 *5.1 pop the top from stack
		 *5.2 print the poped item
		 *5.3 move the current item to the right of the poped item
		 *5.4 -> go 3
		 *6If the current node is null and stack is empty, function complete
		 * 
		 */
		if (tree == null) {
            return;
        }
        Stack<BrNode> stack = new Stack<BrNode>();
        BrNode node = tree;
       
        while (node != null) //find the most left node
        {
            stack.push(node);
            node = node.getLeftChild();
        }
     
        //traverse the tree
        while (!stack.isEmpty())//when tree is not empty....
        {
            node = stack.pop();//pop the top node on the stack(1st time is the most left node)
            System.out.println(node.getData());//pop the left node data on the sub tree
          
            if (node.getRightChild() != null)//if this left node have right child
            {
            	node = node.getRightChild();
            	
                while (node != null) {
                    stack.push(node);
                    node = node.getLeftChild();
                }
            }
        }
	}
	public void PostOrderTravers_STACK(BrNode tree)
	{

        Stack<BrNode> stack = new Stack<BrNode>();
          
        // Check for empty tree
        if (tree == null)
        {
            return;
        }
        
        stack.push(tree);//push the root into the buttom of the stack;
        BrNode preView = null;//make a preView node
        while (!stack.isEmpty()) //when stack is not empty
        {
            BrNode current = stack.peek();  
            
            /* go down the tree in search of a leaf an if so process it 
            and pop stack otherwise move down */            
            if (preView == null || preView.getLeftChild() == current || 
            		preView.getRightChild() == current) 
            {
                if (current.getLeftChild() != null)
                    stack.push(current.getLeftChild());
                else if (current.getRightChild() != null)
                    stack.push(current.getRightChild());
                else
                {
                    stack.pop();
                    System.out.println(current.getData());
                    
                }
  
                /* go up the tree from left node, if the child is right 
                   push it onto stack otherwise process parent and pop 
                   stack */
            } 
            else if (current.getLeftChild() == preView) 
            {
                if (current.getRightChild() != null)
                    stack.push(current.getRightChild());
                else
                {
                    stack.pop();
                  System.out.println(current.getData());
                }
                  
                /* go up the tree from right node and after coming back
                 from right node process parent and pop stack */
            } 
            else if (current.getRightChild() == preView) 
            {
                stack.pop();
                System.out.println(current.getData());
            }
  
            preView = current;
        }
  
      	}
	public BrNode getRoot() {
		return root;
	}
	public void setRoot(BrNode root) {
		this.root = root;
	}

}

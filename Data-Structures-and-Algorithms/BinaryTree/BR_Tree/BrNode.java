package BR_Tree;

public class BrNode {

	private BrNode leftChild;
	private BrNode rightChild;
	private Object data;
	public BrNode()
	{
		this.data=this.leftChild=this.rightChild=null;		
	}

	public BrNode(Object data)
	{
		this.data=data;
		this.leftChild=this.rightChild=null;
	}


	public BrNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BrNode leftChild) {
		this.leftChild = leftChild;
	}

	public BrNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BrNode rightChild) {
		this.rightChild = rightChild;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


	
}

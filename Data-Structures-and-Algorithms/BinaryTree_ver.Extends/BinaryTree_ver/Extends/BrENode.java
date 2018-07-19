package BinaryTree_ver.Extends;

public class BrENode {

	private BrENode leftChild;
	private BrENode rightChild;
	private Object data;
	BrENode()
	{
		this.data=this.leftChild=this.rightChild=null;		
	}

	BrENode(Object data)
	{
		this.data=data;
		this.leftChild=this.rightChild=null;
	}


	public BrENode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BrENode leftChild) {
		this.leftChild = leftChild;
	}

	public BrENode getRightChild() {
		return rightChild;
	}

	public void setRightChild(BrENode rightChild) {
		this.rightChild = rightChild;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}


	
}

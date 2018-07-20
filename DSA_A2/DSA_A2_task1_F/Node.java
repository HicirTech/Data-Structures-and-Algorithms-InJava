package DSA_A2_task1_F;
/**
 * a node of the tree contains a data value and 3 connections 
 * 				parent
 * 				   |
 * 				 value
 * 				/     \
 * 			  left   right
 * 	
 * @author Luo Zeting ID:16938158
 *
 */
public class Node {
	Object value;//value of the treeNode, it can be variable or opeartor or number, so keep it in Object type
	Node parent,left,right;//node connectors
	
	Node(Object value) {
		this.value = value;
	}

	@Override
	//post:print a tree relation ship
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
}
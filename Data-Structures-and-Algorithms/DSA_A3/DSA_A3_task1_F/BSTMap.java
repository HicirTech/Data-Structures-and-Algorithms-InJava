package DSA_A3_task1_F;
import java.util.ArrayList;

/**
 * A binary search tree use for map
 * @author Luo Zeting ID:16938158
 *
 * @param <K> Key type
 * @param <V> Value type
 */
public class BSTMap<K extends Comparable<K>,V> implements BSTMapInterface<K,V>
{
	
	private Node<K,V> root;
		
	//pre: a key for locate a node, a value to add to the node
	//post1: a new node be create contains value and key
	//post2: a node been found, add value to the node
	public void insert(K key,V value)
	{
		//if tree do not have a root, make this new node as the root of the tree
		if(this.getRoot()==null)
		{
			this.setRoot(new Node<K,V>(key,value));
		}
		else
		{
			if(this.find(key)==null)//go for find a node which contains key, if not found, make a new node, if found add
									// value to the found node
			{// condition: node not found
				if(key.compareTo(this.getRoot().getEntry().getKey())<0)//if key is smaller then root
				{
					if(this.getRoot().getLeft()==null)// if the left node is empty, just add the node to left
					{
						this.getRoot().setLeft(new Node<K,V>(key,value));
					}
					else// if left node is not empty, go use the insert method in the node class, which will look for a 
						// suitable location for new node
					{
						this.getRoot().getLeft().insert(key,value);
					}
				}
				else if (key.compareTo(this.getRoot().getEntry().getKey())>0)//if key is bigger then root
				{
					if(this.getRoot().getRight()==null)// if the right node is empty, just add the node to right
					{
						this.getRoot().setRight(new Node<K,V>(key,value));
					}
					else// if right node is not empty, go use the insert method in the node class, which will look for a 
						// suitable location for new node
					{
						this.getRoot().getRight().insert(key,value);
					}
				}
			}
				//[Marking Guide: Task-1 b] [Marking Guide: Task-1 c]
			else//condition: node found, add value to the node,keep key unique and not lose value
			{
				this.find(key).getEntry().setValue(value);
			}
		}
	}
	
	//[Marking Guide: Task-1 d]
	//pre: a key use for locate a node in tree
	//post: a arrayList contains value of the the key
	public ArrayList<V> get(K key)
	{
		if(this.getRoot()==null)//if the root is empty, do nothing
		{
			return null;
		}
		else
		{
			if(this.find(key)!=null)//use find method to makesure the node is in the tree
			{
				if(this.getRoot().getEntry().getKey().equals(key))// if this root's key is equal to this key, return value of root
				{
					return this.getRoot().getEntry().getValue();
				}
				else// or if it's key is not root
				{
					if(key.compareTo(this.getRoot().getEntry().getKey())<0)//if it is smaller go left child
					{
						return this.getRoot().getLeft().get(key);//use node's get method
					}
					else if (key.compareTo(this.getRoot().getEntry().getKey())>0)//if it is bigger go left child
					{
						return this.getRoot().getRight().get(key);//use node's get method
					}	
				}
			}
			else//if we can not found this node
			{
				return null;//return null[Task1(a).3]
			}
			
		}
		return null;//return null[Task1(a).3]
	}
	

	//[Marking Guide Task-1.e]
	//[Task1(1).4]
	//post: a integer contains the height of the tree
	public int getTreeHeiht()
	{
		return this.getHeight(this.root);
	}
	
	//[Marking Guide Task-1.e]
	//pre: a node use for look for height
	//post: a integer contains the height of the tree
	private int getHeight(Node<K,V> node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			int left = getHeight(node.getLeft());
			int right = getHeight(node.getRight());
			if(left>right)// this will only compare 1 or 0, if have child will add one, else will return 0
			{
				return left+1;
			}
			else
			{
				return right+1;
			}
		}
	}
	
	//[Marking Guide Task-1.f.1]
	//[Task1(a).5.a]
	//post: print a set of all keys in the tree
	public void printKeySet()
	{	System.out.print("Key set: ");
		this.inOrderRecursionKey(this.root);		
		System.out.println();
	}
	
	//[Marking Guide Task-1.f.2]
	//[Task1(a).5.b]
	//post: print a set of all value in the tree
	public void printValueSet()
	{
		System.out.print("Value set: ");
		this.inOrderRecursionValue(this.root);	
		System.out.println();
	}
	
	//[Marking Guide Task-1.f.3]
	//[Task1(a).5.c]
	//post: print a set of all value in the tree by use inOrder traversal
	//		because the property of the BST, inOrder is from left to right
	//		this will print out all value base on the key ascending order
	public void printEntrySet()
	{
		System.out.println("Print Entry set:");
		this.inOrderRecursionEntry(this.getRoot());
	}
	
	//pre: a root node
	//post: print all key in tree
	private void inOrderRecursionKey(Node<K,V> node)// use in-order traverse to print all keys in the tree
	{
		if(node==null)
		{
			return;
		}
		else
		{
			this.inOrderRecursionKey(node.getLeft());
			System.out.print("["+node.getEntry().getKey().toString()+"]");
			this.inOrderRecursionKey(node.getRight());
		}
	}
	
	//pre: a key use for find a node
	//post1: a node which contains the key
	//post2: not found return null
	private Node<K,V> find(K key)
	{
		if(this.root!=null)
		{
			return findNode(root,key);
		}
		else
		{
			return null;
		}
	}
	
	//pre: a root node,a key to find
	//post1: a node contains the key
	//post2: node not found return null;
	private Node<K,V> findNode(Node<K,V> search,K key)
	{
		if(search == null)// if root equal to null
		{
			return null;	
		}
		if(search.getEntry().getKey().equals(key))// if root contain the key
		{
			return search;
		}
		else
		{
			Node<K,V> returnNode = this.findNode(search.getLeft(),key);//go search left of the tree(if found, the if on top will stop recursion)
			if(returnNode==null)//if after run throught the left tree still not found the node we need
			{
				returnNode=this.findNode(search.getRight(),key);//go search the right tree
			}
			return returnNode;//if found, this will return the node, else this will return null
		}
	}
	
	//pre: a root node
	//post: print all Value in tree
	private void inOrderRecursionValue(Node<K,V> node)
	{
		if(node==null)
		{
			return;
		}
		else
		{
			this.inOrderRecursionValue(node.getLeft());
			System.out.print(node.getEntry().getValue().toString());
			this.inOrderRecursionValue(node.getRight());
		}
	}
	
	//pre: a root node
	//post: print all keys and Values in tree
	private void inOrderRecursionEntry(Node<K,V> node)
	{
		if(node==null)
		{
			return;
		}
		else
		{
			this.inOrderRecursionEntry(node.getLeft());
			System.out.print("For Key: ["+node.getEntry().getKey().toString()+"] has Value: ");
			System.out.print(node.getEntry().getValue().toString());
			System.out.println();
			this.inOrderRecursionEntry(node.getRight());
		}
	}
	private Node<K, V> getRoot() {
		return root;
	}
	private void setRoot(Node<K, V> root) {
		this.root = root;
	}

	
}



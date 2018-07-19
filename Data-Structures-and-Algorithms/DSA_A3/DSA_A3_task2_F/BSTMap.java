package DSA_A3_task2_F;

import java.util.ArrayList;

/**
 * a treeMap use for store words and it lines it showed up
 * @author Luo Zeting ID:16938158
 *
 * @param <K> key type for store
 * @param <V> value type for store
 */
public class BSTMap<K extends Comparable<K>,V> implements BSTMapInterface<K,V>{
	private Node<K,V> root;

	//post1: a new node be create contains value and key
	//post2: a node been found, add value to the node
	public void insert(K key,V value)
	{
		if(this.getRoot()==null)
		{
			this.setRoot(new Node<K,V>(key,value));
		}
		else
		{
			if(this.find(key)==null)
			{
				if(key.compareTo(this.getRoot().getEntry().getKey())<0)
				{
					if(this.getRoot().getLeft()==null)
					{
						this.getRoot().setLeft(new Node<K,V>(key,value));
					}
					else
					{
						this.getRoot().getLeft().insert(key,value);
					}
				}
				else if (key.compareTo(this.getRoot().getEntry().getKey())>0)
				{
					if(this.getRoot().getRight()==null)
					{
						this.getRoot().setRight(new Node<K,V>(key,value));
					}
					else
					{
						this.getRoot().getRight().insert(key,value);
					}
				}
			}
			else
			{
				this.find(key).getEntry().setValue(value);
			}
		}
	}
	//pre: a key use for locate a node in tree
	//post: a arrayList contains value of the the key
	public ArrayList<V> get(K key)
	{
		if(this.getRoot()==null)
		{
			return null;
		}
		else
		{
			if(this.find(key)!=null)
			{
				if(this.getRoot().getEntry().getKey().equals(key))
				{
					return this.getRoot().getEntry().getValue();
				}
				else
				{
					if(key.compareTo(this.getRoot().getEntry().getKey())<0)
					{
						return this.getRoot().getLeft().get(key);
					}
					else if (key.compareTo(this.getRoot().getEntry().getKey())>0)
					{
						return this.getRoot().getRight().get(key);
					}	
				}
			}
			else
			{
				return null;
			}
			
		}
		return null;
	}
	
	//post: print a set of all words in the tree
	public void printWordList()
	{	System.out.print("Word used: ");
		this.inOrderRecursionKey(this.root);		
		System.out.println();
	}
	//pre: a root node
	//post: print all keys in tree
	private void inOrderRecursionKey(Node<K,V> node)
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
	
	//pre: a key use for find a node,a root node use for search
	//post1: a node which contains the key
	//post2: not found return null
	private Node<K,V> findNode(Node<K,V> search,K key)
	{
		if(search == null)
		{
			return null;	
		}
		if(search.getEntry().getKey().equals(key))
		{
			return search;
		}
		else
		{
			Node<K,V> returnNode = findNode(search.getLeft(),key);
			if(returnNode==null)
			{
				returnNode=findNode(search.getRight(),key);
			}
			return returnNode;
		}
	}
	
	//post: print a set of all words and lines it showed up in the tree
	public void printEntrySet()
	{
		this.inOrderRecursionEntry(this.getRoot());
	}
	//pre: a root node
	//post: print all Value and key in tree
	private void inOrderRecursionEntry(Node<K,V> node)
	{
		if(node==null)
		{
			return;
		}
		else
		{
			this.inOrderRecursionEntry(node.getLeft());
			//make output similar to the sample output 
			//e.g
			// word----------lines
			System.out.print(node.getEntry().getKey().toString()+"----------");
			System.out.print(node.getEntry().getValue().toString().replaceAll("]", "").replaceAll("\\[", ""));
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

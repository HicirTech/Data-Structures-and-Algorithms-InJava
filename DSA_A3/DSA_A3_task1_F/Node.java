package DSA_A3_task1_F;

import java.util.ArrayList;
/**
 * A single node for BST
 * @author Luo Zeting ID:16938158
 *
 * @param <K> key for this node
 * @param <V> value for this node
 */
public class Node<K extends Comparable<K>,V> {

	private Node<K,V> left,right;
	private Entry<K,V> entry;
	
	Node(K key, V value) {
		this.setEntry(new Entry<K,V>(key,value));
	}
	
	//pre: a key use for search, a value we want to put into the located node
	//post: found the node insert the value, or create a new node with the value and key
	protected void insert(K key, V value) {
		if(this.getEntry()==null)//if this is null, we found a new location, put key and value
		{
			this.setEntry(new Entry<K,V>(key,value));
			return;//if insert success
		}
		else
		{
			if(key.compareTo(this.getEntry().getKey())<0)// this node has smaller key then key
			{
				if(this.getLeft()==null)//if left is empty insert it to left
				{
					this.setLeft(new Node<K,V>(key,value));
				}
				else// go next left look for the place we can use (go to a smaller node)
				{
					this.getLeft().insert(key,value);
				}
			}
			else if(key.compareTo(this.getEntry().getKey())>0)
			{
				if(this.getRight()==null)//if right is empty insert it to right
				{
					this.setRight(new Node<K,V>(key,value));
				}
				else// go next right look for the place we can use (go to a bigger node)
				{
					this.getRight().insert(key,value);
				}
			}
		}	
	}
	
	//[Task1(a).3]
	//pre:the key we use to locate a node
	//post: a arrayList from the node we found
	protected ArrayList<V> get(K key) {
		if(key.equals(this.getEntry().getKey()))
		{
			return this.getEntry().getValue();
		}
		else
		{
			//small go left  big go right
			if(key.compareTo(this.getEntry().getKey())<0)
			{
				return this.getLeft().get(key);
			}
			else if(key.compareTo(this.getEntry().getKey())>0)
			{
				return this.getRight().get(key);
			}
		}
		return null;//not found
	}
	protected Node<K, V> getLeft() {
		return left;
	}
	protected void setLeft(Node<K, V> left) {
		this.left = left;
	}
	protected Node<K, V> getRight() {
		return right;
	}
	protected void setRight(Node<K, V> right) {
		this.right = right;
	}
	protected Entry<K, V> getEntry() {
		return entry;
	}
	protected void setEntry(Entry<K, V> entry) {
		this.entry = entry;
	}
	
	
}

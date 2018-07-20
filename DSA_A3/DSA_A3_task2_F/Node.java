package DSA_A3_task2_F;
import java.util.ArrayList;

public class Node<K extends Comparable<K>,V> {

	private Node<K,V> left,right;
	private Entry<K,V> entry;
	Node(K key, V value) {
		// TODO Auto-generated constructor stub
		this.setEntry(new Entry<K,V>(key,value));
	}
	protected void insert(K key, V value) {
		// TODO Auto-generated method stub	
		if(this.getEntry()==null)
		{
			this.setEntry(new Entry<K,V>(key,value));
			return;//if insert success
		}
		else
		{

			if(key.compareTo(this.getEntry().getKey())<0)
			{
				if(this.getLeft()==null)
				{
					this.setLeft(new Node<K,V>(key,value));
				}
				else
				{
					this.getLeft().insert(key,value);
				}
			}
			else if(key.compareTo(this.getEntry().getKey())>0)
			{
				if(this.getRight()==null)
				{
					this.setRight(new Node<K,V>(key,value));
				}
				else
				{
					this.getRight().insert(key,value);
				}
			}
		}	
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
	protected ArrayList<V> get(K key) {
		if(key.equals(this.getEntry().getKey()))
		{
			return this.getEntry().getValue();
		}
		else
		{
			if(key.compareTo(this.getEntry().getKey())<0)
			{
				return this.getLeft().get(key);
			}
			else if(key.compareTo(this.getEntry().getKey())>0)
			{
				return this.getRight().get(key);
			}
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

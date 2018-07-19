package DSA_A3_task2_F;
import java.util.ArrayList;
/**
 * a entry for a node to access the key and values
 * @author Luo Zeting ID:16938158
 *
 * @param <K> key type contains 
 * @param <V> values type it contains
 */
public class Entry<K extends Comparable<K>,V> {

	private K key;
	private ArrayList<V> value;
	
	
	Entry(K key, V value) {
		this.value=new ArrayList<V>();
		this.setKey(key);
		this.setValue(value);
	}
	
	//pre: the value ArrayList inside the node
	//post: all duplicate value has been remove from the list
	private void removeDuplicateValue(ArrayList<V> value) 
	{
	  for ( int i = 0 ; i < value.size() -  1 ; i ++ ) 
	  {
	  	for ( int j = value.size() -  1 ; j > i; j -- )  
	  	{
	  		if (value.get(j).equals(value.get(i)))
	  		{
	  			value.remove(j);
	  		}
	  	}
	  }
	}
	protected K getKey() {
		return key;
	}
	protected void setKey(K key) {
		this.key = key;
	}
	protected ArrayList<V> getValue() {
		return value;
	}
	protected void setValue(V value) {
		this.value.add(value);
		this.removeDuplicateValue(this.getValue());//after every add then check duplicate
	}
}

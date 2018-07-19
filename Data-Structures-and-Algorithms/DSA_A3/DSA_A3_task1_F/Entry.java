package DSA_A3_task1_F;

import java.util.ArrayList;
/**
 * A Entry object for BST, store a list of values and a key
 * @author Luo Zeting ID:16938158
 *
 * @param <K>
 * @param <V>
 */
public class Entry<K extends Comparable<K>,V> {
	//[Marking Guide: Task-1 a]
	// this will let each entry have a key and many value [Task1(a).1]
	private K key;
	private ArrayList<V> value;
	
	Entry(K key, V value) {
		this.value=new ArrayList<V>();
		this.setKey(key);
		this.setValue(value);
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
	}
}

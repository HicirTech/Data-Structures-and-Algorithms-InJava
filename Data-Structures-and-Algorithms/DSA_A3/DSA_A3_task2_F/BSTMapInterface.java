package DSA_A3_task2_F;
import java.util.ArrayList;

/**
 * a BSTmap interface
 * @author Luo Zeting ID:16938158
 *
 */
public interface BSTMapInterface<K extends Comparable <K>,V> {

	//pre: a key use for locate a node in tree
	//post: a arrayList contains value of the the key
	public ArrayList<V> get(K k);
	
	//post1: a new node be create contains value and key
	//post2: a node been found, add value to the node
	public void insert(K k, V v);
	
	//post: print a set of all words and lines it showed up in the tree
	public void printEntrySet();
	
	//post: print a set of all words in the tree
	public void printWordList();
}

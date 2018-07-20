package DSA_A3_task1_F;

import java.util.ArrayList;

/**
 * this is a interface for BSTMap
 * @author Luo Zeting ID:16938158
 *
 * @param <K> a comparable key
 * @param <V> a value
 */
public interface BSTMapInterface<K extends Comparable<K>, V> {


	//[Marking Guide: Task-1 d]
	//pre: a key use for locate a node in tree
	//post: a arrayList contains value of the the key
	public ArrayList<V> get(K k);
	
	//[Marking Guide Task-1.e]
	//pre: a node use for look for height
	//post: a integer contains the height of the tree
	public int getTreeHeiht();
	
	//pre: a key for locate a node, a value to add to the node
	//post1: a new node be create contains value and key
	//post2: a node been found, add value to the node
	public void insert(K k, V v);
	
	//[Marking Guide Task-1.f.3]
	//[Task1(a).5.c]
	//post: print a set of all value in the tree by use inOrder traversal
	//		because the property of the BST, inOrder is from left to right
	//		this will print out all value base on the key ascending order
	public void printEntrySet();
	
	//[Marking Guide Task-1.f.1]
	//[Task1(a).5.a]
	//post: print a set of all keys in the tree
	public void printKeySet();
	
	//[Marking Guide Task-1.f.2]
	//[Task1(a).5.b]
	//post: print a set of all value in the tree
	public void printValueSet();
	
}

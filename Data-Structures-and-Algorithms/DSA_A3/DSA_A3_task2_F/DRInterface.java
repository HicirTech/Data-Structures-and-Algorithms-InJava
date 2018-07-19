package DSA_A3_task2_F;
/**
 * a interface for document reader
 * @author Luo Zeting ID:16938158
 *
 */
public interface DRInterface {
	//[Task2(a)]
	//[Marking Guide: Task-2.a]
	//post1: a document loaded in to the the treeMap
	//post2: print FileNotFoundException and show File not found
	public void loadFile();
	
	//[Task2(a)]
	//[Marking Guide: Task-2.b]
	//post: print all words used in the document;
	public void pirntWordList();
	

	//print the Original text
	public void printOriginalText();

	//[Task2(b)]
	//pre: a word we looking for seach
	//post: a line of the word showed up
	public void printWhichLine(String key);
	
	//[Task2(a)]
	//[Marking Guide: Task-2.c]
	//post:print all word used in the document with line it shows up
	public void printWordSearch();

}

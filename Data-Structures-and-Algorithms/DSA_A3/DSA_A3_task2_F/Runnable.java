package DSA_A3_task2_F;
/**
 * this is a runnable class for assignment
 * @author Luo Zeting ID:16938158
 *
 */
public class Runnable {
	public static void main(String[] args)
	{
		DocumentReader reader = new DocumentReader();
		
		//test file has been success loaded
		reader.printOriginalText();
		
		//[Marking Guide: Task-2.b]
		//test all words has been store in treeMap
		System.out.println();
		reader.pirntWordList();
		
		//[Task2(b)]
		//test find which line the word showed up
		System.out.println();
		reader.printWhichLine("The");
		
		//[Marking Guide: Task-2.c]
		//test all words and lines of words showed up has been store in treeMap
		System.out.println();
		reader.printWordSearch();
	}
}

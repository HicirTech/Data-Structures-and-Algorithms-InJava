package DSA_A3_task2_F;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *A document reader, use for load a file in and store it in to a tree
 *it has 3 method, which will let user to see what words in the document,
 *also see which line this word used, and also able to print original text
 * @author Luo Zeting ID:16938158
 */
public class DocumentReader {
	private File inputFile; 
	private BSTMap<String,Integer> mapTree;
	private String next;
	private Scanner scanner;
	
	DocumentReader()
	{
		this.mapTree= new BSTMap<String,Integer>();
		this.loadFile();
	}
	
	//[Task2(a)]
	//[Marking Guide: Task-2.a]
	//post1: a document loaded in to the the treeMap
	//post2: print FileNotFoundException and show File not found
	public void loadFile()
	{
		try {
			//load file into the program
			this.inputFile=new File("sampleInput.txt");//[Marking Guide: Task-2.d]
			this.scanner= new Scanner(inputFile);
			for(int v=0;scanner.hasNextLine();v++)
			{			
				this.next=this.scanner.nextLine();
				this.next = this.next.replaceAll("[.\\'-,;\"?']","");
				for(int i=0;i!=this.next.split(" ").length;i++)
				{
					//store word in tree start with uppercase
					try
					{
					
					this.mapTree.insert((this.next.split(" ")[i].toUpperCase().charAt(0)+
							this.next.split(" ")[i].substring(1).toLowerCase()),(v+1));
					}
					catch(StringIndexOutOfBoundsException e)
					{
						//if empty line,catched!cft
					}
					
				}
			}
			this.scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}
	

	//print the Original text
	public void printOriginalText()
	{
		try {
			this.inputFile=new File("sampleInput.txt");
			this.scanner = new Scanner(inputFile);
			System.out.println("Printing Original Document");
			System.out.println("-------------------------------------------------------");
			while(scanner.hasNextLine())
			{
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}
	
	//[Task2(b)]
	//pre: a word we looking for seach
	//post: a line of the word showed up
	public void printWhichLine(String key)
	{
		String checker = key.toUpperCase().charAt(0)+key.substring(1).toLowerCase();
		if(this.mapTree.get(checker)!=null)
		{
		System.out.println("Word: ["+checker+"] showed up at line: "+this.mapTree.get(checker).toString().replaceAll("\\[", "").replaceAll("]", ""));
		}
		else
		{
		System.out.println("Word "+key+" not found");
		}
	}
	
	//[Task2(a)]
	//[Marking Guide: Task-2.b]
	//post: print all words used in the document;
	public void pirntWordList()
	{
		this.mapTree.printWordList();
	}
	
	//[Task2(a)]
	//[Marking Guide: Task-2.c]
	//post:print all word used in the document with line it shows up
	public void printWordSearch()
	{
		this.mapTree.printEntrySet();
	}
}

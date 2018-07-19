package DSA_A2_task1_F;
import java.util.Scanner;
/**
 * a main use for run the tree
 * @author Luo Zeting ID:16938158
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Please input an expression:");//ask user for an expression
		String input = new Scanner(System.in).nextLine(); // save it into a variable
		Tree ExpTree = null;	// make a tree
		boolean errorChecker =true; // it is a error check, if can stop the program when most of error happen
		try
		{
			ExpTree = new Tree();// make new tree
			Tree.TreeBuilder(input); // use TreeBuilder to input expression by in order into the tree
			errorChecker=false;// if not thing goes wrong, errorChecker will be set to false
		}catch(Exception e)//handle exceptions
		{
			System.out.println("Error happen! Program stop!");
		}
		if(!errorChecker)//no error go ahead
		{
			System.out.println("you inputed "+input);// print what user just input
			
			ExpTree.printInOrderTraverse(); // print In Order Traverse
			
			ExpTree.printPostOrderTraverse(); // print Post Order Traverse
			
			ExpTree.printPreOrderTraverse(); // print Pre Order Traverse
		
			ExpTree.getResult();// ask for variables and print result of expression
		}

	}
	}






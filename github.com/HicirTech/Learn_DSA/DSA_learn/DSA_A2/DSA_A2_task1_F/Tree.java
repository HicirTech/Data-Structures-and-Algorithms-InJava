package DSA_A2_task1_F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;

/**
 * a Tree which takes in a string which contains a in-order expression
 * @author Luo Zeting ID:16938158 
 */
public class Tree {
	/**
	 * different Operator have different level, give + - a level,give * / a another level
	 */
	 private final ArrayList<Character> level0;
	 private final ArrayList<Character> level1; 
	 private static List<List<Character>> opeatorLevel; //list of lists of character(for 2 different levels)
	 private static Node root=null;
	 private static String postFixString="";//result of post order traverse 

	Tree()
	{
		level0= new ArrayList<Character>(Arrays.asList('+','-'));//+ and - in same level
		level1= new ArrayList<Character>(Arrays.asList('*','/'));//* and / in same level
		opeatorLevel= Arrays.asList(level0,level1);//level indicator
	}
	
	public void getResult()
	{	
		if((this.postFixString.contains("+")||this.postFixString.contains("-")
				||this.postFixString.contains("*")||this.postFixString.contains("/"))
				&&this.postFixString.length()>=3)
		{ 

			System.out.println("Result is : " +Result());
		}
		else
		{
			System.out.println("Error!");
		}
	}
	//post:a result of expression return in double
	private double Result()
	{
		try
		{
			return result(postFixString);
		}
		catch(EmptyStackException e)
		{
			System.out.println("Error found in calculation!");
        	return 0;
        }
	}
	
	//pre: a post fixed String type input
	//post:a result of expression return in double
	private static Double result(String postFixString)
    {
        Stack<Double> stack=new Stack<>();//stack use for Evaluation
         
        for(int i=0;i!=postFixString.length();i++)
        {
            char ch=postFixString.charAt(i);
            
             if((ch >= '0' && ch <= '9')||((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))//check is it a number or variable?
             {
            	 if(ch >= '0' && ch <= '9')//is it a number?
            	 {
            	 stack.push(Double.valueOf(ch-'0'));//if yes just convert it back to double
            	 }
            	 else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))//is it a variable?
            	 {
            		
                		 System.out.println("Variable ["+ch+"] found. What is it?[input 0 - 9]");
                		 
                		 ch=(new Scanner(System.in).next().charAt(0));
                		 
                		 if(ch >= '0' && ch <= '9')//must input a number
                		{
                		 stack.push(Double.valueOf(ch-'0'));//convert it back to double
                		}
                		 else//if user not input a number
                		 {
                			 System.out.println("Input variable Error! return from calulation");
                			 return -0.0;
                		 }
            	 }
             }           
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                double left = stack.pop();
                double right = stack.pop();
                 
                if(ch== '+')
                {
                    stack.push(right+left);

                }
                else if(ch=='-')
                {
                    stack.push(right - left);
                }
                else if(ch=='/')
                {
                    stack.push(right/left);
                }
                else if(ch=='*')
                {
                	stack.push(right*left);
                }
                else
                {
                System.out.println("Error opeator found!Program stop!");
                return 0.0;
                }
            }
        }
       return stack.pop();    
    }
	
	//pre: a String of In Order expression input 
	//post: a Node with a complete tree stored a In Order expression 
	public static Node TreeBuilder(String Str) //take a String in to Building processing
	{
		if(Str.length()>=3)
		{
		Node temp =  buildProcess(Str, 0);//pass String to buildProcess	
		root= temp;
		return temp;
		}
		else
		{
			System.out.println("Input error found");//input size less then 3, not able to form a smallest exp
			return null;
		}
	}
	
	//post:return a list of list of chars, which used for indicate level of the operators
	private static List<List<Character>> getLevelIndicator()
	{
		return opeatorLevel;
	}	
	
	//pre:a String contains expression and 0
	//post: a Node with a complete tree stored a In Order expression 
	private static Node buildProcess(String str, int Level) {//tree building process
		
		if (str.isEmpty())//if a string is empty, return null
		{
			System.out.println("inputed String is empty, Calculate error Found!");
			return null;
		}else//if it is not empty then begin to procress string
		{
			
			if (bracketsClosedChecker(str))//if the input has any bracket is unclose
			{//if yes, it means all breaket is OK and closed ,will spear string to a smaller sub string
				//E.g (a+b)+c
				// str1 a+b str2 c
				return buildProcess(str.substring(1, str.length() - 1), 0);//use sub string to process
			}
	
			if (Level == getLevelIndicator().size()) {//check what level it is ? 
				return buildProcessVariableOrNumber(str);//process to check input is a variable or is a number
			}
	
			Node tree = null;//make a empty node as root of a tree
			char operator = 0;//empty operator
			int beginIndex = 0;//Begin with the first index
			int depth = 0;//depth is use to make different layout for different operator event included brackets 
			for (int i = 0; i <= str.length(); i++) {
				boolean merge = false;
				char oldOperator = operator;
	
				if (i == str.length()) //if at the end deep haven't come up the top(or the root level of the tree)
										// it means some thing wrong druing the processing
				{
					if (depth != 0) {
					System.out.println("Error! Node can not reach to the top level");
				}
	
					merge = true;//start merge to stop the error process
				} 
				else {// if here is not the end of the processing 
					char ch = str.charAt(i);//process the i character of the inputed String
	
					if (ch == '(') {
						depth++;// if found left bracket, make tree one more level deeper e.g
								// (a+b)+c
								//	     +
								//	    / \
								//     +   c   depth go down
							    //	  / \
								//   a   b
					} else if (ch == ')') {
						depth--;// found the end of bracket go back to normal level  
	
						if (depth < 0) {
							System.out.println("Bracket processing error found!");//if depth <0, means it can not found the right bracket
						}
					} else if (depth == 0 && getLevelIndicator().get(Level).contains(ch)) {//found which level is the opeator
						operator = ch;
						merge = true;// make the operator as a root of a subtree
					}
				}
	
				if (merge) {//condition is OK to merge nodes into a subtree
					Node node = buildProcess(str.substring(beginIndex, i), Level + 1);
	
					if (tree == null) {
						tree = node;
					} else {
						Node newTree = new Node(oldOperator);
	
						newTree.left = tree;
						tree.parent = newTree;
	
						newTree.right = node;
						node.parent = newTree;
	
						tree = newTree;
					}
	
					beginIndex = i + 1;
				}
			}

		return tree;
		}	
	}
	
	//pre: a subString from the String input
	//post: a boolean indicated bracket is closed or not
	private static boolean bracketsClosedChecker(String str) {//check bar
		if (!(str.startsWith("(") && str.endsWith(")"))) {
			return false;
		}

		int flag = 0;
		for (int i = 1; i < str.length() - 1; i++) {
			char ch = str.charAt(i);

			if (ch == '(') {
				flag++;
			} else if (ch == ')') {
				flag--;

				if (flag < 0) {
					return false;
				}
			}
		}
		return flag == 0;//if flag = 0, it is means it has same amount of ( and ) it is ok to be process
	}
	
	//pre: a subString from the input String 
	//post a TreeNode contains the value of the subString
	private static Node buildProcessVariableOrNumber(String str) {
		if (str.length() != 1) {//error handle! if it is too big to process, return null and print error massage
			System.out.println("Error catch! sub-String size is not smaller enough");
			return null;
		}else
		{
			char ch = str.charAt(0);//Converting a single letter String in to a processable char and check it is variable
									//or number
			//----------- using ASCII to check ----------
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
			{
				char variable = ch;
				return new Node(variable);//Set up data for a new node and return it back		
			
			}
			else if (ch >= '0' && ch <= '9')
			{
				int number = ch - '0';//convert ASCII to integer
				return new Node(number);//Set up data for a new node and return it back		
			}
			else
			{
				System.out.println("Error found! no variable and no number !");
				return null;
			}
		}
	}
	
	//post:print InOrder Traverse
	public void printInOrderTraverse()
	{
		System.out.println("In-Order format: ");
		inOrderRecursion(root);
		System.out.println();
	}
	
	//post: print postOrder Traverse
	public void printPostOrderTraverse()
	{
		System.out.println("Post-Order format: ");
		postOrderRecursion(root);
		System.out.println();
	}
	
	//post: print preOrder Traverse
	public void printPreOrderTraverse()
	{
		System.out.println("Pre-Order format: ");
		preOrderRecursion(root);
		System.out.println();
	}
	
	//pre:a root node
	//post:print inOrder Traverse
	private static void inOrderRecursion(Node node)//use recursion to print in order Traverse of the tree
	{
		if(node==null)
		{
			return;
		}
		else
		{
			inOrderRecursion(node.left);
			System.out.print(node.value.toString());
			inOrderRecursion(node.right);
		}
	}
	
	
	//pre:a root node
	//post:print postOrder Traverse
	private static void postOrderRecursion(Node node)//use recursion to print post order Traverse of the tree
	{
		if(node==null)
		{
			return;
		}
		else
		{
			postOrderRecursion(node.left);
			postOrderRecursion(node.right);
			postFixString=postFixString+node.value;
			System.out.print(node.value);
		}
	}
		
	//pre:a root node
	//post:print preOrder Traverse
	private static void preOrderRecursion(Node node)
	{
		if(node==null)
		{
			return;
		}
		else
		{
			System.out.print(node.value);
			preOrderRecursion(node.left);
			preOrderRecursion(node.right);
		}
	}
}

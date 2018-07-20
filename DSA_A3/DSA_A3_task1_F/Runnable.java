package DSA_A3_task1_F;

import java.util.Scanner;

/**
 * a test class use for demo
 * @author Luo Zeting ID:16938158
 *
 */

public class Runnable {

	static BSTMap<String, String> map = new BSTMap<String,String>();//In this run,I set it has string key and string value
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		function();		
	}
	
	//[Task1(a).1]
	//create a function make user able to do input	
	static void function()
	{
		while(true)
		{
			System.out.println("Choose your action");
			System.out.println("1.Input value by use Key");
			System.out.println("2.Get a value by use key");
			System.out.println("3.Print value set");
			System.out.println("4.Print key set");
			System.out.println("5.Print entry set in ascending order");
			System.out.println("6.print tree height");
			System.out.println("7.Exit");
			switch(scanner.nextInt())
			{
				case 1:
				{
					getInput();
					break;
				}
				case 2:
				{
					getValue();
					break;
				}
				case 3:
				{
					printValues();
					break;
				}
				case 4:
				{
					printKeys();
					break;
				}
				case 5:
				{
					printEntrys();
					break;
				}
				case 6:
				{
					printTreeHeight();
					break;
				}
				case 7:
				{
					System.exit(0);
				}
			}
		}
	}
	static void getInput()
	{
		System.out.println("Please input key and value in format: key,value");
		scanner.nextLine();
		String next=scanner.nextLine();
		if(next.length()>2)
		{
		map.insert(next.split(",")[0], next.split(",")[1]);
		System.out.println("Inserted!");
		}
		else
		{
			System.out.println("Input Error!");
		}
	}
	static void getValue()
	{
		System.out.println("Please input key");
		scanner.nextLine();
		String next=scanner.nextLine();
		System.out.println("Value of "+next+" "+map.get(next));
	}
	static void printKeys()
	{
		map.printKeySet();
	}
	static void printValues()
	{
		map.printValueSet();
	}
	static void printEntrys()
	{
		map.printEntrySet();
	}
	static void printTreeHeight()
	{	
		System.out.println("Tree height: "+	map.getTreeHeiht());
	}
	

}

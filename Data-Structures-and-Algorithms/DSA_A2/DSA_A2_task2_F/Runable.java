package DSA_A2_task2_F;
import java.util.InputMismatchException;
import java.util.Scanner;;
/**
 * A cafe with N terminals
 * @author Luo Zeting ID:16938158
 *
 */
public class Runable {

	public static void main(String[] args)
	{
		try
		{
		System.out.println("How many terminals in your cafe?");
		Cafe aa = new Cafe (new Scanner(System.in).nextInt());
		System.out.println("Cafe created!");
		aa.showAllTerminals();
		System.out.println("Please enter [P] to pass time, any other key to leave");
		while(new Scanner(System.in).next().toLowerCase().charAt(0)=='p')
		{
			aa.timePass();
		}
		System.out.println("At this time: ");
		aa.showCafe();	
		}
		catch(InputMismatchException e)
		{
			System.out.println("it is not a number, error found, program stop!");
		}
	}
}

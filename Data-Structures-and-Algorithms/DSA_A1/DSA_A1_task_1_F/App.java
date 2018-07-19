package DSA_A1_task_1_F;
/**
 * In this class, I will simulate a user perform all five function in the task-1
 * @author Luo Zeting ID:16938158
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class App {
	public static void main(String args[])
	{
		CarParkList<Cars> myPark = new CarParkList<Cars>();//used default car park constructor, max Size is 25
		System.out.println("Welcome to car park system");
		
		do
		{
			System.out.println("1. parking your car\n"
					+ "2. Show available car parks\n"
					+ "3. Show occupied car parks\n"
					+ "4. Show car parked at a location\n"
					+ "5. Show your car parking time\n"
					+ "6. Leaving car park\n"
					+ "7. Stop Program");
		int select = new Scanner(System.in).nextInt();
		if(select==1)
		{
			myPark.showAvailablePark();
			System.out.println("Which car park you want to park");
			myPark.add((new Scanner(System.in).nextInt()), (new Cars()));//simulate a which parked in park of the car park	
		}
		else if(select == 2)
		{
			myPark.showAvailablePark();
		}
		else if(select == 3)
		{
			myPark.showOccupied();
		}
		else if(select == 4)
		{
			System.out.println("Which location you want check?");
			myPark.showCarInPark(new Scanner(System.in).nextInt());
		}
		else if(select == 5)
		{
			System.out.println("What is your car number?");
			try{
			myPark.showParkingTime(new Scanner(System.in).nextInt());;
			}catch(InputMismatchException e)
			{
				System.out.println("Please input correct car number, try again");
			}
		}
		else if (select == 6)
		{
			System.out.println("Which location show you are parking?");
			myPark.leavePark(new Scanner(System.in).nextInt());
		}
		else if (select == 7)
		{
			System.out.println("Good bye");
			break;
		}
		}while(true);
	
		
	}
}

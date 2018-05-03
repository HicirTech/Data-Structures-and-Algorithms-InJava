import java.time.LocalTime;

/**
 * For Criteria Task-1 a.Implementations
 * 
 * @author Luo Zeting ID 16938158
 * @param <E>
 */
public class CarParkList<E> extends AbstractCarParkList<E> implements CarParkMethods<E> {

	CarParkList() {
		this(25);// call another constructor for set up the default size of car
					// park
	}

	// if user set size can use this constructor
	CarParkList(int parkSize) {
		try {
			this.cars = new Cars[parkSize];
		} catch (IllegalArgumentException e) {
			System.out.println("Index Input error:" + parkSize);// if user input
																// wrong
		}
		this.parkSize = parkSize;// park size is the max car can get in to car
									// park
		super.carCounter = 0;// at begin, no car
	}

	public void showAvailablePark() {
		// Function 1: Available car parks
		System.out.println("Function 1: show all available car parks");
		System.out.println(this.availablePark());// a car parked in index 2, so
													// should be able to see 2
													// is not in the list
	}

	public void showOccupied() {
		// Function 2: Occupied car parks
		System.out.println("\nFunction 2: show all Occupied car parks");
		System.out.println(this.OccupiedPark());// a car parked in index 2, so
												// should be able to see only 2
												// in the list
	}

	public void showCarInPark(int CarPosition) {
		// Function 3: Car parked at a specific car-park location
		System.out.println("\nFunction 3: show a car which parked in a specific car-park location");
		System.out.println(this.get(CarPosition));// Show the status of car
													// which is parked in index
													// 2
	}

	public void showParkingTime(int CarNo) {
		// Function 4: Show a parking time of a car
		System.out.println("\nFunction 4: The parking time for any parked car");
		try {
			System.out.println("\nThe Car parking time is :" + this.parkingtime(CarNo) + " Seconds\n");
			// car number is random generated, so use getNumber to get
			// the car number, so we can check the parking time of a
			// car (Show up in second)
		} catch (IndexOutOfBoundsException e) {
			System.out.println("You inputed wrong car number, try again");
		}
	}

	public void leavePark(int CarPosition) {
		// Function 5: The total parking time of a car when its leaving the car park
		try {
			System.out.println("Function 5: The total parking time of a car when its leaving the car park\n"
					+ this.cars[CarPosition] + " is leaving. \nThe total parking time is :" + this.remove(CarPosition)
					+ " Seconds\n");
			// The car is leaving the car parking ,the total parking time will be
			// show as second
		} catch (NullPointerException e) {
			System.out.println("You inputed wrong location, try again");
		}

	}
}

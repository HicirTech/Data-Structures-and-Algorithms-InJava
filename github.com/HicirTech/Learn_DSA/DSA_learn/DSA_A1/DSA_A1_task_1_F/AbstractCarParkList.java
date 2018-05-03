package DSA_A1_task_1_F;
import java.time.LocalTime;

/**
 * For Criteria Task-1 a.Abstract base class
 * 
 * @author Luo Zeting ID:16938158
 * @param <E>
 */
public abstract class AbstractCarParkList<E> implements CarParkMethods<E> {
	protected int carCounter;
	protected Cars[] cars;
	protected int parkSize;

	public boolean isEmpty() {
		if (carCounter == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int haveCars() {
		return this.carCounter;
	}

	// Other Method used in the Task
	// __________________________
	/**
	 * this will check user input index is too big or too small
	 * 
	 * @param index
	 */
	public void sizeChecker(int index) {
		if (index > this.parkSize || index < 0) {
			throw new IndexOutOfBoundsException("Input size is over the size of car park");
		}
	}

	// Other Method used in the Task
	// __________________________
	/**
	 * Add a car to a park, but can not override if there already parked a car
	 */
	public void add(int index, Cars car) {
		try {
			this.sizeChecker(index);
			if (this.cars[index] == null) {
				this.cars[index] = car;
				this.cars[index].setCheckInTime();
				this.carCounter++;
				System.out.println(car);
			} else {
				System.out.print("This park has" + this.cars[index] + "! You can not add car to here");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("you mother fucker");
		}
	}

	// For Task1: Requirement b.i
	/**
	 * This method will check all the empty car park, and store those number to
	 * a String
	 * 
	 * @return a String contain all available car park number
	 */
	public String availablePark() {
		String useable = "Available car park:";
		for (int index = 0; index != this.parkSize; index++) {
			if (this.cars[index] == null) {
				useable = useable + " " + index;
			}
		}
		return useable;
	}

	// For Task1: Requirement b.ii
	/**
	 * This method will check all the Occupied car park, and store those number
	 * to a String
	 * 
	 * @return a String contains all Occupied car park
	 */
	public String OccupiedPark() {
		String unuseable = "Occupied car park:";
		for (int index = 0; index != this.parkSize; index++) {
			if (this.cars[index] != null) {
				unuseable = unuseable + " " + index;
			}
		}
		return unuseable;
	}

	// For Task1: Requirement b.iii
	/**
	 * This will return a car which is in the index user inputed
	 * 
	 * @return a object that user require to check
	 */
	@Override
	public Cars get(int index) {
		this.sizeChecker(index);
		return cars[index];
	}

	// For Task1: Requirement b.iv
	/**
	 * This method will Check the parking time of a CarNo (Then look back to a
	 * car object)
	 * 
	 * @return a double which is the car parking time from check in to the time
	 *         this method ran
	 */
	public double parkingtime(int CarNo) {
		double due = -1;
		try {
			due = Integer.valueOf(LocalTime.now().toString().split(":")[0]) * 3600
					- Integer.valueOf(this.cars[indexOf(CarNo)].getCheckInTime().split(":")[0]) * 3600
					+ Integer.valueOf(LocalTime.now().toString().split(":")[1]) * 60
					- Integer.valueOf(this.cars[indexOf(CarNo)].getCheckInTime().split(":")[1]) * 60
					+ Double.valueOf(LocalTime.now().toString().split(":")[2])
					- Double.valueOf(this.cars[indexOf(CarNo)].getCheckInTime().split(":")[2]);
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException("Car not found!");
		}
		return due;
	}

	// For Task1: Requirement b.v
	/**
	 * This method remove a car (or make the car leave) from a car park, when it
	 * remove the car it will also show the car parking time in the car park,
	 * return as a double
	 * 
	 * @return the parking of a car
	 */
	public double remove(int index) {
		this.sizeChecker(index);
		double re = parkingtime(((Cars) this.get(index)).getNumber());
		this.cars[index] = null;
		this.carCounter--;
		return re;
	}

	/**
	 * this method will check the index of the car number
	 * 
	 * @param the
	 *            car number of that car
	 */
	public int indexOf(int CarNo) {
		int re = -1;
		for (int index = 0; index != this.cars.length; index++) {

			try {
				if (this.cars[index].getNumber() == CarNo) {
					re = index;
				}
			} catch (NullPointerException e) {
			}
		}
		return re;
	}

}

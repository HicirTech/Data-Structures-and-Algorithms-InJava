package DSA_A1_task_1_F;
/**
 *For Criteria Task-1 a.interface 
 * @author Luo Zeting ID 16938158
 * @param <E>
 */
public interface CarParkMethods<E>{
	//For Task1: Requirement b.i
	public String availablePark();
	// post: return a String which contain all index of cars[] which is null
	
	//For Task1: Requirement b.ii
	public String OccupiedPark();
    // post: return a String which contain all index of cars[] which not null
	
	//For Task1: Requirement b.iii
    public Cars get(int i);
    // pre: 0 <= i < size()
    // post: returns the ith park of car park
    
    //For Task1: Requirement b.iv
    public double parkingtime(int CarNo);
    // pre: CarNo is a no of the car
    // post: the parking time in second
   
    //For Task1: Requirement b.v
    public double remove(int CarNo);
    // pre: 0 <= i < size()
    // post: removes the car from ith park and return the duration of parking
    
//Other Method used in the Task    
//__________________________
     
    public void add(int i, Cars car);
    // pre: 0 <= i <= size() && cars[i]==null
    // post: adds car at ith park of the car park(if that park is empty)
    
    public int indexOf(int CarNo);
    // post: a index of a CarNo of a car object in the car part(if found), if not found then return -1;
   
    
   
}

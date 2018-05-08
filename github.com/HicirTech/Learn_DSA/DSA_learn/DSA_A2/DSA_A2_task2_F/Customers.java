package DSA_A2_task2_F;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// input data for support 

public class Customers {

	private final int ID;// not changeable ID
	private final String ENQUEUE_TIME; // not changeable enqueue time
	
	Customers()
	{
		this.ID=(int)(Math.random()*10000);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.ENQUEUE_TIME=dateFormat.format(date);
	}
	
	//post:return customer id
	public int getID() {
		return ID;
	}
	
	//post: enqueue time
	public String getENQUEUE_TIME() {
		return ENQUEUE_TIME;
	}
	
	public String toString()
	{
		return "Customer ID: "+this.ID+ " Enter the queue at: "+this.ENQUEUE_TIME;
	}
}

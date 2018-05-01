import java.time.LocalTime;

/**
 * a Car object to simulate a car
 * 
 * @author Luo Zeting ID 16938158
 */
public class Cars {
	private String checkInTime;
	private int Number;

	Cars() {
		this.Number = Integer.valueOf(String.format("%d", ((int) (Math.random() * 1000))));
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime() {
		this.checkInTime = LocalTime.now().toString();
	}

	public int getNumber() {
		return Number;
	}

	public String toString() {
		return " Car No: " + this.Number + ", Checked in time: " + this.checkInTime;
	}
}

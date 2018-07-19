package DSA_A1_task2_F;
/**
 * This is a student class fot Task requirement a Based on this class, a student
 * will have a First name, Last name, Uni-year,ID ,and program
 * 
 * @author Luo Zeting ID:16938158
 */
// Task2 Criteria a
public class Student {
	private int studentID;
	private int year;
	private String firstName;
	private String lastName;
	private String program;

	Student(int id, int year, String firstName, String lastName, String program) {
		this.setStudentID(id);
		this.setYear(year);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setProgram(program);
	}

	Student(String firstName, String lastName) {
		this.setStudentID(((int) ((Math.random() * (90 - 65) + 65))));
		this.setYear((int) ((Math.random() * (3 - 1)) + 1));
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setProgram(String.format("%c", (char) ((Math.random() * (90 - 65) + 65))));
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String toString() {

		return "First Name: " + this.getFirstName() + " Last Name: " + this.getLastName() + " Program: "
				+ this.getProgram() + " ID:" + this.getStudentID() + " Year " + this.getYear() + "\n";
	}
}

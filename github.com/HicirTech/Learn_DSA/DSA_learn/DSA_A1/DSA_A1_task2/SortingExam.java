/**
 * This is a implementation class for sorting exam paper
 * 
 * @author Luo Zeting ID:16938158
 *
 * @param <E>
 */
public class SortingExam<E> extends AbstractSortingExam<E> implements SortingExamPaperInterface<E> {
	SortingExam() {
		super();
		super.size = 0;
	}

	/**
	 * collect paper from student and recore his first name and last name
	 * 
	 * @param firstName
	 *            of student
	 * @param LastName
	 *            of student
	 */
	public void collectPaper(String firstName, String LastName) {
		this.add(this.size, new Student(firstName, LastName));
	}

	/**
	 * collect and sort paper from student and recore his first name and last
	 * name when every x0th paper collected all paper will be sort and print out
	 * 
	 * @param firstName
	 *            of student
	 * @param LastName
	 *            of student
	 */
	public void collectAndSortPaper(String firstName, String LastName) {
		this.addSort(size, new Student(firstName, LastName));
	}

	/**
	 * a method used for print all the paper collected(not matter sorted or not)
	 */
	public void print() {
		System.out.println(this.toString());
	}
}

package DSA_A1_task2_F;
/**
 * this is an Abstract class for Task2
 * 
 * @author Luo Zeting ID:16938158
 *
 * @param <E>
 */
public abstract class AbstractSortingExam<E> implements SortingExamPaperInterface<E> {
	protected Student[] students = new Student[50];
	protected int size;

	/**
	 * this method will allow add student object into a index of student[]
	 * 
	 * @param index
	 *            of of student object going into
	 */
	public void add(int index, Student student) {
		if (this.students[index] == null) {
			this.students[index] = student;
			this.size++;
		} else {
			System.out.println("Index error! Please enter again");
		}
	}

	// Task2 requirement b
	// Task2 criteria b
	/**
	 * this is a insertion sort to sort students by last name
	 */
	public void insertionSort() {
		int in, out;
		for (out = 1; out < this.size; out++) {
			Student temp;
			if (this.students[out] != null) {
				temp = this.students[out];
				in = out;
				while (in > 0 && this.students[in - 1] != null
						&& this.students[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
					this.students[in] = this.students[in - 1];
					--in;
				}
				this.students[in] = temp;
			}
		}
	}

	// Task2 requirement c
	/**
	 * Keep add paper and every x0th paper added will print out all the paper in
	 * last name order
	 */
	public void addSort(int index, Student student) {
		this.add(index, student);
		this.insertionSort();
		if ((this.size % 10) == 0) {
			System.out.println("Now have " + this.size + " papers\n" + this);
		}
	}

	/**
	 * toString method will used to output all papers
	 */
	public String toString() {
		String toString = "";

		for (int i = 0; i != this.students.length; i++) {
			if (this.students[i] != null)
				toString = toString + this.students[i];
		}

		return toString;
	}
}

package DSA_A1_task2_F;
/**
 * this is the interface for sorting paper
 * 
 * @author Luo Zeting ID:16938158
 *
 * @param <E>
 */
public interface SortingExamPaperInterface<E> {
	public void add(int index, Student studnet);// method for adding paper

	public void insertionSort();// method for sorting paper

	public void addSort(int index, Student studnet);// method for add and sort
													// paper
}

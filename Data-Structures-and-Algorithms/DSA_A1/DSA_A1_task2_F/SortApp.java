package DSA_A1_task2_F;
import java.util.Scanner;

/**
 * In this class I will simulate invigilating a exam has 50 student
 * 
 * @author Luo Zeting ID:16938158
 *
 */
public class SortApp {
	public static void main(String args[]) {
		System.out.println("Which case you want to test?" + "\n1.Case 1" + "\n2.Case 2");
		switch ((new Scanner(System.in).nextInt())) {
		case (1): {
			case1();
			break;
		}
		case (2): {
			case2();
			break;
		}
		}
	}

	static void case1() {
		SortingExam<Student> sort = new SortingExam<Student>();
		sort.collectPaper("Shah", "Jahan");
		sort.collectPaper("King", "Porus");
		sort.collectPaper("Sun", "Tzu");
		sort.collectPaper("Marius", "Rome");
		sort.collectPaper("Xerxes", "Persia");
		sort.collectPaper("Bappa", "Rawal");
		sort.collectPaper("Tipu", "Sultan");
		sort.collectPaper("Rajendra", "Chola");
		sort.collectPaper("Alfred", "Great");
		sort.collectPaper("James", "England");
		sort.collectPaper("Mao", "Zedong");
		sort.collectPaper("Mother", "Teresa");
		sort.collectPaper("Fidel", "Castro");
		sort.collectPaper("Swami", "Vivekananda");
		sort.collectPaper("Otto", "Von");
		sort.collectPaper("Charlemagne", "Charlemagne");
		sort.collectPaper("Elizabeth", "England");
		sort.collectPaper("Joan", "Arc");
		sort.collectPaper("Mustafa", "Kemal");
		sort.collectPaper("Joseph", "Stalin");
		sort.collectPaper("William", "Wallace");
		sort.collectPaper("Che", "Guevara");
		sort.collectPaper("Napoleon", "Bonaparte");
		sort.collectPaper("Adolf", "Hitler");
		sort.collectPaper("Augustus", "Caesar");
		sort.collectPaper("BR", "Ambedkar");
		sort.collectPaper("John", "Kennedy");
		sort.collectPaper("Thomas", "Churchill");
		sort.collectPaper("Winston", "Churchill");
		sort.collectPaper("Henry", "England");
		sort.collectPaper("Cnut", "Great");
		sort.collectPaper("Ramesses", "II");
		sort.collectPaper("Darius", "Darius");
		sort.collectPaper("Solomon", "Solomon");
		sort.collectPaper("Maharana", "Pratap");
		sort.collectPaper("Elizabeth", "II");
		sort.collectPaper("Richard", "England");
		sort.collectPaper("Theodore", "Roosevelt");
		sort.collectPaper("Richard", "England");
		sort.collectPaper("George", "III");
		sort.collectPaper("Sejong", "Great");
		sort.collectPaper("George", "VI");
		sort.collectPaper("Henry", "VII");
		sort.collectPaper("Charles", "II");
		sort.collectPaper("Edward", "III");
		sort.collectPaper("Gustavus", "Adolphus");
		sort.collectPaper("Muhammad", "Ghor");
		sort.collectPaper("Herod", "Great");
		sort.collectPaper("Constantine", "Great");
		sort.collectPaper("Julius", "Caesar");
		sort.insertionSort();
		sort.print();
	}

	static void case2() {
		// case 2
		SortingExam<Student> sort2 = new SortingExam<Student>();
		sort2.collectAndSortPaper("Shah", "Jahan");
		sort2.collectAndSortPaper("King", "Porus");
		sort2.collectAndSortPaper("Sun", "Tzu");
		sort2.collectAndSortPaper("Marius", "Rome");
		sort2.collectAndSortPaper("Xerxes", "Persia");
		sort2.collectAndSortPaper("Bappa", "Rawal");
		sort2.collectAndSortPaper("Tipu", "Sultan");
		sort2.collectAndSortPaper("Rajendra", "Chola");
		sort2.collectAndSortPaper("Alfred", "Great");
		sort2.collectAndSortPaper("James", "England");
		sort2.collectAndSortPaper("Mao", "Zedong");
		sort2.collectAndSortPaper("Mother", "Teresa");
		sort2.collectAndSortPaper("Fidel", "Castro");
		sort2.collectAndSortPaper("Swami", "Vivekananda");
		sort2.collectAndSortPaper("Otto", "Von");
		sort2.collectAndSortPaper("Charlemagne", "Charlemagne");
		sort2.collectAndSortPaper("Elizabeth", "England");
		sort2.collectAndSortPaper("Joan", "Arc");
		sort2.collectAndSortPaper("Mustafa", "Kemal");
		sort2.collectAndSortPaper("Joseph", "Stalin");
		sort2.collectAndSortPaper("William", "Wallace");
		sort2.collectAndSortPaper("Che", "Guevara");
		sort2.collectAndSortPaper("Napoleon", "Bonaparte");
		sort2.collectAndSortPaper("Adolf", "Hitler");
		sort2.collectAndSortPaper("Augustus", "Caesar");
		sort2.collectAndSortPaper("BR", "Ambedkar");
		sort2.collectAndSortPaper("John", "Kennedy");
		sort2.collectAndSortPaper("Thomas", "Churchill");
		sort2.collectAndSortPaper("Winston", "Churchill");
		sort2.collectAndSortPaper("Henry", "England");
		sort2.collectAndSortPaper("Cnut", "Great");
		sort2.collectAndSortPaper("Ramesses", "II");
		sort2.collectAndSortPaper("Darius", "Darius");
		sort2.collectAndSortPaper("Solomon", "Solomon");
		sort2.collectAndSortPaper("Maharana", "Pratap");
		sort2.collectAndSortPaper("Elizabeth", "II");
		sort2.collectAndSortPaper("Richard", "England");
		sort2.collectAndSortPaper("Theodore", "Roosevelt");
		sort2.collectAndSortPaper("Richard", "England");
		sort2.collectAndSortPaper("George", "III");
		sort2.collectAndSortPaper("Sejong", "Great");
		sort2.collectAndSortPaper("George", "VI");
		sort2.collectAndSortPaper("Henry", "VII");
		sort2.collectAndSortPaper("Charles", "II");
		sort2.collectAndSortPaper("Edward", "III");
		sort2.collectAndSortPaper("Gustavus", "Adolphus");
		sort2.collectAndSortPaper("Muhammad", "Ghor");
		sort2.collectAndSortPaper("Herod", "Great");
		sort2.collectAndSortPaper("Constantine", "Great");
		sort2.collectAndSortPaper("Julius", "Caesar");
	}

}

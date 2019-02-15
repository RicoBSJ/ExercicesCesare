
import java.util.*;

public class StringSortByArray {

	public static void main(String[] args) {

		String[] arrays = new String[] { "z", "c", "b", "a", "r" };
		System.out.println("List Before: ");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + ",");
		} 
		System.out.println("\rList After: ");
		Arrays.sort(arrays);

		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + ",");
		}
	}
}

import java.util.*;

public class StringSortByArray2 {

	public static void main(String[] args) {

		String[] arrays = new String[] { "z", "c", "b", "a", "r" };
		System.out.println("List Before: \r");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + ",");
		}
		System.out.println("\nList After: ");
		Arrays.sort(arrays);

		for (int i = 0; i < arrays.length; i++) {
			System.out.print(arrays[i] + ",");
		}
	}
}

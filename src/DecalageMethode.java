import java.lang.reflect.Array;
import java.util.Arrays;

public class DecalageMethode {

	private static String[] tabColor = { "vert", "orange", "jaune", "gris" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decaler(tabColor, 5);
		decaler(tabColor, 5);
		decaler(tabColor, 5);
	}

	public static void decaler(String tab[], int k) {
		
		int n = tab.length;
		for (int j = 0; j < k; j++) {
			for (int i = n - 1; i > 0; i--) {
				String x = tab[i];
				tab[i] = tab[i - 1];
				tab[i - 1] = x;
			}
		}
		System.out.println(Arrays.toString(tab));
	}
}

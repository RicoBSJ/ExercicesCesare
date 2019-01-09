import java.util.Arrays;
import java.util.Scanner;

public class OrdreAlpha1 {

	public static void main(String[] args) {
		// Résultat attendu : une chaîne de caractère qui est classée par ordre
		// alphabétique a b c r z

		String[] tab = { "z", "c", "b", "a", "r" };
		affiche_tableau(tab);

		int[] resultat = { 0, 0, 0, 0 };
		System.out.println("Veuillez taper 4 chiffres :");
		Scanner sc = new Scanner(System.in);
		String result = sc.nextLine();
		for (int i = 0; i < resultat.length; i++) {
			String carac = Character.toString(result.charAt(i));
			resultat[i] = Integer.parseInt(carac);
		}

		// for (int i = 0; i < tab.length; i++) {
		//
		// tab[i] = tab[4];
		//
		// System.out.println(i);
		//
		// }
	}

	private static void affiche_tableau(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
	}
}

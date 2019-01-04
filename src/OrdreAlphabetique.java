import java.util.*;

public class OrdreAlphabetique {

	// Résultat attendu : une chaîne de caractère qui est classée par ordre
	// alphabétique a b c r z

	public static void main(String[] args) {
		String[] tab = { "z", "c", "b", "a", "r" };
		affiche_tableau(tab);
		String[] tab2 = new String[4];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = tab2[i];
		}
	}

	private static void affiche_tableau(String[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i]);
		}
		System.out.println();
	}
}
import java.util.*;

public class OrdreAlphabetique {

	// Constructeur par défaut

	public OrdreAlphabetique(String[] tab) {

	}
	// Résultat attendu : une chaîne de caractère qui est classée par ordre
	// alphabétique a b c r z

	private void ordreAlphabetique() {

	}

	public static void main(String[] args) {

		String[] tab = { "z", "c", "b", "a", "r" };
		for (String element : tab) {
			Arrays.sort(element);
			System.out.println(element);
		}
	}

}
import java.util.*;

public class OrdreAlphabetique {

	/* Constructeur par défaut
	 * 
	 */
	public OrdreAlphabetique() {
		
		return;
	}
	
	/* Résultat attendu : une chaîne de caractère qui est classée par ordre alphabétique a b c r z
	 * 
	 */
//	public String ordreAlphabetique () {
//		String[] tab = {"z", "c", "b", "a", "r"};
//
//	}
	
	public static void main(String[] args) {
		
		ArrayList tab = new ArrayList();
		tab.add('z');
		tab.add('c');
		tab.add('b');
		tab.add('a');
		tab.add('r');
		System.out.println("Dans le désordre : "  +tab);
		Collections.sort(tab);
		System.out.println("Dans l'ordre : "  +tab);
		
	}

}

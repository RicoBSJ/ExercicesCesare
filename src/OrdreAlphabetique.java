import java.util.*;

public class OrdreAlphabetique {


	private String[] tab;

	// Constructeur par défaut

	public OrdreAlphabetique(String[] tab) {

	this.tab = tab;
		
	}
	// Résultat attendu : une chaîne de caractère qui est classée par ordre alphabétique a b c r z
	
	private void ordreAlphabetique() {
		
		String[] tab = {"z", "c", "b", "a", "r"};
		Arrays.sort(tab);
		
	}

	public static void main(String[] args) {
		
		List<String> tab = new ArrayList<String>();
		tab.add("z");
		tab.add("c");
		tab.add("b");
		tab.add("a");
		tab.add("r");
		System.out.println("Dans le désordre : "  +tab);
		Collections.sort(tab);
		System.out.println("Dans l'ordre : "  +tab);
	}

}
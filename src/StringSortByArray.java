import java.util.*;

public class StringSortByArray {


	public StringSortByArray(String[] tab) {

	}
	// R�sultat attendu : une cha�ne de caract�re qui est class�e par ordre
	// alphab�tique a b c r z

	public static void main(String[] args) {

		List<String> tab = new ArrayList<String>();
		tab.add("z");
		tab.add("c");
		tab.add("b");
		tab.add("a");
		tab.add("r");
		System.out.println("Classement d'origine : " + tab);
		Collections.sort(tab);
		System.out.println("Classement dans l'ordre : " + tab);
	}
}
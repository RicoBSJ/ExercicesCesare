import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		int nLignes; // nombre total de lignes
		int numLigne; // compteur de ligne
		int nEspaces; // nombre d'espaces precedent une etoile
		final char cRempli = '*'; // caractere de remplissage (ici etoile)
		int j;

		System.out.print("combien de lignes ? ");
//		Scanner sc = new Scanner (System.in);
//		nLignes = sc.nextInt();
		nLignes = Clavier.lireInt();
		for (numLigne = 0; numLigne < nLignes; numLigne++) {
			nEspaces = nLignes - numLigne - 1;
			for (j = 0; j < nEspaces; j++) {
				System.out.print(' ');
			}
			for (j = 0; j < numLigne + 1; j++) {
				System.out.print(cRempli);
			}
			System.out.println();
		}
	}
}

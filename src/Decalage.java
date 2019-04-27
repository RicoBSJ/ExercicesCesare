public class Decalage{
 
	String enclair;
	int decalage;
 
	public Decalage(String enclair, int decalage) {
		this.enclair = enclair;
		this.decalage = decalage;
	}
 
	public String decrypte() {
		return enclair;
	}
 
	public static char decalecaractere(char c, int decalage) {
		return (c < 'a' || c > 'z') ? c : (char) (((c - 'a' + decalage) % 26) + 'a');
	}
 
	public String crypte() {
		char c = 0;
		String mot = "";
		char d;
		// ajout du i++ afin de parcourir tous les caractere de ton String
		for (int i = 0; i < enclair.length(); i++) {
			c = enclair.charAt(i);
			d = (decalecaractere(c, this.decalage));
			mot += Character.toString(d);
			// suppression du return, sinon au premier caractere tu sors de la boucle
		}
		return mot;
 
	}
 
	public static void main(String[] args) {
		String s = "salut";
		int decalage = 3;
		Decalage chaine = new Decalage(s, decalage);
 
		System.out.println("Chaine en clair : " + chaine.decrypte());
		System.out.println("Chaine cryptee : " + chaine.crypte());
	}
}
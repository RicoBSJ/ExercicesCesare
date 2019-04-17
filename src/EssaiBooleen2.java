
public class EssaiBooleen2 {

	public static void main(String[] args) {

		String[] tabEssai = { "vert", "orange", "jaune", "gris", "noir", "rouge", "bleu" };
		String[] tabResultat = { "vert", "orange", "jaune", "gris", "noir", "rouge", "bleu" };
		boolean reponse = false;
		String str = String.valueOf(reponse);
		String[] strArray = str.split(" ");
		for (int i = 0; i < tabEssai.length; i++) {
			if (strArray[i] == "false") {
				tabResultat[i] = tabEssai[i];
				if (strArray[i] == "true") {
					tabResultat[i] = tabEssai[i];
				}
			}
		}
		System.out.println(tabResultat);
	}
}

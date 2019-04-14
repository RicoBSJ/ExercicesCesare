
public class EssaiBooleen2 {

	public static void main(String[] args) {

//		boolean reponse = false;
//		String str = String.valueOf(reponse);
//		String strArray[] = str.split(" ");
//		System.out.println("String converted to String array");
//		for (int i = 0; i < strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}

//		char[] array = str.toCharArray();
//		char[] charArray = str.toCharArray();
//		Character[] charObjectArray = ArrayUtils.toObject(charArray);
//		String[] tabResultat = new String[Constante.tabColor.length];
//		for (char output : array) {
//			System.out.println(output);
//		}

		String[] tabEssai = { "vert", "orange", "jaune", "gris", "noir", "rouge", "bleu" };
		String[] tabResultat = { "vert", "orange", "jaune", "gris", "noir", "rouge", "bleu" };
		boolean reponse = false;
		String str = String.valueOf(reponse);
		String strArray[] = str.split(" ");
		for (int i = 0; i < tabEssai.length; i++) {
			if (strArray[i] == "true") {
				tabResultat[i] = tabEssai[i];
				if (strArray[i] == "false") {
					tabResultat[i] = tabEssai[i + 1];
				}
				System.out.println(strArray[i]);
			}
		}
	}
}


public class Demo {

	public static void main(String[] args) {

		String strValue = "123";
		int value = Integer.parseInt(strValue);
		strValue = "3.141592654";
		double value2 = Double.parseDouble(strValue);
		System.out.println(value + " - " + value2);

		String finalString = value + "";
		finalString += " ";
		finalString += Double.toString(value2);
		System.out.println(finalString);

		// Exemple d'affichage formaté : les différents formats seront vus dans un
		// prochain chapitre
		String strFinal2 = String.format("%05d [%05.2f]", value, value2);
		System.out.println(strFinal2);

		String str = "abcd";
		String firstChar = str.substring(0, 1); // avec substring
		char c = str.charAt(0); // pour récupéré en char
		System.out.println(firstChar);
		System.out.println(c);

	}
}
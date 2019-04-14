
public class ResultatGagnant {

	public static void main(String[] args) {
		
		String resultatGagnantColor = "";
		for (int i = 0; i < 4; i++) {
			resultatGagnantColor += "\rLa couleur à l'emplacement " + (i + 1) + " est identique ";
		}
		System.out.println(resultatGagnantColor);
	}

}

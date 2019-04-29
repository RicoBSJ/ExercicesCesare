
public class DecalerTab {
	
	public static String[] decaler(String[] tab, int x) {
		for (int i = 0; i < x; i++) {
			for (int j = tab.length - 1; j > 0; j--) {
				String temp = tab[j];
				tab[j] = tab[j - 1];
				tab[j - 1] = temp;
			}
		}

		for (int j = 0; j < tab.length; j++) {
			System.out.print(tab[j]);
		}
		return tab;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] unOrderedArr = { "jaune ", "vert ", "rouge ", "noir " };
		int orderToRotate = 1;
		decaler(unOrderedArr, orderToRotate);
		System.out.println();
		decaler(unOrderedArr, orderToRotate);
	}
}
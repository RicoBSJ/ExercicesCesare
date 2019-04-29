
public class Decaler {
	
	public static int[] decaler(int[] tab, int x) {
		for (int i = 0; i < x; i++) {
			for (int j = tab.length - 1; j > 0; j--) {
				int temp = tab[j];
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
		int[] unOrderedArr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int orderToRotate = 1;
		decaler(unOrderedArr, orderToRotate);
	}
}
package FirstProgram;

public class TwoDimArray {

	public static void main(String[] args) {
		int number[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1, } };

		for (int v = 0; v < 1; v++) {
			for (int k = 0; k < 2; k++) {

				System.out.println(number[v][k] + " ");
				
			}
		}
	}
}

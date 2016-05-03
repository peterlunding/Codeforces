import java.util.Scanner;

public class CoatofAnticubism {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i;
		int[] c = new int[n];
		for (i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}
		in.close();
		int max = 0;
		int counter = 0;
		for (i = 0; i < n; i++) {
			if (c[i] > max) {
				max = c[i];
			}
			counter += c[i];
		}
		counter = Math.abs(counter - max * 2) + 1;
		if (counter - max == 0) {
			System.out.println(1);
		} else {
			System.out.println(counter);
		}
	}
}

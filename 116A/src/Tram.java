import java.util.Scanner;

public class Tram {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int i = 0;
		int n = in.nextInt();
		int c[] = new int[2 * n];
		for (i = 0; i < 2 * n; i++) {
			c[i] = in.nextInt();
		}
		in.close();
		int s = 0;
		int max = 0;
		for (i = 0; i < 2 * n; i++) {
			s = ((int) Math.pow(-1, i + 1)) * c[i] + s;
			if (s > max) {
				max = s;
			}
		}
		System.out.println(max);
	}

}

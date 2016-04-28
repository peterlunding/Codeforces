import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String n = in.next();
		in.close();
		int counter = 0;
		int i;
		for (i = 0; i < n.length() - 1; i++) {
			if (n.charAt(i + 1) == n.charAt(i) && counter < 6) {
				counter++;
			} else {
				counter = 0;
			}
			if (counter >= 6) {
				System.out.println("YES");
				break;
			}
		}
		if (counter < 6) {
			System.out.println("NO");
		}
	}
}
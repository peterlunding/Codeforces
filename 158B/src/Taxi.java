import java.util.ArrayList;
import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {

		ArrayList<Integer> grupper = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			grupper.add(in.nextInt());
		} // her kan du kode noget smart.
		in.close();
		int sum, indeholderet, i, k, j, counter;
		counter = 0;
		i = 0;
		j = 0;
		k = 0;
		indeholderet = 0;
		sum = 0;

		for (k = 0; k < grupper.size(); k++) {
			if (grupper.get(k) == 1) {
				indeholderet = 0;
				break;
			}

			else {
				indeholderet = 1;
			}
		}

		if (grupper.size() == 1) {
			System.out.println(grupper.size());
		}

		else if (indeholderet == 1) {
			for (i = 0; i < grupper.size(); i++) {
				for (j = i + 1; j < grupper.size(); j++) {
					if (grupper.get(i) == 2 && grupper.get(j) == 2) {
						grupper.remove(j);
						grupper.remove(i);
						grupper.add(4);
						break;
					}
				}
			}
			System.out.println(grupper.size());
		} else if (indeholderet == 0) {
			for (i = 0; i < grupper.size(); i++) {
				for (j = i + 1; j < grupper.size(); j++) {
					if (grupper.get(i) == 3 && grupper.get(j) == 1) {
						grupper.remove(j);
						counter++;
						break;
					}
				}
			}
			for (i = 0; i < grupper.size(); i++) {
				sum += grupper.get(i);
			}
			System.out.println((sum + counter - 1) / 4 + 1);
		}
	}
}

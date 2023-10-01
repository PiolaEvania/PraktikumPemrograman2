package PRAKTIKUM2;

import java.util.Scanner;

public class PRAK102_2210817220018_PiolaEvania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int bil, deret;
		bil = scanner.nextInt();
		int i = 0;
		while (i <= 10) {
			if (bil % 5 == 0) {
				deret = bil / 5 - 1;
				System.out.print(deret);
				if (i < 10) System.out.print(", ");
			}
			else {
				deret = bil;
				System.out.print(deret);
				if (i < 10) System.out.print(", ");
			}
			bil++;
			i++;
		}
	}
}

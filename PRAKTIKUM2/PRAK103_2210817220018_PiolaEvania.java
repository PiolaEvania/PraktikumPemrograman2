package PRAKTIKUM2;

import java.util.Scanner;

public class PRAK103_2210817220018_PiolaEvania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int barisN = scanner.nextInt();
		int bil = scanner.nextInt();
		int i = 0;
		do {
			if (bil % 2 == 1) {
				System.out.print(bil);
				if (i < barisN - 1) {
					System.out.print(", ");
				}
				i++;
			}
			bil++;
		}
		while (i < barisN);
	}
}

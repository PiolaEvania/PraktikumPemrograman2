package PRAKTIKUM2;

import java.util.Scanner;

public class PRAK104_2210817220018_PiolaEvania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Tangan Abu: ");
		String abuR1 = scanner.next();
		String abuR2 = scanner.next();
		String abuR3 = scanner.next();
		
		System.out.print("Tangan Bagas: ");
		String bagasR1 = scanner.next();
		String bagasR2 = scanner.next();
		String bagasR3 = scanner.next();
		
		int pointAbu = 0;
		int pointBagas = 0;
		
		if (abuR1.equals(bagasR1)) {
		}
		else if ((abuR1.equals("B") && bagasR1.equals("G")) || (abuR1.equals("G") && bagasR1.equals("K")) || (abuR1.equals("K") && bagasR1.equals("B"))){
			pointAbu++;
		}
		else {
			pointBagas++;
		}
		
		if (abuR2.equals(bagasR2)) {
		}
		else if ((abuR2.equals("B") && bagasR2.equals("G")) || (abuR2.equals("G") && bagasR2.equals("K")) || (abuR2.equals("K") && bagasR2.equals("B"))){
			pointAbu++;
		}
		else {
			pointBagas++;
		}
		
		if (abuR3.equals(bagasR3)) {
		}
		else if ((abuR3.equals("B") && bagasR3.equals("G")) || (abuR3.equals("G") && bagasR3.equals("K")) || (abuR3.equals("K") && bagasR3.equals("B"))){
			pointAbu++;
		}
		else {
			pointBagas++;
		}
		
		if (pointAbu > pointBagas) {
			System.out.println("Abu");
		}
		else if (pointBagas > pointAbu) {
			System.out.println("Bagas");
		}
		else {
			System.out.println("Seri");
		}
	}
}

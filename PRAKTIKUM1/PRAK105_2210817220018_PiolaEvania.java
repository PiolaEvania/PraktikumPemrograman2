package PRAKTIKUM2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2210817220018_PiolaEvania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.print("Masukkan jari-jari: ");
		double r = scanner.nextDouble();
		System.out.print("Masukkan tinggi: ");
		double t = scanner.nextDouble();
		double v = 3.14 * r * r * t; 
		
		System.out.print("Volume tabung dengan jari-jari " + r + " cm dan\ntinggi " + t + " cm adalah " + df.format(v) + " m3");
	}
}
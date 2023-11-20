package soal1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Nama Hewan Peliharaan: ");
		String n = s.nextLine();
		System.out.print("Ras: ");
		String r = s.nextLine();
		
		HewanPeliharaan hewan = new HewanPeliharaan(n, r);
		hewan.Display();
	}
}
package PRAKTIKUM2;

import java.util.Scanner;

public class PRAK101_2210817220018_PiolaEvania {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Masukkan Nama Lengkap: ");
		String nm = scanner.nextLine();
		System.out.print("Masukkan Tempat Lahir: ");
		String tl = scanner.nextLine();
		System.out.print("Masukkan Tanggal Lahir: ");
		int tgl = scanner.nextInt();
		System.out.print("Masukkan Bulan Lahir: ");
		int bln = scanner.nextInt();
		System.out.print("Masukkan Tahun Lahir: ");
		int thn = scanner.nextInt();
		System.out.print("Masukkan Tinggi Badan: ");
		int tb = scanner.nextInt();
		System.out.print("Masukkan Berat Badan: ");
		Float bb = scanner.nextFloat();
		
		String bulan = "";
		if (bln == 1) {
			bulan = "Januari";
		}
		else if (bln == 2) {
			bulan = "Februari";
		}
		else if (bln == 3) {
			bulan = "Maret";
		}
		else if (bln == 4) {
			bulan = "April";
		}
		else if (bln == 5) {
			bulan = "Mei";
		}
		else if (bln == 6) {
			bulan = "Juni";
		}
		else if (bln == 7) {
			bulan = "Juli";
		}
		else if (bln == 8) {
			bulan = "Agustus";
		}
		else if (bln == 9) {
			bulan = "September";
		}
		else if (bln == 10) {
			bulan = "Oktober";
		}
		else if (bln == 11) {
			bulan = "November";
		}
		else if (bln == 12) {
			bulan = "Desember";
		}
		else {
			System.out.println("Bulan tidak tersedia");
		}
		System.out.print("Nama Lengkap " + nm + ", Lahir di " + tl + " pada Tanggal " + tgl + " " + bulan + " " + thn + "\n" + "Tinggi Badan " + tb + " cm dan Berat Badan " + bb + " kilogram");
	}
}
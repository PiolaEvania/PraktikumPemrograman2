package soal2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
		System.out.println("1 = Kucing");
		System.out.println("2 = Anjing");
		System.out.print("Masukkan pilihan: ");
		int pilih = s.nextInt();
		s.nextLine();
		if(pilih != 1 && pilih != 2) {
			throw new IllegalArgumentException("Pilihan hanya 1 dan 2");
		}
		else {
			dataHewanPeliharaan(pilih, s);
		}
	}
	static private void dataHewanPeliharaan(int pilih, Scanner s) {
		System.out.print("Nama hewan peliharaan: ");
		String n = s.nextLine();
		System.out.print("Ras: ");
		String r = s.nextLine();
		System.out.print("Warna bulu: ");
		String w = s.nextLine();
		if(pilih == 1) {
			Kucing kucing = new Kucing(n, r, w);
			kucing.DisplayKucing();
		}
		else if(pilih == 2) {
			System.out.print("Memiliki kemampuan: ");
			String kemampuan = s.nextLine();
			String[] k = kemampuan.split(", ");
			Anjing anjing = new Anjing(n, r, w, k);
			anjing.DisplayAnjing();
		}
	}
}
package PRAKTIKUM1;

import java.util.Scanner;

public class PRAK005_2210817220018_PiolaEvania {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Masukkan Makanan Favorit: ");
		String namaMakanan = input.nextLine();
		
		System.out.println("Masukkan Hobi: ");
		String hobi = input.nextLine();
		
		System.out.println("Aku Suka Makan "+ namaMakanan +", dan Hobiku "+ hobi);
	}

}

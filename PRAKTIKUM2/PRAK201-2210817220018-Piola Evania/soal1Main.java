package PRAKTIKUM3;

import java.text.DecimalFormat;

public class soal1Main {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		
		buah a = new buah();
		a.nama = "Apel";
		a.berat = 0.4;
		a.harga = 7000;
		a.totalbeli = 40;
		
		a.info();
		System.out.println("Harga Sebelum Diskon: Rp" + df.format(a.getTotalharga()));
		System.out.println("Total Diskon: Rp" + df.format(a.getTotaldiskon()));
		System.out.println("Harga Setelah Diskon: Rp" + df.format(a.getSetelahdiskon()));
		System.out.println("");
		
		buah b = new buah();
		b.nama = "Mangga";
		b.berat = 0.2;
		b.harga = 3500;
		b.totalbeli = 15;
	
		b.info();
		System.out.println("Harga Sebelum Diskon: Rp" + df.format(b.getTotalharga()));
		System.out.println("Total Diskon: Rp" + df.format(b.getTotaldiskon()));
		System.out.println("Harga Setelah Diskon: Rp" + df.format(b.getSetelahdiskon()));
		System.out.println("");
		
		buah c = new buah();
		c.nama = "Alpukat";
		c.berat = 0.25;
		c.harga = 10000;
		c.totalbeli = 12;
		
		c.info();
		System.out.println("Harga Sebelum Diskon: Rp" + df.format(c.getTotalharga()));
		System.out.println("Total Diskon: Rp" + df.format(c.getTotaldiskon()));
		System.out.println("Harga Setelah Diskon: Rp" + df.format(c.getSetelahdiskon()));
	}
}
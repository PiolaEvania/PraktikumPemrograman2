package PRAKTIKUM3;

import java.text.DecimalFormat;

public class kopi {
	String namaKopi;
	String ukuran;
	int harga;
	private String pembeli;
	private Double pajak;
	
	public String getPembeli() {
		return pembeli;
	}
	public void setPembeli(String pembeli) {
		this.pembeli = pembeli;
	}
	public Double getPajak() {
		return pajak = (harga * 0.11);
	}
	public void setPajak(Double pajak) {
		this.pajak = pajak;
	}
	
	public void info() {
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Nama Kopi: " + namaKopi);
		System.out.println("Ukuran: " + ukuran);
		System.out.println("Harga : Rp. " + df.format(harga));
	}
}
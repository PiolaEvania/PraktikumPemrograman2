package PRAKTIKUM3;

import java.text.DecimalFormat;

public class buah {
	String nama;
	Double berat;
	int harga;
	int totalbeli;
	private Double totalharga;
	private Double totaldiskon;
	private Double setelahdiskon;
	
	public double getTotalbeli() {
		return totalbeli;
	}

	public void setTotalbeli(int totalbeli) {
		this.totalbeli = totalbeli;
	}

	public Double getTotalharga() {
		return totalharga = (harga/berat) * totalbeli;
	}

	public void setTotalharga(Double totalharga) {
		this.totalharga = totalharga;
	}

	public Double getTotaldiskon() {
		return totaldiskon = (totalbeli / 4) * (4 * harga) * 0.02;
	}

	public void setTotaldiskon(Double totaldiskon) {
		this.totaldiskon = totaldiskon;
	}

	public Double getSetelahdiskon() {
		return setelahdiskon = totalharga - totaldiskon;
	}

	public void setSetelahdiskon(Double setelahdiskon) {
		this.setelahdiskon = setelahdiskon;
	}

	public void info() {
		DecimalFormat df = new DecimalFormat ("0.0");
		
		System.out.println("Nama Buah: " + nama);
		System.out.println("Berat: " + berat);
		System.out.println("Harga: " + df.format(harga));
		System.out.println("Jumlah Beli: " + df.format(totalbeli) + "kg");
	}
}
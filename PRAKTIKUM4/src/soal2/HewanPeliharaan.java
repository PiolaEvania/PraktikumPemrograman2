package soal2;

public class HewanPeliharaan {
	private String nama;
	private String ras;
	
	public HewanPeliharaan(String n, String r) {
		this.nama = n;
		this.ras = r;
	}
	public void Display() {
		System.out.println("\nDetail Hewan Peliharaan:");
		System.out.println("Nama hewan peliharaanku adalah : "+ this.nama);
		System.out.println("Dengan ras : "+ this.ras);
	}
}
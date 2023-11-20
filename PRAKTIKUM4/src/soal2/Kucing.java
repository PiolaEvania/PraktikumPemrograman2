package soal2;

public class Kucing extends HewanPeliharaan {
	String warnabulu;
	
	public Kucing(String n, String r, String w) {
		super(n, r);
		this.warnabulu = w;
	}
	public void DisplayKucing() {
		super.Display();
		System.out.println("Memiliki warna bulu : "+ this.warnabulu);
	}
}
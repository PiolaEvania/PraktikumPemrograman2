package soal2;

public class Anjing extends HewanPeliharaan {
	private String warnabulu;
	private String[] kemampuan;
	
	public Anjing(String n, String r, String w, String[] k) {
		super(n, r);
		this.warnabulu = w;
		this.kemampuan = k;
	}
	public void DisplayAnjing() {
		super.Display();
		System.out.println("Warna Bulu : "+ this.warnabulu);
		System.out.print("Memiliki kemampuan : ");
		for(String i : kemampuan) {
			System.out.print(i + " ");
		}
	}
}
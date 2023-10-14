package PRAKTIKUM3;

public class pegawai {
	public String nama;
	//baris ini terjadi error karena tipe data pada gettersetter dan main method tidak sesuai
	//public char asal; 
	public String asal; 
	public String jabatan;
	public int umur;

	public String getNama() {
		return nama;
	}
	
	public String getAsal() {
		return asal;
	}
	//baris ini terjadi error karena tidak ada value
	//public void setJabatan() {
	public void setJabatan(String j) { 
	    this.jabatan = j;
	}
	//baris ini untuk memunculkan (set) umur pada main method
	public void setUmur(int u) { 
		this.umur = u;
	}
}
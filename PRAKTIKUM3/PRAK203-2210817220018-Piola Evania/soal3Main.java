package PRAKTIKUM3;

public class soal3Main {

	public static void main(String[] args) {
		pegawai p1 = new pegawai();
		// baris ini terjadi error karena tidak ada titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi"; 
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //baris ini untuk menginisiasi umur
        p1.setUmur(17); 

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
	}
}
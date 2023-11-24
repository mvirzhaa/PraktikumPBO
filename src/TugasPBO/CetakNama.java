package TugasPBO;
import java.util.Scanner;
public class CetakNama {

	private String nama;
	private int jumlahCetak;
	
	public String getnama() {
		return nama;
	}
	
	public void setnama(String nama) {
		this.nama = nama;
	}
	
	public int getjumlahCetak() {
		return jumlahCetak;
	}
	
	public void setjumlahCetak(int jumlahCetak) {
		this.jumlahCetak = jumlahCetak;
	}
	
	public void cetakNama(String nama) {
		this.nama = nama;
	}
	
	public void cetak(String nama, int jumlahCetak) {
		this.nama = nama;
		this.jumlahCetak = jumlahCetak;
		
		for (int i = 1; i<=jumlahCetak; i++) {
			System.out.println(i+"."+nama);
		}
	}
	
	public static void main(String[] args) {
		CetakNama data = new CetakNama();
		String nama;
		int jumlahCetak;
		
		Scanner input = new Scanner(System.in);
		System.out.println("==== Aplikasi Pencetak Nama ====");
		
		System.out.print("Masukan Nama Anda : ");
		data.setnama(input.next());
		nama = data.getnama();
		
		System.out.print("Jumlah Cetak : ");
		data.setjumlahCetak(input.nextInt());
		jumlahCetak = data.getjumlahCetak();
		
		System.out.println("Nama Anda : "+nama);
		System.out.println("Hasil Cetak : ");
		data.cetak(nama,jumlahCetak);
	}
	
}

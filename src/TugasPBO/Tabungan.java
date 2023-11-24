package Tugaspbo;

import java.util.Scanner;

// Kelompok : Zidan
//			: Muhamad Virzha Andriansyah

public class Tabungan {
	
	private int saldo;
	
	public void tabungan(int saldo)
	{
		this.saldo = saldo;
	}
	
	public void ambilUang(int jumlah)
	{
		if (jumlah <= saldo) {
			saldo -= jumlah;
			System.out.println("Penarikan berhasil. sisa saldo: "+ saldo);
		} else {
			System.out.println("saldo tidak cukup.");
		}
	}
	
	public static void main(String[] args) {
		Tabungan rekening = new Tabungan();
		Scanner input = new Scanner(System.in);
		
		System.out.println("==== Program penarikan uang ====");
		
		System.out.print("Masukan saldo awal : ");
		int saldoTabungan = input.nextInt();
		rekening.tabungan(saldoTabungan);
		
		System.out.print("Jumlah uang yang diambil:");
		int JumlahAmbil = input.nextInt();
		rekening.ambilUang(JumlahAmbil);
				
	}
}

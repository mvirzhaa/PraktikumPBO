package praktikum1;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
		Scanner input= new Scanner(System.in);
		String namaDepan, namaBelakang, fullName, npm;
		System.out.println("Nama Depan :");
		namaDepan = input.next();
		System.out.println("Nama Belakang :");
		namaBelakang = input.next();
		fullName = namaDepan + namaBelakang;
		System.out.println("NPM :");
		npm = input.next();
		System.out.println("FullName :"+fullName);
		System.out.println("NPM : "+npm);
//	inisialisasi variable	
		int angka1, angka2, hasil;
//	user input	
		System.out.println("masukan angka 1 :");
		angka1 = input.nextInt();
		
		System.out.println("masukan angka 2 :");
		angka2 = input.nextInt();
//		perhitungan hasil
		hasil = angka1 + angka2;
//		output
		System.out.println("Hasilnya :"+hasil);
	}
	}

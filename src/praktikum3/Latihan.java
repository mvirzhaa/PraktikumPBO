package praktikum3;
import java.util.Scanner;
public class Latihan {
	public static void main(String args[]) {
		java.util.Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil, perulangan,perhitungan;
		
		System.out.print("Masukan Perulangan :" );
		perulangan = input.nextInt();
		
		for (int i = 1; i <= perulangan; i++) {
			System.out.print("Masukan Angka 1 ;");
			angka1 =input.nextInt();
			System.out.print("Masukan Angka 2 ;");
			angka2 =input.nextInt();
			System.out.print("List Perhitungan;"
					+ "\n 1 : Pertambahan"
					+ "\n 2 : Pengurangan"
					+ "\n 3 : perkalian"
					+ "\n 4 : pembagian"
					+ "\n Masukan angka Perhitungan :");
			perhitungan =input.nextInt();
			
			if( perhitungan ==1){
				hasil = angka1 + angka2;
				System.out.println("Hasilnya Adalah ;"+hasil);
			}else if  (perhitungan == 2) {
				hasil = angka1 - angka2;
				System.out.println("Hasilnya Adalah ;"+hasil);
			}else if  (perhitungan ==3) {
				hasil = angka1 * angka2;
				System.out.println("Hasilnya Adalah ;"+hasil);
			}else if  (perhitungan ==4){
				hasil = angka1 / angka2;
				System.out.println("Hasilnya Adalah ;"+hasil);
			}else{
				System.out.println("Angka Perhitungan Salah");
			}
		}
}
	}

package praktikum2;
import java.util.Scanner;
public class PengkondisianSwitch {
	public static void main(String args[]) {
		int angka1,angka2,hasil;
		String perhitungan;
		java.util.Scanner input = new Scanner(System.in);

		System.out.print("Masukan Angka 1 ;");
		angka1 =input.nextInt();
		System.out.print("Masukan Angka 2 ;");
		angka2 =input.nextInt();
		System.out.print("List Perhitungan;"
				+ "\n + : Pertambahan"
				+ "\n - : Pengurangan"
				+ "\n * : perkalian"
				+ "\n / : pembagian"
				+ "\n Masukan angka Perhitungan :");
		perhitungan =input.next();
		
		switch(perhitungan) {
		case "+":
			hasil = angka1 + angka2;
			System.out.println("Hasilnya Adalah :"+hasil);
			break;
		case "-":
			hasil = angka1 - angka2;
			System.out.println("Hasilnya Adalah :"+hasil);
			break;
		case "*":
			hasil = angka1 * angka2;
			System.out.println("Hasilnya Adalah :"+hasil);
			break;
		case "/":
			hasil = angka1 / angka2;
			System.out.println("Hasilnya Adalah :"+hasil);
			break;
			default:
				System.out.println("Simbol yang dimasukkan salah");
		}
	}
}

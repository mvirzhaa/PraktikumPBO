package Praktikum5;
import java.util.Scanner;
public class Test {
	public static void main(String []args) {
		String nama, warna;
		int berat;
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Masukan Nama Kucingmu: ");
		nama = Input.next();
		
		System.out.print("Masukan Warna Kucingmu: ");
		warna = Input.next();
		
		System.out.print("Masukan Berat Kucingmu: ");
		berat = Input.nextInt();
		
		cat kucingsaya = new cat();
		kucingsaya.identitas(nama, warna, berat);
		System.out.println(kucingsaya.ambilNama()+" Si Kucing,"+" Warnanya "+kucingsaya.ambilWarna()+" Beratnya "+kucingsaya.ambilBerat()+" Kg");
		kucingsaya.eat();
	}
}

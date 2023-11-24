package praktikum2;
import java.util.Scanner;
public class PengkondisianIF {
 public static void main(String args[]){
int angka1,angka2,hasil,perhitungan;
java.util.Scanner input = new Scanner(System.in);

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

if( perhitungan == 1 ) {
	hasil = angka1 + angka2;
	System.out.print("Hasilnya Adalah ;"+hasil);
}else if  (perhitungan == 2 ){
	hasil = angka1 - angka2;
	System.out.print("Hasilnya Adalah ;"+hasil);
}else if  (perhitungan == 3){
	hasil = angka1 * angka2;
	System.out.print("Hasilnya Adalah ;"+hasil);
}else if  (perhitungan == 4 ){
	hasil = angka1 / angka2;
	System.out.print("Hasilnya Adalah ;"+hasil);
}else{
	System.out.print("Angka Perhitungan Salah");
}
 }
 
}
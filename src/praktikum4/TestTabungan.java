package praktikum4;
import java.util.Scanner;
public class TestTabungan {
	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);
	int saldo,tarikTunai;
	
	System.out.println("Masukan Saldo Anda = ");
	saldo = input.nextInt();
	Tabungan atm = new Tabungan(saldo);
	
	System.out.println("Masukan Nominal Tarik Tunai = ");
	tarikTunai = input.nextInt();
	
	System.out.println("Saldo Anda = "+atm.saldo);
	
	atm.ambilUang(tarikTunai);
	System.out.println("Jumlah Saldo yang diambil = "+tarikTunai);
	System.out.print("Saldo Saat Ini = "+atm.saldo);
	
	
	}
}
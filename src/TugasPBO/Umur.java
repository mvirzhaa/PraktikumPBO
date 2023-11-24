package Tugaspbo;
// Kelompok : Zidan
//			: Muhammad Virzha Andriansyah
import java.util.Scanner;

public class Umur{
	private int yearBirth;
	private int yearNow;
	
	public int age(int yearNow) {
		return this.yearNow = yearNow;
	}
	
	public int getYearBirth() {
		return yearBirth;
	}
	
	public void setYearBirth(int yearBirth) {
		this.yearBirth = yearBirth;
	}
	
	public int getYearNow() {
		return yearNow;
	}
	
	public void setYearNow(int yearNow) {
		this.yearNow = yearNow;
	}
	
	public int hitungUmur()
	{
		return this.yearNow - this.yearBirth;
	}
	
	public String tandanyaKamu(int umur) {
		if(umur <=5) {
			return "Lagi lucu lucunya";
		}
		else if(umur <= 10) {
			return "Masih anak-anak";
		}
		else if(umur <=13) {
			return "Masih Remadja";
		}
		else if(umur <= 19) {
			return "ALAYYYYY";
		}
		else if(umur <= 29) {
			return "Lagi galau nyari jodoh awkoakwok";
		}
		else if(umur <= 35) {
			return "Lagi sibuk nyari cuan";
		}
		else if(umur <= 150) {
			return "Suda Tua/Sepuh";
		}
		else if(umur >= 150) {
			return "Manusia pra sejarah";
		}
		else {
			return "Input anda salah";
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Umur person1 = new Umur();
		
		System.out.print("Masukan tahun lahir anda :");
		person1.setYearBirth(input.nextInt());
		System.out.println("\n" +
				"==== Hasil Perhitungan Umur====");
		
		System.out.print("Hari ini tahun? :");
		person1.setYearNow(input.nextInt());
		
		System.out.println("Umur kamu sampai hari ini adalah" +person1.hitungUmur() +"tahun");
		
		System.out.println("Tandanya kamu "+ person1.tandanyaKamu(person1.hitungUmur()));
	}

}

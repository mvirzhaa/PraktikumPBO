package Praktikum5;

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
	
}

class cat extends Hewan{
	String warna;
	int berat;
	public void identitas(String namaKucing, String warnaKucing, int beratKucing) {
		cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratKucing;
	}
	public void eat() {
		System.out.println(cat.name+" Makan Whiskas");
	}
	String ambilNama() {
		return cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
}
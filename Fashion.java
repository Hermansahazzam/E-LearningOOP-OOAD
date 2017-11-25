


public class Fashion extends Barang {
	public int diskon;
	public int potongan;

	public void hitung_potongan (){
		diskon = 1000;
		potongan = harga_barang*qty-diskon;
		System.out.println("Biaya yang harus dibayar =" + potongan);
	}
	/*public static void main(String[] args) {
		
		int diskon= 1000;
		Fashion cal = new Fashion ();
		cal.entry();
		cal.update();
		cal.remove();
		cal.hitung_potongan();
	}*/
}
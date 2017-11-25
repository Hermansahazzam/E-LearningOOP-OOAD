public class Elektronik extends Barang {
	
	public int garansi;
	public int akhir_garansi;
	public int tgl_skrng;

	public void hitung_akhirgaransi (){
		garansi = 1;
		tgl_skrng = 12122017;
		akhir_garansi = tgl_skrng+ garansi;
		System.out.println("Akhir Garansi =" + akhir_garansi);
	}
	
	/*public static void main(String[] args) {
	
		Elektronik cal = new Elektronik ();
		cal.entry();
		cal.update();
		cal.remove();
		cal.hitung_akhirgaransi();
	}*/
}
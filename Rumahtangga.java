


public class Rumahtangga extends Barang {
	public int tgl_kadaluarsa;
	public int bln_kadaluarsa;	
	public int thn_kadaluarsa;
	public int tgl;
	public int bln;
	public int thn;
	public void hitung_waktukadaluarsa (){
		int tgl;tgl=8;
		int bln;bln=11;
		int thn;thn=2017;
		int a,b;
		tgl_kadaluarsa=9;
		bln_kadaluarsa=10;a=bln_kadaluarsa-bln;	
		thn_kadaluarsa=2018;b=thn_kadaluarsa-thn;
		
		System.out.println("Masa kadaluarsa tersisa =" + b +"tahun"+ a +"bulan" + tgl_kadaluarsa +"hari");
	}
	/*public static void main(String[] args) {
		
		int diskon= 10;
		Rumahtangga cal = new Rumahtangga ();
		cal.entry();
		cal.update();
		cal.remove();
		cal.hitung_waktukadaluarsa();
	}*/
}
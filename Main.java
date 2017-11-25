import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		Admin log = new Admin ();		
		log.login(); 
		/*Laporan lap = new Laporan ();		
		lap.hapus_lap();*/
		Barang br = new Barang ();
		br.tambah();
		
	}
}
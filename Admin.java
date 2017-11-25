import java.util.Scanner;
class Admin {
	public String kode_adm;
	public String nama_adm;
	public String password;
	public String level_akses;

	public void tambah(){
		Scanner input = new Scanner (System.in);
		System.out.print("Masukan kode : ");
		kode_adm = input.nextLine();
		System.out.print("Masukan nama : ");
		nama_adm = input.nextLine();
		System.out.print("Masukan Password : ");
		password = input.nextLine();
		System.out.print("Jenis Akses : ");
		level_akses = input.nextLine();
				
	}
	public void update(){
		Scanner input = new Scanner (System.in);
		System.out.print("Silahkan masukan kode admin yang akan diupdate: ");
		kode_adm = input.nextLine();	
	}
	public void hapus(){
		Scanner input = new Scanner (System.in);
		System.out.print("Silahkan masukan kode admin yang akan dihapus: ");
		kode_adm = input.nextLine();
	}
	public void login(){
		Scanner input = new Scanner (System.in);
			System.out.print("Silahkan masukan nama: ");
			nama_adm = input.nextLine();
			System.out.print("Silahkan masukan password: ");
			password = input.nextLine(); 
			
			if ((nama_adm == "lulu") && (password == "lali")){
				System.out.println("Selamat Datang ");
				
			}
						
		 	else{System.out.println("Salah ");System.out.println(" ");}
		
	}
}
		

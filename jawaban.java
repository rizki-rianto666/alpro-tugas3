public class jawaban {
	public static void main (String [] argumrnts) {
		
		//NESTED LOOP UNTUK SEGITIGA SIMBOL ASTERISK (*)
		int baris; //Variable untuk baris asterisk (Outter loop nya)
		int maks = 4; //variable untuk maksimal baris
		int asterisk; //Variable untuk banyaknya asterisk dalam setiap iterasi (perulangan) (Inner loop nya)
		
		for (baris = 0; baris <= maks; baris++ ) {//for loop ini adalah outter loop untuk pembuatan baris 
			for (asterisk = 0; asterisk <= baris; asterisk++) { //for loop ini adalah inner loop untuk membuat banyak asterisk nya dalam suatu baris
				System.out.print("* ");
			}
			System.out.println();
		} //proses nya outter loop dulu untuk iterasi pertama, lalu masuk inner loop dan bereskan dulu inner loop, lalu lanjut lagi ke outter loop untuk iterasi kedua dan terus hingga beres
		
		System.out.println("\n-------------------------\n"); //Hanya digunakan sebagai pemisah outputan antara nested loop asterisk dengan angka
		
		//NESTED LOOP UNTUK SEGITIGA SIMBOL ANGKA
		maks = 5; //variable untuk maksimal baris disini diganti jadi 5, karena baris awal akan dimulai dari hitungan 1
		int angka; //Variable untuk banyaknya angka dalam setiap iterasi (perulangan) (Inner loop nya)
		
		for (baris = 1; baris <= maks; baris++ ) {//for loop ini adalah outter loop untuk pembuatan baris 
			for (angka = 1; angka <= baris; angka++) { //for loop ini adalah inner loop untuk membuat banyak angka nya dalam suatu baris
				System.out.print(angka + " "); //menampilkan angka angka dalam setiap barisnya
			}
			System.out.println();
		} //proses nya outter loop dulu, lalu masuk inner loop dan bereskan dulu inner loop baru lanjut lagi ke outter loop dan terus hingga beres
	
	}
	
}

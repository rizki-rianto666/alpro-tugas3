public class jawaban {
	public static void main (String [] argumrnts) {
		int baris; //Variable untuk baris asterisk (Outter loop nya)
		int maks = 4; //variable untuk maksimal baris
		int asterisk; //Variable untuk banyaknya asterisk dalam setiap iterasi (perulangan) (Inner loop nya)
		
		for (baris = 0; baris <= maks; baris++ ) {//for loop ini adalah outter loop untuk pembuatan baris 
			for (asterisk = 0; asterisk <= baris; asterisk++) { //for loop ini adalah inner loop untuk membuat banyak asterisk nya dalam suatu baris
				System.out.print("* ");
			}
			System.out.println();
		} //proses nya outter loop dulu untuk iterasi pertama, lalu masuk inner loop dan bereskan dulu inner loop, lalu lanjut lagi ke outter loop untuk iterasi kedua dan terus hingga beres
	}
}

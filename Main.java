
package konversi;
import static java.lang.System.exit;
import java.util.Scanner;

public class Main {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      
        // deklarasi variabel
        
        int pilih;
        float d = 0;
 
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("|--------------------------|");
        System.out.println(" PROGRAM KONVERSI SUHU AIR ");
        System.out.println("|--------------------------|");
        System.out.print("INPUT DATA");
        System.out.print("\n-------------");
        System.out.print("\nSuhu dalam celcius: ");
        // menyimpan nilai pada variabel d
        d = keyboard.nextFloat();

        do{
        suhu konversi = new suhu(d); //membuat objek kelas suhu
        System.out.print("\nOpsi");
        System.out.print("\n--------");
        System.out.print("\n1. Lihat Data");
        System.out.print("\n2. Edit data");
        System.out.print("\n3. Exit");
        System.out.print("\nPilih : ");
        pilih = keyboard.nextInt(); // menyimpan nilai pada variabel pilih
            switch (pilih) {
                case 1:
                    //mencetak nilai suhu beserta kondisi airnya
                    System.out.println("Celcius : " + konversi.c);
                    System.out.println("Kelvin : " + konversi.kelvin());
                    System.out.println("Reamur : " + konversi.reamur());
                    System.out.println("Fahrenheit : " + konversi.fahrenheit());
                    System.out.println("Kondisi air " + konversi.air());
                    break;
                case 2:
                    System.out.print("Suhu dalam celcius: ");
                    // menggunakan scanner dan menyimpan apa yang diketik di variabel konversi.c
                    d = keyboard.nextFloat();
                    break;
                case 3:
                    exit(0);
                default:
                    System.out.print("Opsi yang anda masukkan tidak benar, Mohon masukkan opsi yang benar!\n");
                    break;
            }
        }while(pilih!=3);
        
    }

    }
    


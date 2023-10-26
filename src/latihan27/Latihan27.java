/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan27;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 Nama :Ma'rifatu Khirzah
 NIM :22205025
 Prodi :Teknik Informatika
 Deskripsi :Membuat program menampilkan formatting kalimat huruf besar dan kecil dimana user menginput.
 */
public class Latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        
        while (ulangi) {
            System.out.println("Masukkan Kalimat : ");
            String kalimat = input.next();
            
            String kalimatKecil = kalimat.toLowerCase();
            String KalimatBesar = kalimat.toUpperCase();
            
            System.out.println("===== Hasil formatting =====");
            System.out.println("HurufBesar = " +KalimatBesar);
            System.out.println("HurufKecil = " +kalimatKecil);
            
            System.out.print("\nUlangi Program? (ya/tidak)");
            String ulang = input.next();
            if(ulang == "ya"){
                System.out.println("Program akan diulangi");
            } else if(ulang == "tidak"){
                System.out.println("Program berhenti terimakasih");
                ulangi = false;
            }
        }
    }
    
}

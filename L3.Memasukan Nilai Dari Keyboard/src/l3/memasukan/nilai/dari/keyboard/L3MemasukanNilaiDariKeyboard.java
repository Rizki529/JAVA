package l3.memasukan.nilai.dari.keyboard;

import java.util.Scanner;

/**
  * NAMA  : M RizkiSaeful Rohman
 * NIM   : A2.1900101
 * Kelas : TI-1B
 * 
 * @author Ikky
 */
public class L3MemasukanNilaiDariKeyboard {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
                
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}

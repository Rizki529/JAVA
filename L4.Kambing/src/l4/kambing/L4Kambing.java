package l4.kambing;

/**
 * NAMA  : M RizkiSaeful Rohman
 * NIM   : A2.1900101
 * Kelas : TI-1B
 * 
 * @author Ikky
 */
public class L4Kambing {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambahkan: " + jumlahKambing);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        L4Kambing kambingJantan =  new L4Kambing ();
        kambingJantan.tambahKambing();
        // TODO code application logic here
    }
    
}

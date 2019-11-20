package l6.kambingstatic;

class Mamalia  {
    // Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;

}


/**
 * NAMA  : M RizkiSaeful Rohman
 * NIM   : A2.1900101
 * Kelas : TI-1B
 * 
 * @author M Rizki Saeful Rohman
 */
public class L6KambingStatic {
    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MEMET";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}

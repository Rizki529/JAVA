package l2.deklarasi.pengaksesan.variabel;

/**
 * NAMA  : M RizkiSaeful Rohman
 * NIM   : A2.1900101
 * Kelas : TI-1B
 * 
 * @author Ikky
 */
public class L2DeklarasiPengaksesanVariabel {
    public static void main(String[] args) {
        // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14;//Konstanta uppr\ercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel 
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel Nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
    
}

package l5.kambingglobal;

/**
 * NAMA  : M RizkiSaeful Rohman
 * NIM   : A2.1900101
 * Kelas : TI-1B
 * 
 * @author Ikky
 */
public class L5Kambingglobal {
    //Variabel jumlahkambing menjadi variabel intance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing (){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: "+ jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       L5Kambingglobal kambingSusu = new L5Kambingglobal();
       
       //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
       kambingSusu.getJumlahKambing();
       
       //Menambah satu kambing
       kambingSusu.tambahKambing();
       
       //Menambahkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
    }
    
}

package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Inputan sudah terdefinisi dan tinggal menghitung tegangannya.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai baterai1 = new Baterai();
        Baterai baterai2 = new Baterai(3.0f, 12.0f);
        System.out.println("Kuat Arus : " + baterai2.getKuatArus());
        System.out.println("Hambatan : " + baterai2.getHambatan());
        System.out.println("Hasil Tegangan : " + baterai2.hitungTegangan());
    }
    
}

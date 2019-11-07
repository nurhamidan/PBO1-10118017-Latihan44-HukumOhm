package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class untuk menghitung tegangan.
 * 
 */
public class Baterai {
    //Atribut class
    private float kuatArus;
    private float hambatan;

    //Konstruktor
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "\nakan berbanding lurus dengan beda potensial\npada ujung-ujung "
                + "kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan.\n");
        
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    
    //Getter
    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    //Method menghitung tegangan
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}

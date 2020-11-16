package pbo2.pkg10119073.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan profil karakter detective conan
 * dengan konsep pewarisan class
 *
 */

public class Karakter extends DetectiveConan {
    private String keahlian;

    public Karakter(String keahlian, String nama, String asal, boolean detective) {
        super(nama, asal, detective);
        this.keahlian = keahlian;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void tampilKarakter() {
        System.out.println("Nama\t\t : " +nama);
        System.out.println("Dari\t\t : " +asal);
        if(detective) {
            System.out.println("Detective\t : Iya");
        } else {
            System.out.println("Detective\t : Tidak");
        }
        System.out.println("Keahlian\t : " +keahlian);
        System.out.println();
    }
}

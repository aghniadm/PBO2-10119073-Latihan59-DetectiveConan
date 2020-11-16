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

public class DetectiveConan {
    protected String nama, asal;
    protected boolean detective;
    
    public DetectiveConan(String nama, String asal, boolean detective) {
        this.nama = nama;
        this.asal = asal;
        this.detective = detective;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }
}

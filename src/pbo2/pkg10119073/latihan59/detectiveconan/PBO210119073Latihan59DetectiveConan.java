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
public class PBO210119073Latihan59DetectiveConan {

    public static void main(String[] args) {
        Karakter conan = new Karakter("Investigasi","Conan Edogawa (Shinichi Kudo)","Tokyo",true);
        conan.tampilKarakter();
        
        Karakter ran = new Karakter("Karate","Ran Mouri","Osaka",false);
        ran.tampilKarakter();
        
        Karakter ai = new Karakter("Kimia dan Farmasi","Ai Haibara (Shiho Miyano / Sherry)","Tokyo",true);
        ai.tampilKarakter();
        
    }
    
}

import java.util.Scanner;

public class Gaji02 {
    
    public static void main(String[] args) {
        
        Scanner input =new Scanner (System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji; 

        
        System.out.println("Masukkan Nilai Gaji per-hari anda");
        gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji jika tidak masuk per-harinya");
        potGaji=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk=input.nextInt();

        TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
        
    }
}

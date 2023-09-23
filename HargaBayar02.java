import java.util.Scanner;

public class HargaBayar02 {

    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        int harga, jumlah, jmlHalaman;
        double dis, total, bayar, jmlDis;
        String merk;

        System.out.println("Masukkan merk buku yang dibeli ");
        merk=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku yang dibeli ");
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan besar diskon ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Merk buku yang anda beli adalah : " +merk);
        System.out.println("Jumlah Halaman buku yang anda beli adalah : " +jmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah : " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " +bayar);
        
    }
}

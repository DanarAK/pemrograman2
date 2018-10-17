import java.io.*;

public class tugaskuis {
    public static void main (String [] args) {
        BufferedReader dataIn = new BufferedReader (new inputStreamReader(System.in));

        String kode ="";
        String nama ="";
        String jumlah ="";
        

        System.out.print("Masukkan Kode barang : ");
            kode = dataIn.readLine();
        System.out.println("Masukkan Nama barang : ");
            nama = dataIn.readLine();
        System.out.println("Masukkan Jumlah Harga : ");
            jumlah = dataIn.readLine();
        
        System.out.println("");
        System.out.println("       ------------ TOKO MASIH HARAPAN ---------");
        System.out.println("------------- Silahkan Masukkan data barang-------------");
        System.out.println("Kode barang = " + kode);
        System.out.println("Nama Barang = " + nama );
        System.out.println("Jumlah Barang = " + jumlah );

        




    }
}
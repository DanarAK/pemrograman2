// satu paket library input

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// bisa diringkas 
// import java.io.*

public class InputNilai{
    public static void main (String[] args){
        String nama = "";
        String nim = "";
        String mata_kuliah = "";
        float nilai_lain2 = 0;
        float nilai_uts = 0;
        float nilai_uas = 0;
        float nilai_akhir = 0;

        BufferedReader NilaiInput = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Masukan Nama Anda");

         try{
            nama = NilaiInput.readLine();

        }catch(IOException ex){
            System.out.println("error!" + ex);
        }

        System.out.println("Masukan nim Anda");

         try{
            nim = NilaiInput.readLine();

        }catch(IOException ex){
            System.out.println("error!" + ex);
        }

        System.out.println("Masukan mata_kuliah Anda");

         try{
            mata_kuliah = NilaiInput.readLine();

        }catch(IOException ex){
            System.out.println("error!" + ex);
        }

        System.out.println("Masukan Nilai Lain-lain");

         try{
            nilai_lain2 = Float.parseFloat(NilaiInput.readLine());

        }catch(IOException ex){
            System.out.println("error!" + ex);
        }

        System.out.println("Masukan Nilai UTS");

         try{
            nilai_uts = Float.parseFloat(NilaiInput.readLine());

        }catch(IOException ex){
            System.out.println("error!" + ex);
        }

        System.out.println("Masukan Nilai UAS");

         try{
            nilai_uas = Float.parseFloat(NilaiInput.readLine());

        }catch(IOException ex){
            System.out.println("error!" + ex);
        }

        nilai_akhir = (0.4F * nilai_lain2) + (0.3F * nilai_uts) + (0.3F * nilai_uas);

        System.out.println(" Nama : " + nama);
        System.out.println(" NIM : " + nim);
        System.out.println(" Mata Kuliah : " + mata_kuliah);
        System.out.println(" Nilai akhir : " + nilai_akhir);
        


        if( nilai_akhir >= 80 ){
            System.out.println("GRADE A");
        }else if( nilai_akhir >= 76 && nilai_akhir <= 79 ){
            System.out.println("GRADE AB");
        }else if( nilai_akhir >= 71 && nilai_akhir <= 75 ){
            System.out.println("GRADE B");
        }else if( nilai_akhir >= 66 && nilai_akhir <=70 ){
            System.out.println("GRADE BC");
        }else if( nilai_akhir >= 61 && nilai_akhir <= 65 ){
            System.out.println("GRADE C");
        }else if( nilai_akhir >= 56 && nilai_akhir <= 60 ){
            System.out.println("GRADE CD");
        }else if( nilai_akhir >= 51 && nilai_akhir <= 55 ){
            System.out.println("GRADE D");
        }else if( nilai_akhir >= 50 ){
            System.out.println("GRADE E");
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//bisa diringkas dengan import.java.io.*;

public class GetInputReader1 {
    public static void main ( String [] args ){
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));

        String nama = "", nim ="";

        System.out.print ("Masukkan Nama Anda : ");

        try {
            nama =dataIn.readLine();
        }catch (IOException e){
            System.out.println("Error!");
        }

        System.out.print ("Masukkan NIM Anda : ");

        try {
            nim =dataIn.readLine();
        }catch (IOException e){
            System.out.println("Error!");
        }

        System.out.println("");
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.println("Selamat Datang " + nama );
        System.out.println("NIM : " + nim );

    }
}
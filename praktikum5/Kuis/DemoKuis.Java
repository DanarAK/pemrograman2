
import java.io.*;


public class DemoKuis{
    public static void main(String[]args) trows {

        BufferedReader dataInput = new BufferedReader (new InputStreamReader (System.in));
        String Id_user , pasword ;
        boolean status = true;

        do{
            system.out.println("masukan ID.User : ");
            id_user = dataInput.readLine();

            system.out.println("masukan pasword: ");
            pasword = dataInput.readLine();

            if(!id_user.equals("17153009")){
                systtem.out.println("id_user yang anda masukan salah!");
            }else{
                if(!pasword.equals("mahasiswa123")){
                systtem.out.println("pasword yang anda masukan salah!");
            }else {
                status = false;
            }
        }while(stsus);

        syste.out.println("selamat datang" + id_user);
        }
    }
}
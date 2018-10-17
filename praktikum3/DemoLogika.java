public class DemoLogika{

    public static void main (String [] args) { 
        // Beberapa Angka
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println ("Nilai Variable...") ;
        System.out.println (" i = " + i);
        System.out.println (" j = " + j);
        System.out.println (" k = " + k);
        //Lebih Besar Dari
        System.out.println ("Lebih Besar Dari...") ;
        System.out.println (" i > j = " + (i > j)); //false
        System.out.println (" j > i = " + (j > i)); //true
        System.out.println (" k > j = " + (k > j)); //false
        //Lebih Besar atau sama dengan
        System.out.println ("Lebih Besar Dari atau Sama Dengan...") ;
        System.out.println (" i >= j = " + (i >= j)); //false
        System.out.println (" j >= i = " + (j >= i)); //true
        System.out.println (" k >= j = " + (k >= j)); //true
        //Lebih Kecil Dari
        System.out.println ("Lebih Kecil Dari...") ;
        System.out.println (" i < j = " + (i < j)); //true
        System.out.println (" j < i = " + (j < i)); //false
        System.out.println (" k < j = " + (k < j)); //false
        //Lebih Kecil atau sama dengan
        System.out.println ("Lebih Kecil Dari atau sama dengan...") ;
        System.out.println (" i <= j = " + (i <= j)); //true
        System.out.println (" j <= i = " + (j <= i)); //false
        System.out.println (" k <= j = " + (k <= j)); //true
        //sama dengan
        System.out.println ("Sama dengan...") ;
        System.out.println (" i == j = " + (i == j)); //false
        System.out.println (" k == j = " + (k == j)); //true
        //Tidak sama dengan
        System.out.println ("Tidak Sama dengan...") ;
        System.out.println (" i != j = " + (i != j)); //false
        System.out.println (" k != j = " + (k != j)); //true
        
    }
}
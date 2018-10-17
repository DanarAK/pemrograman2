public class Invest {
    public static void main (String [] arguments ){
        float total = 14000;
        System.out.println ("Original Investment : S" + total);

        // increase by 40 percent the first year total = total + ( total * .4F);
        System.out.println ("After One Years : S" + total);
        // Loses $1,500 the second year total = total - 1500F;
        System.out.println ("After Two Years : S" + total);

        // increase by 12 percent the third years total = total + (total * .12F);
        System.out.println ("After Three Years : S" + total);
    }
}
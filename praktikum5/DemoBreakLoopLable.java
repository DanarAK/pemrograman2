public class DemoBreakLoopLable{
    public static void main(String[]args);
    int a, b;
    mulai:
    for(a=0;a<2;a++)
        for (b=0;b<3;b++){
            if(b==1)
            break
                mulai;
                system.out.prinln("a="+a+";b="+b);
                
        }
}
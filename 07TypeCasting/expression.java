package TypeCasting;
import java.util.*;

public class expression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //implicit typecasting
        System.out.println("Enter a number");
        byte num=sc.nextByte();
        short s=num;
        char c=(char)s;
        int i=c;
        long l=i;
        float f=l;
        double d=f;
        System.out.println(num+" "+s+" "+c+" "+i+" "+l+" "+f+" "+d);

        //explicit typecasting
        System.out.println("Enter a double value");
        double dou=sc.nextDouble();
        float fl=(float)dou;
        long lo=(long)fl;
        int in=(int)lo;
        char ch=(char)in;
        short so=(short)ch;
        byte by=(byte)so;
        System.out.println(dou+" "+fl+" "+lo+" "+in+" "+ch+" "+so+" "+by);

        sc.close();
     

    }
    
}

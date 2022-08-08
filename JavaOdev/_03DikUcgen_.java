package JavaOdev;
import java.util.Scanner;

public class _03DikUcgen_ {
    public static void main(String[] args) {

        int a,b,c;
       double sonuc;




        Scanner dikUcgen=new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        a=dikUcgen.nextInt();
        System.out.print("b kenarını giriniz: ");
        b=dikUcgen.nextInt();
        System.out.print("c kenarını giriniz: ");
        c=dikUcgen.nextInt();
        double u=(a+b+c)/2;
        double cevre=(2*u);
        double alan;
        alan= Math.sqrt(u * (u-a)* (u-b) * (u-c));
        System.out.println("-----------------------\nÇevre: "+cevre);
        System.out.println("-----------------------\nAlan: "+alan);


        sonuc=Math.sqrt((a*a)+(b*b));

        System.out.println("-----------------------\nHipotenüs:"+sonuc);
    }
}

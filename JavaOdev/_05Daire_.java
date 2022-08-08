package JavaOdev;


import java.util.*;
public class _05Daire_ {

    public static void main(String[] args) {

        double pi=3.14;

        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yaricapini giriniz: ");
        int r=input.nextInt();

        System.out.print("Merkez acisinin olcusunu giriniz: ");
        double a=input.nextDouble();

        double alan= pi * r * r;
        double cevre= 2 * pi * r;
        
        double merkezAlan=(pi * (r*r) * a) / 360;

        System.out.println("--->Alan:"+alan + "\n--->Cevre :" + cevre + "\n--->Daire Diliminin Alani : "+merkezAlan);


    }
}

package JavaOdev;
import java.util.Scanner;
public class _07Kasa_ {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double sonuc,armut=2.14,elma=3.67,domates=1.11,patlican=5,muz=0.95;
        System.out.print("Armut Kaç Kilo :");
        int a=input.nextInt();

        System.out.print("Elma Kaç Kilo :");

        int e=input.nextInt();

        System.out.print("Domates Kaç Kilo :");

        int d=input.nextInt();

        System.out.print("Muz Kaç Kilo :");
        int m=input.nextInt();

        System.out.print("Patlıcan Kaç Kilo :");
        int p=input.nextInt();
        sonuc=(a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican);

        System.out.print("--------------------\nToplam Tutar: "+sonuc+" "+"TL");


    }
}

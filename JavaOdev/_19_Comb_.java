package JavaOdev;

import java.util.Scanner;

public class _21_Fakt_ {
    public static void main(String[] args) {
        int a,b;
        int total = 1;
        int total2 = 1;
        int total3 = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kombinasyon Hesaplama\n-------------------\n");
        System.out.print("1.sayi : ");
        a = scan.nextInt();
        System.out.print("2.sayi : ");
        b = scan.nextInt();
        for (int i=1; i<=a;i++) {
            total = total * i;


        }
        for (int z=1; z<=b;z++) {
            total2 = total2 * z;


        }

        if(a>b){
        for (int x=1; x<=(a-b);x++) {
            total3 = total3 * x;


        }
        }else {
            System.out.print("Lütfen eleman sayisindan (n) kucuk bir secim sayisi (r) giriniz.");
        }
      double combinasion=total/(total2*total3);
        System.out.print("Kombinasyon ("+a+","+b+"):"+combinasion);
    }
}

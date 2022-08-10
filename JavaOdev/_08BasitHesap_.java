package JavaOdev;

import java.util.Scanner;

public class _08BasitHesap_ {
    public static void main(String[] args) {
        int num;
        double sayi1,sayi2,sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("1.sayi:");
        sayi1 = input.nextDouble();

        System.out.print("2.sayi:");
        sayi2 = input.nextDouble();

        System.out.print("---------Basit Hesaplama--------\nToplama icin  1'e bas\nCikarma icin 2'e\nCarpma icin 3'e\nBolme icin 4'e");

        System.out.print("\nHangi islemi yapmak istiyorsunuz(1-2-3-4):");
        num = input.nextInt();

        switch (num) {
            case 1:
                System.out.print("\n---------------\nToplama islemini sectiniz.\n---------------\n");

                sonuc = (sayi1 + sayi2);
                System.out.println("Sonuc=" + " " + sonuc);
                break;
            case 2:
                System.out.print("\n---------------\nCikarma islemini sectiniz.\n---------------\n");
                sonuc = (sayi1 - sayi2);
                System.out.println("Sonuc=" + " " + sonuc);
                break;
            case 3:
                System.out.print("\n---------------\nCarpma islemini sectiniz.\n---------------\n");

                sonuc = (sayi1 * sayi2);
                System.out.println("Sonuc=" + " " + sonuc);
                break;
            case 4:
                System.out.print("\n---------------\nBolme islemini sectiniz.\n---------------\n");

                sonuc = (sayi1 / sayi2);
                System.out.println("Sonuc=" + " " + sonuc);
                break;
            default:
                System.out.println("Lütfen 1 ile 4 arasında işlem seçiniz.");

        }


    }
}

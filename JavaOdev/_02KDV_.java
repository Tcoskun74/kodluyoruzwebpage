package JavaOdev;
import java.util.Scanner;

public class _02KDV_ {
    public static void main(String[] args) {

        double girilenFiyat, kdvOrani, kdvTutari, kdvFiyat;
        Scanner Kdv = new Scanner(System.in);

        System.out.print("Fiyat Bilgisini giriniz: ");

        girilenFiyat= Kdv.nextDouble();
        //Girilen Fiyat 1000 TL'den düşükse kdv %18, değilse kdv %8
        kdvOrani =(girilenFiyat > 0) && (girilenFiyat < 1000) ? 0.18 : 0.08;
        //kdv tutarını hesaplama
        kdvTutari=girilenFiyat*kdvOrani;
        //kdvli fiyat hesaplama
        kdvFiyat=kdvTutari+girilenFiyat;

        System.out.println("KDV'siz Fiyat:\t"+girilenFiyat);
        System.out.println("KDV'li Fiyat:\t"+kdvFiyat);
        System.out.println("KDV Tutari:\t"+kdvTutari);
        System.out.println("KDV Orani:\t"+kdvOrani);





    }
}

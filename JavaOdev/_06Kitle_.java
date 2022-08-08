package JavaOdev;
import java.util.Scanner;

public class _06Kitle_ {

    public static void main(String[] args) {
        double boy,sonuc;

        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo=input.nextDouble();

        sonuc=kilo/(boy*boy);
        String alt=(sonuc<18.5) ? "İdeal kilonun altında" : "";
        String ideal=(sonuc>18.5 && sonuc<24.9) ? "İdeal kiloda" : "";
        String ust=(sonuc>24.9 && sonuc<29.9) ? "İdeal kilonun üstünde" : "";
        String obez=(sonuc>29.9 && sonuc<39.9) ? "İdeal kilonun çok üstünde (obez)":"";
        String mor=(sonuc>39.9 ) ? " İdeal kilonun çok üstünde (morbid obez)":"";
        System.out.println("Kitle Endeksi: "+sonuc);
        System.out.print("---------------------------------\n"+alt);
        System.out.print(ideal);
        System.out.print(ust);
        System.out.print(obez);
        System.out.print(mor+"\n---------------------------------");
    }
}

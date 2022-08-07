package JavaOdev;
import java.util.Scanner;
public class _01Not_ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int mat,fiz,kim,turk,tar,muz;
        System.out.print("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");

        fiz=input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");

        kim=input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turk=input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tar=input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muz=input.nextInt();

        double ort=(mat+fiz+kim+turk+tar+muz)/6;
        System.out.println("---------------------\nNot Ortalamanız\n---------------------");
        System.out.println("Ortalamanız:\t"+ort);
        System.out.println("---------------------\nGeçme Durumu\n---------------------");
        //Java ile Yazımı
        String str=ort>60 ? "Gectiniz" : "Kaldınız";
        System.out.println(str);
        /* //'if' ile yazım
        if(ort>60)
            System.out.print("Sınıfı Geçtiniz Tebrikler");
        else
            System.out.print("Sınıfı Tekrarı Etmelisiniz.Üzgünüm..") */
    }
}

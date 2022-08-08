package JavaOdev;
import java.util.Scanner;
public class _04Taksimetre_ {
    public static void main(String[] args) {
            int km;
            double toplam;
        Scanner gidilenMesafe=new Scanner(System.in);
        System.out.print("KM giriniz: ");
        km=gidilenMesafe.nextInt();

       toplam=(km*2.20)+10;

       toplam=toplam<20 ? 20 : toplam;
        System.out.println("Taksimetre: "+toplam);

    }
}

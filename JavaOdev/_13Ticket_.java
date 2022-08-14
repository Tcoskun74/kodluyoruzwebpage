package JavaOdev;

import java.util.Scanner;

public class _13Ticket_ {
    public static void main(String[] args) {
        int km, age, way;
        double perKm = 0.10, result;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        way = input.nextInt();

        result = km * perKm;
        if ((km >= 200 && age > 0) && (way > 0 && way < 3)) {
            if (way == 2) {
                result =(result)-((result*20)/100);
            }

            if (age < 12) {
                result = (result)-((result*50)/100);
            } else if ((age >= 12 && age <= 24)) {
                result = (result)-((result*10)/100);
            } else if (age > 65) {
                result =(result)-((result*30)/100);
            }
            System.out.println("Toplam Tutar :" + result);
        } else {
            System.out.print("Hatalı veri girdiniz.");
        }

    }
}

package JavaOdev;
import java.util.Scanner;
public class _22_UsAlma_ {
    public static void main(String[] args) {
        int a,b;
        int total=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi :");
        a= scan.nextInt();
        System.out.print("Kuvvet :");
        b= scan.nextInt();

        for (int i=1;i<=b;i++){
            total*=a;
        }
        System.out.print("Cevap : "+total);
    }
}

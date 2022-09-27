package JavaOdev;
import java.util.Scanner;
public class _20_Kuvvet_ {
    public static void main(String[] args) {
        int a;
        Scanner scan=new Scanner(System.in);
        System.out.print("Number : ");
        a= scan.nextInt();

        for (int i=1;i<=a;i*=4){

            System.out.println("4'un katlari :" + i);

        }
        System.out.println("\n-------------------");
        for (int k=1;k<=a;k*=5){
            System.out.println("5'in katlari :" + k);
        }
    }
}

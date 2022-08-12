package JavaOdev;

import java.util.Scanner;

public class _11Number_ {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the a : ");
        a = input.nextInt();
        System.out.print("Enter the b : ");
        b = input.nextInt();
        System.out.print("Enter the c: ");
        c = input.nextInt();
        if ((a > b && b > c)) {
            System.out.println("a > b > c\n" + a + " > " + b + " > " + c);
        } else if ((b > a && a > c)) {

            System.out.println("b > a > c\n" + b + " > " + a + " > " + c);

        } else if ((c > b && b > a)) {
            System.out.println("c > b > a\n" + c + " > " + b + " > " + a);
        } else if ((b > c && c > a)) {
            System.out.println("b > c > a\n" + b + " > " + c + " > " + a);
        } else if ((a > c && c > b)) {
            System.out.println("a > c > b\n" + a + " > " + c + " > " + b);
        } else {
            System.out.println("c > a > b\n" + c + " > " + a + " > " + b);
        }
    }
}

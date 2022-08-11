package JavaOdev;

import java.util.Scanner;

public class _10Heat_ {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Heat : ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Ski Evet");
        } else if (heat >= 5 && heat < 10) {
            System.out.print("Cinema Event");
        } else if (heat >= 10 && 15 >= heat) {
            System.out.print("Cinema and Picnic Events");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("Picnic");

        } else {
            System.out.print("Swimming");
        }
    }
}





package JavaOdev;

import java.util.Scanner;

public class _09Mark_ {
    public static void main(String[] args) {
        int math, physics, turkish, music;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = input.nextInt();
        System.out.print("Physics Grade: ");
        physics = input.nextInt();
        System.out.print("Turkish Grade: ");
        turkish = input.nextInt();
        System.out.print("Music Grade: ");
        music = input.nextInt();
        if ((0 <= math && math <= 100) && (0 <= physics && physics <= 100) && (0 <= turkish && turkish <= 100) && (0 <= music && music <= 100)) {
            average = (math + physics + turkish + music) / 4;
            System.out.print("Your Average =" + average);
            if (average >= 55) {
                System.out.println("\nCongratulations!You passed the class. ");
            } else {
                System.out.println("\nSorry!You didn't pass the class. ");
            }
        } else {
            System.out.println("Your grades must be between 0 and 100.");
        }

    }

}



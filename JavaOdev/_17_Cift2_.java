package JavaOdev;

import java.util.Scanner;

public class _19_Cift2_ {
    public static void main(String[] args) {
        int even;
        int total = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Number : ");
            even= scan.nextInt();
            if (even%2==0 && even%4==0){
                total+=even;
            }

        } while (even%2==0);
        System.out.println("Total Even : "+total);

    }
}

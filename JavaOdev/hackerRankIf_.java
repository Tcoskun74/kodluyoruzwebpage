import java.util.Scanner;

public class hackerRankIf_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("N : ");
        int N = scanner.nextInt();

        if (N >= 1 && N <= 100) {

            if ((N % 2 == 0) && (N >= 2 && N <= 5)) {
                System.out.print("Not Weird");

            } else if ((N % 2 == 0) && (N >= 6 && N <= 20)) {
                System.out.print("Weird");
            } else if ((N % 2 == 0) && (N > 20)) {
                System.out.print("Not Weird");


            } else {
                System.out.print("Weird");
            }
        }
    }
}


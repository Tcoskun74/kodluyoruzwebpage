package JavaOdev._13;
import java.util.Scanner;
public class _18Cift_ {
    public static void main(String[] args) {
        int k,i=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        k=input.nextInt();

        while (i<=k){
            if (i%2==0){
                System.out.print(i+",");
            }
            i++;
        }
        System.out.println("\nDöngü sona erdi.");
    }
}

package JavaOdev;
import java.util.Scanner;
public class _15Year_ {
    public static void main(String[] args) {
        int year,result,result2,result3;

        Scanner input=new Scanner(System.in);

        System.out.print("What is your year? : ");
        year= input.nextInt();;
        result=year%4;
        result2=year%400;
        result3=year%100;
        if (result==0 && result2==0){
            System.out.print(year+" "+"Artik bir yildir.");
        } else if(result==0 && result3==0){

            System.out.print(year+" "+"Artik bir yil degildir");
        } else if (result==0) {
            System.out.print(year+" "+"Artik bir yildir.");
        } else {
            System.out.print(year+" "+"Artik bir yıl degildır");
        }
    }
}

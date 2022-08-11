package JavaOdev;

import java.util.Scanner;

public class _08Veri_ {
    public static void main(String[] args) {
        String userName, password;
        String select;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Username: ");
        userName = input.nextLine();
        System.out.print("Enter the Password: ");
        password = input.nextLine();


        if (userName.equals("java") && password.equals("5555")) {
            System.out.println("Login Success");

        } else if (userName.equals("java") || password.equals("5555")) {
            System.out.println("Username Or Password is Wrong");

        } else {
            System.out.println("Username and Password is Wrong");
            System.out.print("For New Password='Yes'  Logout='Enter' = ");
            select = input.nextLine();


            switch (select) {

                case "Yes":
                    System.out.print("New Password : ");
                    password = input.nextLine();
                    if (password.equals("5555")) {
                        System.out.println("Your new password cannot be the same as your old password.");
                    } else {
                        System.out.println("Your password has been reset.");
                    }
                    break;

                default:
                    System.out.println("Logging...");
            }
        }
    }
}


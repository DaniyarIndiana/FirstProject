package Loops;

import java.util.Scanner;

public class LoginLoopsValidPaasword {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);


     /*   for (int i = 0; i <= 5; i++) {
            System.out.println("PLease enter your password:");
            String user = input.nextLine();
            String password = "secret478";

                if (user.equals(password)) {
                    System.out.println("Welcome to your profile!");
                    break;
                }
            }*/
        String password= "secret478";
        Scanner input = new Scanner(System.in);
     //   System.out.println("Enter again:");
        int attempts = 0;
        for(; ; attempts++) {
            if(attempts == 3) {
                System.out.println("Your account is locked");
                break;
            }
            System.out.println("Enter the password");

            String userPass = input.nextLine().toLowerCase();
            if(password.equals(userPass)) {
                System.out.println("Welcome to your profile");
                break;
            }
        }

    }
    }



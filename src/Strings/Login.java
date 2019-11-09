package Strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String validUser = "test";
        String validPass = "test123";

        System.out.println(" Enter your username");
        String loginUser = input.nextLine();

        System.out.println("Enter your password");
        String loginPass = input.nextLine();

        if (loginUser.equals(validUser)) {
            System.out.println("Welcome");
        }

        if (loginPass.equals(validPass)) {
            System.out.println("Welcome");
        }

     else {
            System.out.println("Invalid username");

    }




}
}

package ifElseStatments;

import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Login name:");
        ;

        String userName = "Doka";
        String password = "12345";


        String enterUsername = in.nextLine();

        if (enterUsername.equals(userName)){
            System.out.println("Enter your Login password:");
            String enteredPass = in.nextLine();
            if (enteredPass.equals(password)){
                System.out.println("Login successful");
            }
            else{
                System.out.println("Wrong password");
            }
        }

        else{
            System.out.println("invalid username! Try again");

        }


    }

}

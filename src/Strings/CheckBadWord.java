package Strings;

import java.util.Scanner;

public class CheckBadWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter message:");
        String message = input.nextLine();
        String checked = message;
        checked = checked.replace("idiot","smart");
        checked = checked.replace("dumb","smart");
        checked = checked.replace("stupid","smart");
        if(message.equalsIgnoreCase(checked)) {
            System.out.println("Your message was not changed");
            System.out.println(message);
        } else {
            System.out.println("Your bad words were removed");
            System.out.println(checked);
        }

        // if you are used this if statement method only one of them should be replaced..
     /*   if (message.contains("idiot")) {
            System.out.println(message.replace("idiot", "smart"));
        }
         if (message.contains("dumb")) {
            System.out.println(message.replace("dumb", "smart"));
        }
        else if (message.contains("stupid")) {
            System.out.println(message.replace("stupid", "smart"));
        }*/
    }
}






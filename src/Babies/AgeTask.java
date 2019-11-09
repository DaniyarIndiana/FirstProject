package Babies;

import java.util.Scanner;

public class AgeTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();

        if (age > 100 || age < 0){
            System.out.println("Invalid");
        }
        else if (age >= 30){
            System.out.println("Welcome to the building");
        }
        else {
            System.out.println("Sorry try again when you're 30");
        }
    }
}

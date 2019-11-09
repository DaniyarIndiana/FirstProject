package Babies;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2) Write a program that asks a user to enter a number corresponding to the day of the week
        // starting from 1 being Sunday, 2 being Monday, etc…
        //If the number is not between 1 and 7 print “invalid day”
        //> input: 7
        //> output: Saturday
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of week:");
        int number = input.nextInt();

        switch (number){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");






        }
    }
}

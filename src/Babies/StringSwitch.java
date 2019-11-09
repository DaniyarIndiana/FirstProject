package Babies;

import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
     /*   String fruit = "apple";

        switch (fruit){
            case "oranges":
                System.out.println("Oranges are sweet");
                break;
            case "banana":
            case "apple" :
                System.out.println("My favorite");
                break;
            default:
                System.out.println("Not a fruit");
        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("PLease Enter your letter grade:");
        char grade = input.nextLine().charAt(0);

        switch (grade){
            case 'a':
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'b':
            case 'B':
                System.out.println("Great!");
                break;
            case 'c':
            case 'C':
                System.out.println("Okay");
                break;
            case 'd':
            case 'D':
                System.out.println("You can do better");
                break;
            case 'f':
            case 'F':
                System.out.println("Something needs to change");
                break;
            default:
                System.out.println("Not a valid letter grade");


        }




    }
}

package Babies;


import java.util.Scanner;

public class SwitchTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Please enter number from 1 to 9");

       switch (number){
           case 1:
               System.out.println("One");
               break;
           case 2:
               System.out.println("Two");
               break;
           case 3:
               System.out.println("Tree");
               break;
           case 4:
               System.out.println("Four");
               break;
           case 5:
               System.out.println("Five");
           case 6:
               System.out.println("Six");
               break;
           case 7:
               System.out.println("Seven");
               break;
           case 8:
               System.out.println("Eight");
           case 9:
               System.out.println("Nine");
               break;
           default:
               System.out.println("Invalid number ");


       }

    }
}

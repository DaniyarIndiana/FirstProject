package TeamTaskPartONe;

import java.util.Scanner;

//Task 1
//Write a program that determines the change to be dispensed from a vending
//machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
//increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
//dollar bill to pay for the item.
//
//See the example output as shown below:
//Input:
//Enter price in cents: 95↵
//Output:
//Your change is 0 quarters, 0 dimes, and 1 nickels.
public class TeamTaskPartOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //==============================================
        // Task 1
        int price=0;
        int quarter=0;
        int dime = 0;
        int nickle=0;

        System.out.println("Enter price in cents:");
        price = input.nextInt();

        int left = 0;
        left = 100 - price;
        quarter = left / 25;
        int reminder = left % 25;
        dime = reminder / 10;
        int reminder2 = reminder % 10;
        nickle = reminder2 / 5;













        System.out.println("Your change is "+quarter+" quarters, "+dime+" dimes, and "+nickle+" nickels.");


    }
}

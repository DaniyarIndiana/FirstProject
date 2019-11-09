package ifElseStatments;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 integers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();

        int evens =0;
        int odds= 0;


        if (a % 2 == 0) {  // 1.
            evens++;
        }
        else {
            odds++;
        }

        if (b % 2 == 0) {  // 1.
            evens++;
        }
        else {
            odds++;
        }


        if (c % 2 == 0) {  // 1.
            evens++;
        }
        else {
            odds++;
        }


        if (d % 2 == 0) {  // 1.
            evens++;
        }
        else {
            odds++;
        }


        if (e % 2 == 0) {  // 1.
            evens++;
        }
        else {
            odds++;
        }

        System.out.println("How many evens:" + evens);
        System.out.println("How many odds:" + odds);
    }
}
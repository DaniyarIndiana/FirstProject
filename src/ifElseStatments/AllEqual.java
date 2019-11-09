package ifElseStatments;

import java.util.Scanner;

public class AllEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 number integer:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c= input.nextInt();

        if ( a > b && a > c){
            System.out.println("Max number is:" + a);

        }
        else if (b > a && b > c){
            System.out.println("Max number is:"+ b);

        }
        else if (c > a && c > b){
            System.out.println("Max number is:"+ c);

        }
        else if (a == b && a == c){
            System.out.println("All numbers are equal");
        }

    }
}

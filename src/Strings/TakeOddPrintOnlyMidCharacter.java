package Strings;

import java.util.Scanner;

public class TakeOddPrintOnlyMidCharacter {
    public static void main(String[] args) {
        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        int num = n1.length();

        if (num >= 3 && num %2 == 1){
            n1= n1.substring(num/2,num/2+1);
            System.out.println(n1);
        }
        else {
            System.out.println();
        }

    }
}

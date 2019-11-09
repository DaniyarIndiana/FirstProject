package Strings;

import java.util.Scanner;

public class ComparingToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two word:");
        String one = input.nextLine();
     //   System.out.println("Enter second word:");
        String two = input.nextLine();
      //  System.out.println(one.compareTo(two));
        int compare = one.compareTo(two);
        System.out.println(compare);
    }
}

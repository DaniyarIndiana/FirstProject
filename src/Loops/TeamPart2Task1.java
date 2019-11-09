package Loops;

import java.util.Scanner;

public class TeamPart2Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str2 = input.nextLine();

        //your code here
        //----------------------------------------------------------

        if (str2.length() <= 3 || str2.length() > 100) {
            System.out.println("Invalid enter");
        }
        else if (str2.length()%2 == 1) {
            String str = str2.toLowerCase();
            int indexOfMiddle = str.length()/2;
            String part1 = str.substring(0,indexOfMiddle);
            String part2 = str.substring(indexOfMiddle,(indexOfMiddle + 1));
            String part2Upper = part2.toUpperCase();
            String part3 = str.substring(indexOfMiddle + 1);
            System.out.println(part1 + part2Upper + part3);
        }
        else if (str2.length()%2 == 0) {
            String str = str2.toLowerCase();
            int indexOfMiddle = str.length()/2;
            String part1 = str.substring(0,indexOfMiddle - 1);
//            System.out.println(part1);
            String part2 = str.substring(indexOfMiddle - 1,(indexOfMiddle + 1));
//            System.out.println(part2);
            String part2Upper = part2.toUpperCase();
            String part3 = str.substring(indexOfMiddle + 1);
//            System.out.println(part3);
            System.out.println(part1 + part2Upper + part3);
        }


    }
}

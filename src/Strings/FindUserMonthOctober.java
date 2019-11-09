package Strings;

import java.util.Scanner;

public class FindUserMonthOctober {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String month = "October";
      //  String ignore = month.equalsIgnoreCase();
       System.out.println("Enter the month");
       String user = input.nextLine();
       boolean check = user.equalsIgnoreCase(month);
        System.out.println(check);

    }
}

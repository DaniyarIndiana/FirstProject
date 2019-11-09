package SwitchStatement;

import java.util.Scanner;

public class NumberToday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter week number:");
        int day = in.nextInt();
        String dayString = "";
        boolean valid = true;

        switch (day){
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thurday";
                break;
            case 6:
                dayString = "Friday";
                break;
            case 7:
                dayString = "Saturday";
                break;
            default:
                System.out.println("Invalid day number");
                valid = false;


        }
        if (valid){
            System.out.println(day + "is " + dayString);
        }

    }
}

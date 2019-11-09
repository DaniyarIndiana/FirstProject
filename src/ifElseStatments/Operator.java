package ifElseStatments;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter two doubles: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.nextLine();

        System.out.println("Choose operator from *, -, +, /");
        String operator = in.nextLine();

        if (operator.equals("*")){
            System.out.println("Result of " + a + operator + b + " is " + (a * b));
        }

       else if (operator.equals("-")){
            System.out.println("Result of " + a + operator + b + " is " + (a - b));
        }

       else if (operator.equals("+")){
            System.out.println("Result of " + a + operator + b + " is " + (a + b));
        }

       else if (operator.equals("/")){
            System.out.println("Result of " + a + operator + b + " is " + (a / b));
        }





    }

    }


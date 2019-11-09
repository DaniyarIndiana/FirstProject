package Babies;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one:");
        double number = input.nextDouble();
        System.out.println("Enter number two:");
        double number2 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the operator:");
        String operator = input.next();
        double result = 0;
        boolean valid = true;
        switch (operator){
            case "+":
                result = number + number2;
                break;
            case "-":
                result = number - number2;
                break;
            case "*":
                result = number * number2;
                break;
            case "/":
                result = number / number2;
                break;
            case "%":
                result = number % number2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        if (valid){
            System.out.println(number + operator + number2 + " = " + result);
        }
    }
}

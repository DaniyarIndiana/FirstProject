package ifElseStatments;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your BMI:");
        double mass = input.nextDouble();
        double height = input.nextDouble();
        double bmi = mass / (height*height);

        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi>=18.5 && bmi < 25){
            System.out.println("Normal weight");
        }
        else if (bmi >= 25 && bmi <30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }



    }
}

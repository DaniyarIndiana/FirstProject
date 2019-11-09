package TeamTaskPartONe;

import java.util.Scanner;

public class AskYorNAndOutNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int userInput = 0;
        String answer = "";
        do {
            System.out.println("Enter the number : ");
            userInput = input.nextInt();
            input.nextLine();
            System.out.println("Do you want to continue y/n?");
            answer = input.nextLine();
            if (answer.equals("y")) {
                if(userInput > 0) {
                    positive ++;
                }
                else if (userInput < 0) {
                    negative ++;
                }
                else {
                    zero++;
                }
            }
        }while (answer.equals("y"));

        System.out.println("Positive numbers:"+positive);
        System.out.println("Negative numbers:"+negative);
        System.out.println("Zero numbers:"+zero);

    }
}

package TeamTaskPartONe;

import java.util.Scanner;
//
public class ASCIITableOutputNumbersOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str1 = input.next();
        String numbers = "";
        if (str1.length() < 3 || str1.length() > 100) {
            System.out.println("Invalid number");
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) >= 48 && str1.charAt(i) <= 57) {
                    numbers += str1.charAt(i);
                }
            }
            System.out.println(numbers);
        }



    }
}

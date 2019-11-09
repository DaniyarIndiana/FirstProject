package Loops;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class ChangeFirstLetterLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter the word:");
        String word = input.nextLine();
        String rev = "";
        for (int i = word.length()-1; i >=0; i--) {
            rev +=word.charAt(i);
        }
        System.out.println(rev);
    }
}

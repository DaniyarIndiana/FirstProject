package Strings;

import java.util.Scanner;

public class TakeLengthMakeChangeOutput {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word = input.nextLine();
        String word2 = input.nextLine();
        String email = "";

        if (word.length() >= 6 && word2.length() >= 6) {
            email = word.substring(0,4).toLowerCase();// first word index take 0-4 characters
            email += word2.substring(word2.length()-3);// and then take second word and took last 3 index(characters)
            email += "@cybertek.com";
            System.out.println(email);
        } else {
            System.out.println("Invalid data");
        }
    }// input:Daniyar Nanbayev output: daniyev@cybertek

}
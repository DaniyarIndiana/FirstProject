package Strings;

import java.util.Scanner;

public class TakeTwoWordsSubstringINdexOf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String enteredByUser = input.nextLine();
        int indexOfSpace = enteredByUser.indexOf(" ");
        String word1 = enteredByUser.substring(0,indexOfSpace);
        String word2 = enteredByUser.substring(indexOfSpace+1);
        System.out.println("entered by user " + enteredByUser);
        System.out.println("word1 " + word1);
        System.out.println("word2 " + word2);
      //  String firstWord1 = word1.substring(0,1).toUpperCase();
        //String secondWord2 = word2.substring(0,1).toUpperCase();

       // String takeafirstCaracter= word1.substring(1);
      //  String takeSecondChar= word2.substring(1);
       // System.out.println(takeafirstCaracter + takeSecondChar);
     //
    }
}

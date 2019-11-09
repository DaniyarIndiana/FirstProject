package Strings;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        String sentence = " We will have a picnic when the weather gets nicer";
        System.out.println(sentence);
        System.out.println("What do you want to change?");
        Scanner input = new Scanner(System.in);
        String sentence2 = input.nextLine();
        System.out.println("What do you want to change that to?");
        String replace = input.nextLine();
        String newWord = sentence.replace(sentence2,replace);
    }
}



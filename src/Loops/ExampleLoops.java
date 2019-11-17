package Loops;

import java.util.Scanner;

public class ExampleLoops {
    public static void main(String[] args) {
//        String word = "Cybertek";
//        for(int i = 0; i < word.length(); i++){
//            System.out.println(word.charAt(i) + " " + i);
//          //  System.out.println();
        Scanner input = new Scanner(System.in);


        // TASK 1

        System.out.println("Enter word:");
        String str = input.nextLine().toLowerCase();

        String checker = "";

        int count;

        for (int i = 0; i < str.length(); i++) {
            count = 0;
            if (!checker.contains(str.charAt(i) + "")) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }

                }
                System.out.println(str.charAt(i) + ":" + count);
                checker += str.charAt(i);
            }


        }
    }
}


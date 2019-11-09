package Babies;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberRandom = random.nextInt(10);
        numberRandom++;
        System.out.println("Enter guess number from 1 to 10 ");
        Scanner input = new Scanner(System.in);
        int guessNumber = input.nextInt();
       if (numberRandom==guessNumber){
           System.out.println("Congrats you guess number!");
       }
       else if (numberRandom<guessNumber){
           System.out.println("Your guess is too high");
       }
       else if (numberRandom>guessNumber){
           System.out.println("Your guess is too low");
       }



    }
}

package WhileLoops;

import java.util.Scanner;

public class TaskAskUserNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int start = 0;
        while(start <= num){
            System.out.println(start++);

        }


       }
    }


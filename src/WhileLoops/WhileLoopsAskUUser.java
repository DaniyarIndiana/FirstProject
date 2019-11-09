package WhileLoops;

import java.util.Scanner;

public class WhileLoopsAskUUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        while(name.startsWith("d")){
            System.out.println("Enter your name");
            name = input.nextLine();
        }
    }
}

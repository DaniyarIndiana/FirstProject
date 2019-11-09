package WhileLoops;

import java.util.Scanner;

public class EnterAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter address:");
        String address = input.nextLine();
        int count = 0;
        while (address.contains("il")){
            count++;

            System.out.println("enter address:");
            address = input.nextLine();
        }
        System.out.println(count);
    }
}

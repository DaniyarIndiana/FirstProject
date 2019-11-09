package CodingBatTaskExample;

import java.util.Scanner;

public class ReplaceEachCharacterInWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int n = input.nextInt();
        String result = "";
        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        System.out.println(result);
    }
}
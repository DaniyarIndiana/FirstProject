package Strings;

import java.util.Scanner;

public class ConvertStringToInt {
    public static void main(String[] args) {
        /*String word = "Guys smart";

        System.out.println(word.indexOf("t"));*/

        Scanner input = new Scanner(System.in);
        String str = input.nextLine(); //"I am x years old"
        int am = str.indexOf("am") + 3;
        int years= str.indexOf("years");
        String age= str.substring(am,years-1);
        int ageNUm = Integer.valueOf(age);
        ageNUm +=5;
        System.out.println("IN 5 years you will be" + ageNUm);
    }
}

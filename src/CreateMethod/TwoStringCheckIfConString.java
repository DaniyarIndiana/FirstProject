package CreateMethod;

import java.util.Scanner;

public class TwoStringCheckIfConString {
    public static void main(String[] args) {
        twoString("Doka","D ");
//Write a method that takes two Strings. Check if the second String is found inside of the first String.
// If it does, remove that part from the String,
// but if the second String is not in the first String ask the user to enter another String to try again.
    }

    public static void twoString (String first,String second){
        if (first.contains(second)){
            first = first.replace(second,"");
            System.out.println(first.trim());
        }else{
            System.out.println("Try again");
            Scanner input = new Scanner(System.in);
            String again =input.nextLine();
            if(second.contains(again)){
                second = second.replace(again,"");
            }else{
                System.out.println("Out of tries");
            }
        }
    }
}

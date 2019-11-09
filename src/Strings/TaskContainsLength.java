package Strings;

import java.util.Scanner;

public class TaskContainsLength {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter: ");

        String n = input.next();



            /*Given an String, n , perform the following conditional actions:
            If  n contains a and length less than 5, print A Perfect,
 If n contains b, a and length between 7 and 10 (both inclusive) print  B Perfect,
  if not between range and not included a then print Perfect,
  if a included and not between the range, print empty (System.out.println("");
            If none of them the print Sorry
            */
            if (n.contains("a") && n.length()<5){
                System.out.println("A Perfect");
        }else if (n.contains("b") && n.contains("a") && n.length() == 7){
            System.out.println("B Perfect");
        }
        if (n.length() !=7 && n.length() !=10 && !n.contains("a")){
            System.out.println("Perfect");
        } if (n.contains("a") && n.length() != 10 && n.length() !=7){
            System.out.println("");
        } else{
            System.out.println("Sorry");
        }

    }
}

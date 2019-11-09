package Strings;

import java.util.Scanner;
//Ask user to enter a word. If the first or second or both letter of the word is x,
// print the word without x(s). If x is the third letter it should be printed.
// If the first and second are x, both should be ignored.
//
//
//Input:
//xxode
//
//Output:
//ode
public class IfWordStartWithXXnotprint {
    public static void main(String[] args) {
        System.out.println("Please enter word:");
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();


        if (n1.startsWith("xx")){
            n1 = n1.substring(2);
            System.out.println(n1);
        }
        else if (n1.startsWith("x")){
            n1 = n1.substring(1);
            System.out.println(n1);
        }
        else if (n1.indexOf("x")==1){
            n1 = n1.substring(0,1) + n1.substring(2);
            System.out.println(n1);
        }
        else{
            System.out.println(n1);
        }
    }


    }


package scanners.Batch14;

import java.util.Scanner;

public class Data {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double result = 0.0;
        for(int i = 1; i<=number;i++){
            result = result+(1/i);
        }
        System.out.println(result);

      /*  String mane = "James";
        String lastName = "Bond";
        int age = 45;
        String location = "London, UK";
        boolean isHeOk = true; */

    /*    Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = input.nextLine();
        System.out.println("Welcome, " + firstName + "I");
        System.out.println("Where are you from " + firstName + "?");
        String fistName = input.nextLine();
        System.out.println("How old are you " + firstName + "?");
        int age = input.nextInt();
        System.out.println(age + " age is fun!!!");*/

      /*  Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println(" What is your Gender? " + name);
        char gender = input.nextLine().charAt(0);
        System.out.println("What is your age? " + name);
        int age = input.nextInt();
        System.out.println("What is your phone number? "+ name);
        long phoneNumber = input.nextLong();
        System.out.println("what is your GPA? " + name);
        double gpa = input.nextDouble();
        System.out.println("Great you all set!");*/



/*
      int one = input.nextInt();
      int two = input.nextInt();
      int count = 0;
       one += two;
       count++;

       System.out.println("Your number is: " + one + " after being incremented by " + two + " " + count + " time");
        one += two;
        count++;

        System.out.println("Your number is: " + one + " after being incremented by " + two + " " + count + " time");
        one += two;
        count++;

        System.out.println("Your number is: " + one + " after being incremented by " + two + " " + count + " time");
*/
   /*  int one = input.nextInt();
     int two  = input.nextInt();


    boolean b = one > two;
        System.out.println(b);

boolean check = input.nextBoolean();
        System.out.println(!check);
        System.out.println();*/


    /*    char One = input.nextLine().charAt(0);
        char Two  = input.nextLine().charAt(0);
        boolean b = One > Two;
        System.out.println(b);*/

   /* int numberOne = input.nextInt();
    int numberTwo = input.nextInt();
        System.out.println(numberOne!=numberTwo);*/

  /* double a = input.nextDouble();
   double b = input.nextDouble();

        System.out.println("Plus: " + (a + b));
        System.out.println("Minus: " + (a - b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Reminder: " + (a % b));
*/
 /* int change, remain, quarters, dimes, nickels, pennies;
        System.out.println("Enter your change ");
        change = input.nextInt();
        remain = change;

        quarters = change / 25;
        remain = remain % 25;

        dimes = remain / 10;
        int remain2 = remain % 10;

        nickels = remain2 / 5;
        int remain3 = remain2 % 5;

        pennies = remain3;

        System.out.println("Your change of " + change + " was converted to ");
        System.out.println("Quarter " + quarters);
        System.out.println("Dimes " + dimes);
        System.out.println("Nickles " + nickels);
        System.out.println("Pennies "+ pennies);*/

//String txt = "Hello";
//String tnt = "World";
//        System.out.println(txt + " " + tnt);



    }
}

package Babies;
import java.util.Scanner;

public class TaskBlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)ploto" );
        System.out.println("c)ploto is not a planet" );

        String a = s.nextLine();


        if (a.equals("b")){
            System.out.println("correct");
        }
        if (a.equals("B")){
            System.out.println("correct");
        }
        else{
            System.out.println("wrong");
        }


    }
}

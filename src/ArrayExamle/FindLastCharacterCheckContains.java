package ArrayExamle;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindLastCharacterCheckContains {
    public static void main(String[] args) {
        String [] names = {"James","Sam","Adam","Elize","Jamie","Benzema","Sandy"};

        for(int i = 0; i <names.length; i++){
            int last = names[i].length()-1;
            System.out.println(names[i].charAt(last));
        }
        for(int i = 0; i<names.length; i++){
            if(names[i].toLowerCase().endsWith("s"));
            System.out.println(names[i]);

        }
        System.out.println();
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String user = input.nextLine();
        for(int i=0; i < names.length; i++) {
            if(names[i].toLowerCase().contains(user)) {
                System.out.println(names[i]);
            }
        }

    }

}

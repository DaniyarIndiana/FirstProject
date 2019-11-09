package CodingBatTaskExample;

import java.util.Scanner;

public class AddedFirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        for(int i = 0; i <words.length; i++){
            String first = words[i].substring(0,1);
            String last = words[i].substring(words[i].length()-1);
            System.out.println(first+last);

        }


    }
}

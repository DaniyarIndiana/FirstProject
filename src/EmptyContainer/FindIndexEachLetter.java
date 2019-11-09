package EmptyContainer;

import java.util.Scanner;

public class FindIndexEachLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter word:");
        String str = input.next().toLowerCase();

        String checker = "";
        String helper= "";
        int count=0;

        for(int i = 0; i < str.length(); i++){
                                        //Output:
                                                  //  a:1 p:2 l:1 e:1
            helper=str.charAt(i)+"";
            if(!checker.contains(helper)){
                checker=checker+helper.charAt(i);
            }
            for(int j = 0; j < str.charAt(i); j++){
                count++;
            }

        }
        System.out.println( helper+":"+count);

    }
}

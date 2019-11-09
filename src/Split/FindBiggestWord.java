package Split;

public class FindBiggestWord {
    public static void main(String[] args) {
        String str = "write a program that creates a group of given size thisisabigword";
        String [] arr = str.trim().split(" ");
        int biggestLength = 0;//just make container for number and start from 0 because index always starts 0
        String biggestWord = "";
        for(String word : arr) {//why are you do this statement
            if(word.length() > biggestLength) {
                biggestLength = word.length();
                biggestWord = word;
            }
        }
        System.out.println(biggestWord);

    }
}

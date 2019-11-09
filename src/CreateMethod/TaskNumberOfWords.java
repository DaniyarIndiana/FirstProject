package CreateMethod;

public class TaskNumberOfWords {
    public static void main(String[] args) {
      countWords("Doka is smart");
    }
    public static void countWords(String str){
        String [] arr = str.trim().split(" ");
        System.out.println("The number of words in the sentence is " +arr.length);
        }
    }


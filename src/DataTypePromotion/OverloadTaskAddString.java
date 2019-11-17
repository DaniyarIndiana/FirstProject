package DataTypePromotion;

public class OverloadTaskAddString {
    public static void main(String[] args) {

    }

    public static String[] increaseArray(String[] arr, String word, int index) {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0, j = 0; j < newArray.length; j++) {
            if (index == j) {
                newArray[j] = word;
            } else {
                newArray[j] = arr[i];
                i++;
            }

        }

        return newArray;
    }

    public static String[] increaseArray(String[] arr, String word) {
        String[] newArray = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = word;
        return newArray;
    }
    public static void firstString (String character){
        System.out.println(character.charAt(0));

    }
    public static void secondString (String character2,int index){
        System.out.println(index);
    }
    public static int printString (String str,int indexOne, int indexTwo){
        return str.substring(indexOne,indexTwo).length();
    }
}

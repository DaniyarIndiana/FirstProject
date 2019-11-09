package Method;

import java.util.Arrays;

public class ArrayAddedCharacter {
    public static void main(String[] args) {
        String[]arr ={"a","e","i","o"};

        System.out.println(Arrays.toString(increaseArray(arr,"u")));
    }
    public static String[] increaseArray(String[]arr,String word ){
        String [] newArray= new String[arr.length+1];
        for(int i = 0; i<arr.length; i++){
            newArray[i]=arr[i];
        }
        newArray[newArray.length-1]=word;
        return  newArray;

    }
}

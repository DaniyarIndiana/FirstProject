package ArrayExamle;

import java.util.Arrays;

public class ArraysString {
    public static void main(String[] args) {
        String [] names = new String[3];
        System.out.println(Arrays.toString(names));// first is empty out print
        names[0] = "James";
        names[1] = "Bobby";
        names[2] = "Nemo";
        System.out.println(Arrays.toString(names));
        System.out.println(names[1].charAt(0));//give a first string character  "B";
        for (int i = 0; i<names.length; i++){
            System.out.println("Names " + (i+1) + " is " + names[i]);
        }
    }
}

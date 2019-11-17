package VarargsMethod;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleVarargsMethod {
    public static void main(String[] args) {
//        maxNumber(3,45,54,54,6,6);
//    }
//    public static void maxNumber(int ... arr){
//        Arrays.sort(arr);
//        System.out.println("The biggest number is " + arr[arr.length-1]);
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        for(int i = 0; i <words.length; i++){
            String first = words[i].substring(0,1);
            String last = words[i].substring(words[i].length()-1);
            String result = first+last;
String [] total = result.split("");
            System.out.print(Arrays.toString(total));
        }


    }

}


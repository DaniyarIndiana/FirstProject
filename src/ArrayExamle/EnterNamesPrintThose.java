package ArrayExamle;

import java.util.Arrays;
import java.util.Random;

//6) Create an array with 50 random numbers in the range of 1-100. Then print the array
public class EnterNamesPrintThose {
    public static void main(String[] args) {
       Random random = new Random();
     //   Random[] random = new Random[50];
       int [] arr = new int[50];
       for(int i = 0; i < arr.length; i++){
           int num = random.nextInt(100)+1;
           arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));

    }
}

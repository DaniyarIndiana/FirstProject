package ArrayExamle;

import java.util.Arrays;

public class TakeEvenNumber {
    public static void main(String[] args) {
        int[] number = {1,2,-3,4,-34,55,78,90,33,10};
        int count = 0;
        for(int i = 0; i<number.length; i++){
            if(number[i]%2==0){
                count++;
             //   System.out.println(i);
            }
        }
        int [] evenNumbers = new int[count];

        for(int i = 0, j=0; i <number.length; i++){
            if(number[i]%2==0){
                evenNumbers[i] =number[i];
                j++;
          //      System.out.println(Arrays.toString(evenNumbers));
            }
            System.out.println(Arrays.toString(evenNumbers));
        }
      //  System.out.println(Arrays.toString(evenNumbers));

    }
}

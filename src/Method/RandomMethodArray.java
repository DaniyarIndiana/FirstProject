package Method;

import java.util.Arrays;
import java.util.Random;

public class RandomMethodArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array(5,10)));
    }

    public static int [] array(int size, int bound) {
        int [] arr = new int[size];
        Random random = new Random();
        for(int i = 0; i < size; i++){
            int ran = random.nextInt(bound)+1;
            arr[i]= ran;
        }
        return arr;





    }
}
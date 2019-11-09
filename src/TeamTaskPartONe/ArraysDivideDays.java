package TeamTaskPartONe;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDivideDays {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        System.out.println("Day 0 " + Arrays.toString(inhabitants));
        int day = 1;
        int sum = 0;
        for (int j = 0; j < inhabitants.length; j++) {
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                sum+=inhabitants[i];
            }
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;
            if(sum == 0){
                System.out.println("---- EXTINCT ----");
                break;
            }
            sum = 0;
        }
         }
        }






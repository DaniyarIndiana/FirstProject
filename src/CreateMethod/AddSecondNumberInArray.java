package CreateMethod;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;

public class AddSecondNumberInArray {
    public static void main(String[] args) {
addNumToString("98787464",1);
    }

    public static void addNumToString(String number,int add) {
        String[]nums = number.split("");
        int [] intArray = new int [nums.length];
       for(int i =  0; i < nums.length; i++){
           intArray[i]= Integer.valueOf(nums[i])+add;
       }
        System.out.println(Arrays.toString(intArray));
        }
    }

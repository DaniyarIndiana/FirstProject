package ArrayExamle;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CheckDotsInEmailArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cars: ");
        int size = input.nextInt(); // we are take a size from user
        input.nextLine();//and break the line
        String [] myCars = new String[size];//and then created arrays string //you arrays should be contains user size
        for(int i= 0; i < myCars.length; i++) {//and then my arrays going to circle
            System.out.println("Enter car " + (i+1));//i used in this case like add 1 for counting
            String car = input.nextLine();//and then after user ask entering ,created contains for that
            myCars[i] = car;//so my cars into circle equal to entered car
        }
        System.out.println(Arrays.toString(myCars));//and then make condition to check Arrays.toString


    }




    }


package Loops;

public class SkipNUmber3 {
    public static void main(String[] args) {
    /*   /// int number = 3;
        for (int i = 0; i <=50; i++){
           if(i % 10 == 3){
continue;
           }
           /* if (i == 3){
                System.out.println(i);
                break;
            System.out.println(i);*/
        for(int i=0; i <= 50; i++) {
            String temp = i + "";
            if(temp.endsWith("3")) {
                continue;
            }
            System.out.println(i);
        }


    }

        }



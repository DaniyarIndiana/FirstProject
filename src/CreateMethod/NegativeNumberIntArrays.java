package CreateMethod;

public class NegativeNumberIntArrays {
    public static  void main(String[] args) {
       int [] arr2 = {-1,3,-4,-2,32,2,-23,1};
       negative(arr2);
    }
    public static void negative (int [] arr){
       for(int num:arr){
           if(num<0){
               System.out.println(num);
           }


        }
    }
}

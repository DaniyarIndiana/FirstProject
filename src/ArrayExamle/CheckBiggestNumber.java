package ArrayExamle;
//8) Given numbers of 3,30,14,6,50,20
//Find and print the biggest number
public class CheckBiggestNumber {
    public static void main(String[] args) {
        int[] arr= {3,30,14,6,50,20};
        int max = arr[0];
        for(int i = 1; i <arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
    }
}

package Loops;

public class FullTreeTask {
    public static void main(String[] args) {
        int n = 1;
        int numberOfRows = 4;
        for (int rows = numberOfRows; rows > 0; rows--) {
            for (int i = 1; i < rows; i++) {
                System.out.print("^");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }

            n += 2;
           // System.out.println();

        }
        for(int c = 4; c>0; c++){
            for(int b = 4; b>0; b++){
                System.out.print(" ");
            }
            for(int v =0;v<c*2-1; v++ ){
                System.out.println("*");

            }
        }
    }
}


//        int i, j, k;
//        char c = '*';
//        for (i = 1; i <=8; i++) {
//            for (j =8; j > i; j--) {
//                System.out.print("^");
 //            }
//            for (k = 0; k < (2 * i - 1); k++) {
//                System.out.print(c);
//            }
//            System.out.println();
//        }






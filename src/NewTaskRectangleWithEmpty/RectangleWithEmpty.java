package NewTaskRectangleWithEmpty;

public class RectangleWithEmpty {
    public static void main(String[] args) {
        for (int i = 0; i<=3; i++){
            for (int a = 0; a<=5; a++){
                if (i >= 1 && i <=2){
                    if (a >= 1 && a <=4){//a great then 1 or equal
                        System.out.print(" ");
                        continue;}

                }
                System.out.print("*");
            }
            System.out.print("\n");

        }

    }
}
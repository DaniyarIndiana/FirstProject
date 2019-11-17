package TeamTaskPartONe;

public class MentorsPrimeNumberTask {
    public static void main(String[] args) {
twoNumber(3,2);
    }
    public static void twoNumber(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("b "+b);
        System.out.println("a "+a);
    }

}

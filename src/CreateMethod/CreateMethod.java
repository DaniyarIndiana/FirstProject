package CreateMethod;

public class CreateMethod {
    public static void main(String[] args) {
        sayHello50();
        oddNumber();
    }

    //sayHi();
//sayBye();
//sayHi();
//    }
//    public static void sayHi(){
//        for(int i = 0; i <5; i++){
//            System.out.println("Hi");
//        }
//    }
//    public static void sayBye(){
//        System.out.println("Bye");
//    }
    public static void sayHello50() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello " + (i+1));

        }
    }

    public static void oddNumber() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd number: " + i);
            }
        }
    }
}
package CreateMethod;

public class MethodStringInt {
    public static void main(String[] args) {
       checkLength("Doka",4);
    }
    public static void checkLength (String word,int number){
        if(word.length()==number){
            System.out.println("Equal");

        }else{
            System.out.println("Not equal");
        }
    }
}

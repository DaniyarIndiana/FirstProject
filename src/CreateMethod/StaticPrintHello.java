package CreateMethod;

public class StaticPrintHello {
    public static void main(String[] args) {
printName("Doka");
printName("Jira");
firstChar("Cybertek");
goTo("Des Plaines","Schaumburg ");
email("Doka","Nan",32);
    }
    public static void printName(String name){
        System.out.println(name);
    }
    public static void firstChar(String name){
        System.out.println(name.charAt(0));
    }
    public static void goTo(String origin,String newLocation){
        System.out.println("Start " + origin);
        System.out.println("End " + newLocation);
    }
    public static void email(String first,String last,int age){
        String email = first+age+last+"@gmail.com";
        System.out.println(email);
    }
}

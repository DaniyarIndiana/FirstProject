package Method;



public class ConcatTwoString {
    public static void main(String[] args) {
        System.out.println(words("day","name"));
        System.out.println(words("day","name",3));

    }
    public static String words (String first,String second){
       // String result = first.concat(second);
        return first+second+first;
    }
    public static String words (String first,String second,int number) {

            if (number <= 0 ) {
              return "";
            }
        String word ="";
            for(int i =0; i <number; i++ ){
                word +=first;
                if(i==number-1){
                    break;
                }
                word +=second;
            }
            return word;
    }

}


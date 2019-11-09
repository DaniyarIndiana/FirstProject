package Method;

public class FirstBeginsSecondStringTrue {
    public static void main(String[] args) {
       System.out.println(checkTwoString("day","d"));
    }
    public static boolean checkTwoString (String word,String start){
return word.toLowerCase().startsWith(start.toLowerCase());

    }
    public static boolean checkTwoString (String word,String start,int times){
        int count =0;
        for(int i =0; i<word.length()-start.length()+1;i++){
            String sub = word.substring(i,i+start.length());
            if(sub.equals(start)){
                count++;
            }

        }
        if(times==count)return true;
        return false;
    }
}
